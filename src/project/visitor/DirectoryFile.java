package project.visitor;

import org.w3c.dom.Text;

import java.util.HashSet;

public class DirectoryFile extends File implements VisitableFile {
    private HashSet<TextFile> textFiles;
    private HashSet<BinaryImageFile> binaryImageFiles;
    private HashSet<DirectoryFile> directoryFiles;


    public DirectoryFile(String name, String size, String lastAccessedTime, String lastModifiedTime, String permissions,
                         String owner, HashSet<TextFile> textFiles, HashSet<BinaryImageFile> binaryImageFiles, HashSet<DirectoryFile> directoryFiles) {
        super(name, size, lastAccessedTime, lastModifiedTime, permissions, owner);
        this.textFiles = textFiles;
        this.binaryImageFiles = binaryImageFiles;
        this.directoryFiles = directoryFiles;
    }

    public HashSet<TextFile> getTextFiles() {
        return this.textFiles;
    }

    public HashSet<BinaryImageFile> getBinaryImageFiles() {
        return this.binaryImageFiles;
    }

    public HashSet<DirectoryFile> getDirectoryFiles() {
        return this.directoryFiles;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
