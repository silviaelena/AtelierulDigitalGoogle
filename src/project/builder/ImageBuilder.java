package project.builder;

interface ImageBuilder {
    public void buildFilePath(String filePath);
    public void buildFilterType();
    public void buildIntensity();
    public void buildContrast();
    public Image getImage();
}
