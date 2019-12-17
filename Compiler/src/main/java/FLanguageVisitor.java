import antlr4.FLanguageBaseVisitor;
import antlr4.FLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.*;

import java.util.HashMap;
import java.util.Map;

import static org.objectweb.asm.ClassWriter.COMPUTE_FRAMES;
import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;
import static org.objectweb.asm.Opcodes.*;

public class FLanguageVisitor extends FLanguageBaseVisitor<Void> {

    private ClassNode classNode = new ClassNode();
    private InsnList instructions = new InsnList();

    private Map<String, VariableInfo> symbolTable = new HashMap<>();
    private Map<String, Integer> varIndexes = new HashMap<>();
    private int availableIndex = 1;

    public FLanguageVisitor() {
        classNode.access = ACC_SUPER;
        classNode.name = "Main";
        classNode.superName = "java/lang/Object";
        classNode.version = 52;
        clear();
        addPSVM();
    }

    private void clear() {
        classNode.methods.clear();
        addConstructor();
    }

    public void setClassName(String newName){
        classNode.name = newName;
    }

    private void addPSVM() {
        MethodNode main = new MethodNode(ACC_PUBLIC + ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null);
        classNode.methods.add(main);
        instructions = main.instructions;
    }

    private void addConstructor() {
        MethodNode constr = new MethodNode(0,
                "<init>",
                "()V",
                null, null);
        InsnList instrList = constr.instructions;
        instrList.add(new VarInsnNode(ALOAD, 0));
        instrList.add(new MethodInsnNode(INVOKESPECIAL,
                "java/lang/Object",
                "<init>",
                "()V",
                false));
        instrList.add(new InsnNode(RETURN));
        classNode.methods.add(constr);
    }

    private void processBinaryArithm(FLanguageParser.ArithmContext ctx) {
        switch (ctx.children.get(1).getText()) {
            case "-": {
                instructions.add(new InsnNode(ISUB));
                break;
            }
            case "+": {
                instructions.add(new InsnNode(IADD));
                break;
            }
            case "*": {
                instructions.add(new InsnNode(IMUL));
                break;
            }
            case "/": {
                instructions.add(new InsnNode(IDIV));
                break;
            }
            default:
                throw new IllegalArgumentException("arithm operation should be {-, +, *, /}");
        }
    }

    @Override
    public Void visitAddSub(FLanguageParser.AddSubContext ctx) {
        Void ret = visitChildren(ctx);
        processBinaryArithm(ctx);
        return ret;
    }

    @Override
    public Void visitMultDiv(FLanguageParser.MultDivContext ctx) {
        Void ret = visitChildren(ctx);
        processBinaryArithm(ctx);
        return ret;
    }

    @Override
    public Void visitUnaryMinus(FLanguageParser.UnaryMinusContext ctx) {
        Void ret = visitChildren(ctx);
        instructions.add(new InsnNode(INEG));
        return ret;
    }

    @Override
    public Void visitIntLiteral(FLanguageParser.IntLiteralContext ctx) {
        Void ret = visitChildren(ctx);
        instructions.add(new LdcInsnNode(Integer.valueOf(ctx.INT().getSymbol().getText())));
        return ret;
    }

    @Override
    public Void visitStringLiteral(FLanguageParser.StringLiteralContext ctx) {
        Void ret = visitChildren(ctx);
        String str = ctx.STRING().getSymbol().getText();
        instructions.add(new LdcInsnNode(str.substring(1, str.length() - 1)));
        return ret;
    }

