import java.util.ArrayList;

public class SizeBasedModeling implements MemoryRepresentationStrategy {

    @Override
    public String execute(String info) {
        String result = "{ ";
        String[] lines = info.split("\n");

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("- DIRECTORY END")) {
                result += "] ";
            }
            else if (lines[i].startsWith("-")) {
                result += "[ ";
            }
            else {
                result += "(" + lines[i].substring(lines[i].indexOf("Size: ") + 6, lines[i].indexOf("kb")) + ") ";
            }
        }
        result += "}";
        return result;
    }
    
}
