package project.builder;

public class SharpenImageBuilder implements ImageBuilder {
    private Image image;

    public SharpenImageBuilder() {
        this.image = new Image();
    }

    @Override
    public void buildFilePath(String filePath) {
        image.setFilePath(filePath);
    }

    @Override
    public void buildFilterType() {
        System.out.println("We have a sharpened image!");
    }

    @Override
    public void buildIntensity() {
        image.setIntensity(20);
    }

    @Override
    public void buildContrast() {
        image.setContrast(20);
    }

    @Override
    public Image getImage() {
        return this.image;
    }
}
