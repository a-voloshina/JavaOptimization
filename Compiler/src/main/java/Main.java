import antlr4.FLanguageLexer;
import antlr4.FLanguageParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            throw new IllegalArgumentException("Program needs at least 1 args");
        }
        String inputFileName = args[0];
        String outputFileName;
        if(args.length > 1){
            outputFileName = args[1];
        } else {
            outputFileName = "examples\\output\\Main.class";
        }
        String fileAsString = readProgramFromFile(inputFileName);
        if (fileAsString != null) {
            FLanguageLexer lexer = new FLanguageLexer(CharStreams.fromString(fileAsString));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FLanguageParser parser = new FLanguageParser(tokens);
            ParseTree tree = parser.prog();
            FLanguageVisitor visitor = new FLanguageVisitor();
            visitor.visit(tree);
            String className = getClassName(outputFileName);
            if(className != null){
                visitor.setClassName(className);
            }
            byte[] bytecode = visitor.getResult();
            writeBytecodeInFile(outputFileName, bytecode);
        }
    }

    private static String getClassName(String fileName){
        String[] split = fileName.split(Pattern.quote("\\"));
        int index = split[split.length-1].indexOf(".");
        if(index == -1){
            return null;
        }
        return split[split.length-1].substring(0, index);
    }

    private static void writeBytecodeInFile(String fileName, byte[] bytecode) throws IOException {
        File output = new File(fileName);
        if (!output.exists()) {
            if (!output.createNewFile()) {
                throw new IOException();
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(bytecode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readProgramFromFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
