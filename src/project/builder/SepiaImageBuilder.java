package project.builder;

public class SepiaImageBuilder implements ImageBuilder {
    private Image image;

    public SepiaImageBuilder() {
        this.image = new Image();
    }

    @Override
    public void buildFilePath(String filePath) {
        image.setFilePath(filePath);
    }

    @Override
    public void buildFilterType() {
        System.out.println("We have a sepia image!");
    }

    @Override
    public void buildIntensity() {
        image.setIntensity(30);
    }

    @Override
    public void buildContrast() {
        image.setContrast(30);
    }

    @Override
    public Image getImage() {
        return this.image;
    }
}
