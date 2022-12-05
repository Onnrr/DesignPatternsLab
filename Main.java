import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        // Example 1
        File video = new File("video", "mp4", 200);
        System.out.println(video.getInfo());
        System.out.println();
        
        // Example 2
        Directory documents = new Directory("MyDocuments");
        documents.getInfo();
        System.out.println();

        // Example 3
        Directory music = new Directory("Favorite Music");
        music.addItem(new File("MetallicaTheUnforgiven", "mp3", 100));
        System.out.println(music.getInfo());
        System.out.println();

        // Example 4
        Directory bilkent = new Directory("Bilkent Stuff");
        bilkent.addItem(new File("InternshipReport", "pdf" , 10));
        bilkent.addItem(new File("setup", "exe", 5));
        bilkent.addItem(new File("ToDoList", "docx", 15));
        bilkent.addItem(music);
        System.out.println(bilkent.getInfo());
        System.out.println();

        // Example 5
        Directory myPC = new Directory("MyPC");
        myPC.addItem(documents);
        myPC.addItem(bilkent);
        System.out.println(myPC.getInfo());

        System.out.println(new IndentedContent(myPC).getInfo());
        System.out.println(new IndentedContent(new TypeIndicatedContent(myPC)).getInfo());

        System.out.println();
        System.out.println();

        System.out.println(myPC.applyMemoryRepresentation());
        myPC.adjustMemoryRepresentation(new TypeBasedModeling());
        System.out.println(myPC.applyMemoryRepresentation());
        
    }
}