    @Override
    public Void visitPrint(FLanguageParser.PrintContext ctx) {
        instructions.add(new FieldInsnNode(
                GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;"
        ));
        Void ret = visitChildren(ctx);
        String printExpressionType;
        if (ctx.expr != null) {
            ParseTree printExpressionContext = ctx.expr.getChild(0);
            if (printExpressionContext instanceof FLanguageParser.ArithmContext) {
                printExpressionType = "I";
            } else if (printExpressionContext instanceof FLanguageParser.LogicContext) {
                printExpressionType = "I";
            } else if (printExpressionContext instanceof FLanguageParser.StringContext) {
                printExpressionType = "Ljava/lang/String;";
            } else {
                throw new IllegalArgumentException("F language support only string, int & bool types :(");
            }
        } else if (ctx.var != null) {
            String varName = ctx.var.variable().name.getText();
            VariableInfo info = symbolTable.get(varName);
            if (info == null) throw new IllegalArgumentException("Undeclared variable " + varName);
            switch (info.getType()) {
                case INT:
                case BOOL:
                    printExpressionType = "I";
                    break;
                case STRING:
                    printExpressionType = "Ljava/lang/String;";
                    break;
                default:
                    throw new IllegalArgumentException("F language support only string, int & bool types :(");
            }
        } else throw new IllegalArgumentException("Print argument must be valid expression or variable");

        instructions.add(new MethodInsnNode(
                INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                "(" + printExpressionType + ")V",
                false
        ));
        return ret;
    }

    @Override
    public Void visitPrintVariable(FLanguageParser.PrintVariableContext ctx) {
        visitTypeVariable(ctx, symbolTable.get(ctx.var.name.getText()).getType());
        return visitChildren(ctx);
    }

    @Override
    public Void visitCmp(FLanguageParser.CmpContext ctx) {
        Void ret = visitChildren(ctx);
        LabelNode label1 = new LabelNode();
        LabelNode label2 = new LabelNode();
        int operation;
        switch (ctx.sign.getText()) {
            case ">": {
                operation = IF_ICMPGT;
                break;
            }
            case "<": {
                operation = IF_ICMPLT;
                break;
            }
            case ">=": {
                operation = IF_ICMPGE;
                break;
            }
            case "<=": {
                operation = IF_ICMPLE;
                break;
            }
            case "==": {
                operation = IF_ICMPEQ;
                break;
            }
            case "!=": {
                operation = IF_ICMPNE;
                break;
            }
            default:
                throw new IllegalArgumentException("logic operation should be one from {>, <, >=, <=, ==, !=}");
        }
        instructions.add(new JumpInsnNode(operation, label1));
        instructions.add(new InsnNode(ICONST_0));
        instructions.add(new JumpInsnNode(GOTO, label2));
        instructions.add(label1);
        instructions.add(new InsnNode(ICONST_1));
        instructions.add(label2);
        return ret;
    }

    @Override
    public Void visitStrEquals(FLanguageParser.StrEqualsContext ctx) {
        Void ret = visitChildren(ctx);
        LabelNode label1 = new LabelNode();
        LabelNode label2 = new LabelNode();
        int operation;
        switch (ctx.children.get(1).getText()) {
            case "==": {
                operation = IF_ACMPEQ;
                break;
            }
            case "!=": {
                operation = IF_ACMPNE;
                break;
            }
            default:
                throw new IllegalArgumentException("string compare operation should be one from {==, !=}");
        }
        instructions.add(new JumpInsnNode(operation, label1));
        instructions.add(new InsnNode(ICONST_0));
        instructions.add(new JumpInsnNode(GOTO, label2));
        instructions.add(label1);
        instructions.add(new InsnNode(ICONST_1));
        instructions.add(label2);
        return ret;
    }

    @Override
    public Void visitOr(FLanguageParser.OrContext ctx) {
        Void ret = visit(ctx.children.get(0));
        LabelNode label1 = new LabelNode();
        LabelNode label2 = new LabelNode();
        LabelNode labelNode3 = new LabelNode();
        instructions.add(new JumpInsnNode(IFNE, label1));
        visit(ctx.children.get(2));
        instructions.add(new JumpInsnNode(IFEQ, label2));
        instructions.add(label1);
        instructions.add(new InsnNode(ICONST_1));
        instructions.add(new JumpInsnNode(GOTO, labelNode3));
        instructions.add(label2);
        instructions.add(new InsnNode(ICONST_0));
        instructions.add(labelNode3);
        return ret;
    }

