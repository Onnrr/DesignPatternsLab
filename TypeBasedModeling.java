import java.util.ArrayList;

public class TypeBasedModeling implements MemoryRepresentationStrategy {
    int depth;
    @Override
    public String execute(String info) {
        depth = 0;
        String result = "{ ";
        String[] lines = info.split("\n");

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("- DIRECTORY END")) {
                depth--;
                result += "EOD" + depth + " ] ";
            }
            else if (lines[i].startsWith("-")) {
                result += "[D" + depth + " ";
                depth++;
            }
            else {
                result += "(F) ";
            }
        }
        result += "}";
        return result;
    }
    
}
