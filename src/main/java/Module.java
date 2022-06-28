public enum Module {
    PYTHON(Language.PYTHON){
        @Override
        public Module nextModule() {
            return WEB;
        }
    },
    WEB(Language.WEB){
        @Override
        public Module nextModule() {
            return OOP;
        }
    },
    OOP(Language.JAVA_SE){
        @Override
        public Module nextModule() {
            return ADVANCED;
        }
    },
    ADVANCED(Language.JAVA_EE){
        @Override
        public Module nextModule() {
            return null;
        }
    };

    public Language getProgrammingLanguage() {
        return programmingLanguage;
    }

    public final Language programmingLanguage;


    Module(Language programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public abstract Module nextModule();
}
