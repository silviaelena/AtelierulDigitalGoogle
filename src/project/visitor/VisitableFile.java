package project.visitor;

public interface VisitableFile {
    void accept(FileVisitor visitor);
}
