package project.visitor;

import java.util.HashSet;

public class BinaryImageFile extends File implements VisitableFile {
    private String resolution;

    public BinaryImageFile(String name, String size, String lastAccessedTime, String lastModifiedTime, String permissions,
                      String owner, String resolution) {
        super(name, size, lastAccessedTime, lastModifiedTime, permissions, owner);
        this.resolution = resolution;
    }

    public String getResolution() {
        return this.resolution;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
