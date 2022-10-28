package JavaArchitectHW1.ModelElements;

public class Texture {
    private String path;
    private double opacity;

    public Texture(String path) {
        this.path = path;
        this.opacity = 0;
    }

    public double getOpacity() {
        return opacity;
    }
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

}
