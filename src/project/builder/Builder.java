package project.builder;

public class Builder {
    public static void main(String[] args) {
        ImageBuilder sepiaImageBuilder = new SepiaImageBuilder();
        PhotoEditor editor = new PhotoEditor(sepiaImageBuilder);

        editor.applyFilters("path/to/file");
        Image image = editor.getImage();
        System.out.println("Image done: " + image);
    }
}