    @Override
    public Void visitAnd(FLanguageParser.AndContext ctx) {
        Void ret = visit(ctx.children.get(0));
        LabelNode label1 = new LabelNode();
        LabelNode label2 = new LabelNode();
        instructions.add(new JumpInsnNode(IFEQ, label1));
        visit(ctx.children.get(2));
        instructions.add(new JumpInsnNode(IFEQ, label1));
        instructions.add(new InsnNode(ICONST_1));
        instructions.add(new JumpInsnNode(GOTO, label2));
        instructions.add(label1);
        instructions.add(new InsnNode(ICONST_0));
        instructions.add(label2);
        return ret;
    }

    @Override
    public Void visitBoolLiteral(FLanguageParser.BoolLiteralContext ctx) {
        Void ret = visitChildren(ctx);
        String boolValue = ctx.BOOL().getSymbol().getText();
        switch (boolValue) {
            case "true": {
                instructions.add(new InsnNode(ICONST_1));
                break;
            }
            case "false": {
                instructions.add(new InsnNode(ICONST_0));
                break;
            }
            default:
                throw new IllegalArgumentException("bool should be one from {true, false}");
        }
        return ret;
    }

    @Override
    public Void visitLogEqual(FLanguageParser.LogEqualContext ctx) {
        Void ret = visitChildren(ctx);
        LabelNode label1 = new LabelNode();
        LabelNode label2 = new LabelNode();
        int operation;
        switch (ctx.children.get(1).getText()) {
            case "==": {
                operation = IF_ICMPEQ;
                break;
            }
            case "!=": {
                operation = IF_ICMPNE;
                break;
            }
            default:
                throw new IllegalArgumentException("logic operation should be one from {>, <, >=, <=, ==, !=}");
        }
        instructions.add(new JumpInsnNode(operation, label1));
        instructions.add(new InsnNode(ICONST_0));
        instructions.add(new JumpInsnNode(GOTO, label2));
        instructions.add(label1);
        instructions.add(new InsnNode(ICONST_1));
        instructions.add(label2);
        return ret;
    }

    @Override
    public Void visitIfCondition(FLanguageParser.IfConditionContext ctx) {
        Void ret = visit(ctx.condition);
        LabelNode elseLabel = new LabelNode();
        LabelNode endLabel = new LabelNode();
        instructions.add(new JumpInsnNode(IFEQ, (ctx.elseBlock != null) ? elseLabel : endLabel));
        visit(ctx.thenBlock);
        if (ctx.elseBlock != null) {
            instructions.add(new JumpInsnNode(GOTO, endLabel));
            instructions.add(elseLabel);
            visit(ctx.elseBlock);
        }
        instructions.add(endLabel);
        return ret;
    }

    @Override
    public Void visitWhileLoop(FLanguageParser.WhileLoopContext ctx) {
        LabelNode start = new LabelNode();
        instructions.add(start);
        Void ret = visit(ctx.condition);
        LabelNode out = new LabelNode();
        instructions.add(new JumpInsnNode(IFEQ, out));
        visit(ctx.body);
        instructions.add(new JumpInsnNode(GOTO, start));
        instructions.add(out);
        return ret;
    }

    @Override
    public Void visitIntVariable(FLanguageParser.IntVariableContext ctx) {
        visitTypeVariable(ctx, VariableInfo.Type.INT);
        return visitChildren(ctx);
    }

    @Override
    public Void visitBoolVariable(FLanguageParser.BoolVariableContext ctx) {
        visitTypeVariable(ctx, VariableInfo.Type.BOOL);
        return visitChildren(ctx);
    }

    @Override
    public Void visitStringVariable(FLanguageParser.StringVariableContext ctx) {
        visitTypeVariable(ctx, VariableInfo.Type.STRING);
        return visitChildren(ctx);
    }

    private void visitTypeVariable(ParserRuleContext ctx, VariableInfo.Type expVarType){
        String varName = ctx.getText();
        VariableInfo variableInfo = symbolTable.get(varName);
        VariableInfo.Type varType = variableInfo.getType();
        if (varType != expVarType) {
            throw new IllegalArgumentException("Expression type mismatch: required " +
                    varType + ", but found " + VariableInfo.Type.INT);
        }
        if (varIndexes.containsKey(varName)) {

            int opcode;
            int index = varIndexes.get(varName);
            switch (varType) {
                case INT:
                case BOOL: {
                    opcode = ILOAD;
                    break;
                }
                case STRING: {
                    opcode = ALOAD;
                    break;
                }
                default: throw new IllegalArgumentException("F language support only string, int & bool types :(");
            }
            instructions.add(new VarInsnNode(opcode, index));
            variableInfo.initialize();
        } else {
            throw new ParserException("Variable is not declared: " + varName);
        }
    }

