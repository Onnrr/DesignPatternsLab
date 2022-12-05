public class TypeIndicatedContent extends Decorator {
    Content wrappee;

    public TypeIndicatedContent(Content c) {
        wrappee = c;
    }

    @Override
    public String getInfo() {
        String info = wrappee.getInfo();
        String[] lines = info.split("\n");
        String result = "";
        
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].trim().startsWith("- DIRECTORY END")) {
                result += "(!) " + lines[i];
            }
            else if (lines[i].trim().startsWith("-")) {
                result += "(d) " + lines[i];
            }
            else {
                result += "(f) " + lines[i];
            }
            result += "\n";
        }
        
        return result;
    }
    
}
