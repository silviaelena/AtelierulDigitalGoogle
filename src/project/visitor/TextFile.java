package project.visitor;

public class TextFile extends File implements VisitableFile {
    private String textFileContent;

    public TextFile(String name, String size, String lastAccessedTime, String lastModifiedTime, String permissions,
                    String owner, String textFileContent) {
        super(name, size, lastAccessedTime, lastModifiedTime, permissions, owner);
        this.textFileContent = textFileContent;
    }

    public String getTextFileContent() {
        return this.textFileContent;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
