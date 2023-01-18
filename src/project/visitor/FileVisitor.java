package project.visitor;

interface FileVisitor {
    void visit(TextFile textFile);
    void visit(BinaryImageFile binaryImageFile);
    void visit(DirectoryFile directoryFile);
}