    @Override
    public Void visitVariable(FLanguageParser.VariableContext ctx) {
        String varName = ctx.name.getText();
        if (!symbolTable.containsKey(varName)) {
            throw new ParserException("Variable is not declared: " + varName);
        }
        if (!symbolTable.get(ctx.name.getText()).isInitialized()) {
            throw new ParserException("Trying to use uninitialized: " + varName);
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitVarDeclaration(FLanguageParser.VarDeclarationContext ctx) {
        String varName = ctx.name.getText();
        if (symbolTable.containsKey(varName)) {
            throw new ParserException("Variable redefinition: " + varName);
        }
        VariableInfo.Type type = VariableInfo.Type.getTypeByName(ctx.type.getText());
        if (type == null) {
            throw new IllegalArgumentException("F language support only string, int & bool types :(");
        }
        symbolTable.put(varName, new VariableInfo(type, false));
        varIndexes.put(varName, availableIndex++);
        return visitChildren(ctx);
    }

    @Override
    public Void visitVarAssign(FLanguageParser.VarAssignContext ctx) {
        String varName = ctx.name.getText();
        if (!symbolTable.containsKey(varName)) {
            throw new ParserException("Variable is not declare: " + varName);
        }
        VariableInfo variableInfo = symbolTable.get(varName);
        VariableInfo.Type varType = variableInfo.getType();
        VariableInfo.Type exprType = recognizeVariableType(ctx.expression().getChild(0));
        if (varType != exprType) {
            throw new IllegalArgumentException("Expression type mismatch: required " + varType + ", but found " + exprType);
        }
        Void ret = visit(ctx.expression());
        storeVariable(varName, variableInfo);
        return ret;
    }

    private VariableInfo.Type recognizeVariableType(ParseTree expressionContext){
        if (expressionContext instanceof FLanguageParser.ArithmContext) {
            return VariableInfo.Type.INT;
        } else if (expressionContext instanceof FLanguageParser.LogicContext) {
            return VariableInfo.Type.BOOL;
        } else if (expressionContext instanceof FLanguageParser.StringContext) {
            return VariableInfo.Type.STRING;
        } else {
            throw new IllegalArgumentException("F language support only string, int & bool types :(");
        }
    }

    private void storeVariable(String varName, VariableInfo variableInfo){
        if (varIndexes.containsKey(varName)) {
            int opcode;
            int index = varIndexes.get(varName);
            switch (variableInfo.getType()) {
                case INT:
                case BOOL: {
                    opcode = ISTORE;
                    break;
                }
                case STRING: {
                    opcode = ASTORE;
                    break;
                }
                default:
                    throw new IllegalArgumentException("F language support only string, int & bool types :(");
            }
            instructions.add(new VarInsnNode(opcode, index));
            variableInfo.initialize();
        } else {
            throw new ParserException("Variable is not declare: " + varName);
        }
    }

    @Override
    public Void visitVarInit(FLanguageParser.VarInitContext ctx) {
        String varName = ctx.name.getText();
        if (symbolTable.containsKey(varName)) {
            throw new ParserException("Variable redefinition: " + varName);
        }
        VariableInfo.Type type = VariableInfo.Type.getTypeByName(ctx.type.getText());
        if (type == null) {
            throw new IllegalArgumentException("F language support only string, int & bool types :(");
        }
        VariableInfo variableInfo = new VariableInfo(type, true);
        symbolTable.put(varName, variableInfo);
        varIndexes.put(varName, availableIndex++);

        Void ret = visit(ctx.expression());
        storeVariable(varName, variableInfo);
        return ret;
    }

    byte[] getResult() {
        instructions.add(new InsnNode(RETURN));
        ClassWriter classWriter = new ClassWriter(COMPUTE_FRAMES | COMPUTE_MAXS);
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }
}
