package project.builder;

public class Image implements ImageBase{
    private String filePath;
    private String filterType;
    private int intensity;
    private int contrast;

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @Override
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public void setContrast(int contrast) {
        this.contrast = contrast;
    }
}