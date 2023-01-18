package project.builder;

public class BlurImageBuilder implements ImageBuilder {
    private Image image;

    public BlurImageBuilder() {
        this.image = new Image();
    }

    @Override
    public void buildFilePath(String filePath) {
        image.setFilePath(filePath);
    }

    @Override
    public void buildFilterType() {
        System.out.println("We have a blurred image!");
    }

    @Override
    public void buildIntensity() {
        image.setIntensity(10);
    }

    @Override
    public void buildContrast() {
        image.setContrast(10);
    }

    @Override
    public Image getImage() {
        return this.image;
    }
}
