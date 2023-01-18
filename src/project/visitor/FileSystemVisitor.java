package project.visitor;

import java.util.HashSet;
import java.util.Iterator;

public class FileSystemVisitor implements FileVisitor {
    @Override
    public void visit(TextFile textFile) {
        printBasicProperties(textFile);
        System.out.println("Printing particular properties for text file: " + textFile.getName());
        System.out.println("\tText file content is: " + textFile.getTextFileContent());
        System.out.println("End of particular properties");
    }

    @Override
    public void visit(BinaryImageFile binaryImageFile) {
        printBasicProperties(binaryImageFile);
        System.out.println("Printing particular properties for binary image file: " + binaryImageFile.getName());
        System.out.println("\tImage resolution is: " + binaryImageFile.getResolution());
        System.out.println("End of particular properties");
    }

    @Override
    public void visit(DirectoryFile directoryFile) {
        printBasicProperties(directoryFile);
        System.out.println("Printing particular properties for directory file: " + directoryFile.getName());

        System.out.println("\tText files in directory: " + directoryFile.getName());
        HashSet<TextFile> textFiles = directoryFile.getTextFiles();
        if (textFiles != null) {
            Iterator textFilesIt = textFiles.iterator();

            while (textFilesIt.hasNext()) {
                System.out.println("\t\t" + ((TextFile)textFilesIt.next()).getName());
            }
        } else {
            System.out.println("\tNo text files in directory!");
        }
        System.out.println();

        System.out.println("\tBinary image files in directory: " + directoryFile.getName());
        HashSet<BinaryImageFile> binaryImageFiles = directoryFile.getBinaryImageFiles();
        if (binaryImageFiles != null) {
            Iterator binaryImageFilesIt = binaryImageFiles.iterator();

            while (binaryImageFilesIt.hasNext()) {
                System.out.println("\t\t" + ((BinaryImageFile)binaryImageFilesIt.next()).getName());
            }
        } else {
            System.out.println("\tNo image files in current directory!");
        }
        System.out.println();

        System.out.println("\tDirectories in directory: " + directoryFile.getName());
        HashSet<DirectoryFile> directoryFiles = directoryFile.getDirectoryFiles();
        if (directoryFiles != null) {
            Iterator directoryFilesIt = directoryFiles.iterator();

            while (directoryFilesIt.hasNext()) {
                System.out.println("\t\t" + ((DirectoryFile)directoryFilesIt.next()).getName());
            }
        } else {
            System.out.println("\tNo directories in current directory!");
        }
        System.out.println("End of particular properties");
    }

    private void printBasicProperties(File file) {
        System.out.println("Printing basic properties for file: " + file.getName());
        System.out.println("\tSize: " + file.getSize());
        System.out.println("\tLast Accessed Time: " + file.getLastAccessedTime());
        System.out.println("\tLast Modified Time: " + file.getLastModifiedTime());
        System.out.println("\tPermissions: " + file.getPermissions());
        System.out.println("\tOwner: " + file.getOwner());
        System.out.println("End of basic properties");
    }
}
