public class Main {
    public static void main(String[] args) {
        // PART 1
        System.out.println("------- PART 1 --------");
        System.out.println();
        // Example 1
        System.out.println("------ Example 1 ------");
        File video = new File("video", "mp4", 200);
        System.out.println(video.getInfo());
        System.out.println();
        
        // Example 2
        System.out.println("------ Example 2 ------");
        Directory documents = new Directory("MyDocuments");
        System.out.println(documents.getInfo());
        System.out.println();
        
        // Example 3
        System.out.println("------ Example 3 ------");
        Directory music = new Directory("Favorite Music");
        music.addItem(new File("MetallicaTheUnforgiven", "mp3", 100));
        System.out.println(music.getInfo());
        System.out.println();
        
        // Example 4
        System.out.println("------ Example 4 ------");
        Directory bilkent = new Directory("Bilkent Stuff");
        bilkent.addItem(new File("InternshipReport", "pdf" , 10));
        bilkent.addItem(new File("setup", "exe", 5));
        bilkent.addItem(new File("ToDoList", "docx", 15));
        bilkent.addItem(music);
        System.out.println(bilkent.getInfo());
        System.out.println();
        
        // Example 5
        System.out.println("------ Example 5 ------");
        Directory myPC = new Directory("MyPC");
        myPC.addItem(documents);
        myPC.addItem(bilkent);
        System.out.println(myPC.getInfo());
        System.out.println();

        // PART 2
        System.out.println("------- PART 2 --------");
        System.out.println();
        // Example 6
        System.out.println("------ Example 6 ------");
        System.out.println(new IndentedContent(myPC).getInfo());
        
        // Example 7
        System.out.println("------ Example 7 ------");
        System.out.println(new TypeIndicatedContent(myPC).getInfo());
    
        // Example 8
        System.out.println("------ Example 8 ------");
        System.out.println(new TypeIndicatedContent(new IndentedContent(myPC)).getInfo());
        System.out.println("------ Example 8 ------");
        System.out.println(new IndentedContent(new TypeIndicatedContent(myPC)).getInfo());
        System.out.println("------ Example 8 ------");
        System.out.println(new TypeIndicatedContent(new TypeIndicatedContent(new TypeIndicatedContent(myPC))).getInfo());
        System.out.println("------ Example 8 ------");
        System.out.println(new IndentedContent(new IndentedContent(new IndentedContent(myPC))).getInfo());

        // PART 3
        System.out.println("------- PART 3 --------");
        System.out.println();
        // Example 9
        System.out.println("------ Example 9 ------");
        myPC.adjustMemoryRepresentation(new SizeBasedModeling());
        System.out.println(myPC.applyMemoryRepresentation());

        System.out.println();

        // Example 10
        System.out.println("------ Example 10 ------");
        myPC.adjustMemoryRepresentation(new TypeBasedModeling());
        System.out.println(myPC.applyMemoryRepresentation());
    }
}