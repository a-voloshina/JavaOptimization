public class VariableInfo {
    enum Type {
        INT("int"), STRING("string"), BOOL("bool");

        private String type;

        Type(String type) {
            this.type = type;
        }

        static Type getTypeByName(String name){
            for (Type t: values()){
                if (t.type.equals(name)){
                    return t;
                }
            }
            return null;
        }
    }

    private Type type;
    private boolean initialized;

    public VariableInfo(Type type, boolean initialized) {
        this.type = type;
        this.initialized = initialized;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void initialize() {
        this.initialized = true;
    }
}
