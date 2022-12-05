public class IndentedContent extends Decorator {
    Content wrappee;
    int currentIndent;
    final String TAB = "    ";
    public IndentedContent(Content c) {
        wrappee = c;
        currentIndent = 0;
    }

    @Override
    public String getInfo() {
        String info = wrappee.getInfo();
        String[] lines = info.split("\n");
        String result = "";
        for (int i = 0; i < lines.length; i++) {
            
            if (lines[i].startsWith("- DIRECTORY END") || lines[i].startsWith("(!)")) {
                currentIndent--;
                for(int y = 0; y < currentIndent; y++) {
                    result += TAB;
                }
                result += lines[i];
                result += "\n";
            }
            else if (lines[i].startsWith("-") || lines[i].startsWith("(d)")) {
                for(int y = 0; y < currentIndent; y++) {
                    result += TAB;
                }
                result += lines[i];
                result += "\n";
                currentIndent++;
            }
            else {
                for(int y = 0; y < currentIndent; y++) {
                    result += TAB;
                }
                result += lines[i];
                result += "\n";
            }
        }
        return result;
    }
    
}
