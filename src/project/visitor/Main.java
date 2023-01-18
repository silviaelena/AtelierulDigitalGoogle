package project.visitor;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("text_file.txt", "5KB","Wed, 18 Jan 2023 07:28:00 GMT",
                "Mon, 16 Jan 2023 09:43:00 GMT","rw-","silvia","Hello World!");

        BinaryImageFile imageFile = new BinaryImageFile("image_file.jpg", "1.4MB","Friday, 13 Jan 2023 02:29:00 GMT",
                "Mon, 9 Jan 2023 05:21:00 GMT","r--","claudia","1920x1080");

        HashSet<TextFile> textFiles = new HashSet<>();
        HashSet<BinaryImageFile> binaryImageFiles = new HashSet<>();

        textFiles.add(textFile);
        binaryImageFiles.add(imageFile);

        DirectoryFile directoryFile = new DirectoryFile("project", "1.5MB","Wed, 18 Jan 2023 11:05:00 GMT",
                "Tue, 17 Jan 2023 03:42:00 GMT","rw-","andrei",textFiles, binaryImageFiles, null);

        FileVisitor visitor = new FileSystemVisitor();

        textFile.accept(visitor);
        System.out.println("========================================================================================");
        imageFile.accept(visitor);
        System.out.println("========================================================================================");
        directoryFile.accept(visitor);
    }
}
