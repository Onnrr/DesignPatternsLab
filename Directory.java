import java.util.ArrayList;

public class Directory implements Content {
    private String directoryName;
    private MemoryRepresentationStrategy strategy;
    private ArrayList<Content> content;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        content = new ArrayList<Content>();
        strategy = new SizeBasedModeling();
    }

    public void addItem(Content item) {
        content.add(item);
    }

    public void deleteItem(Content item) {
        content.remove(item);
    }

    public String applyMemoryRepresentation() {
        return strategy.execute(getInfo());
    }

    public void adjustMemoryRepresentation(MemoryRepresentationStrategy newStrategy) {
        strategy = newStrategy;
    }

    @Override
    public String getInfo() {
        String info = "- " + directoryName + "\n";
        for (Content c: content) {
            info += c.getInfo() + "\n";
        }
        info += "- " + "DIRECTORY END" + " | " + directoryName;
        return info;
    }
}
