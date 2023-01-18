package project.builder;

public class PhotoEditor {
    private ImageBuilder imageBuilder;

    public PhotoEditor(ImageBuilder imageBuilder) {
        this.imageBuilder = imageBuilder;
    }

    public Image getImage() {
        return this.imageBuilder.getImage();
    }

    public void applyFilters(String filePath) {
        this.imageBuilder.buildFilePath(filePath);
        this.imageBuilder.buildFilterType();
        this.imageBuilder.buildIntensity();
        this.imageBuilder.buildContrast();
    }
}
