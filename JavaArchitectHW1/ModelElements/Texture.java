package JavaArchitectHW1.ModelElements;

import java.io.File;
import java.io.FileNotFoundException;

public class Texture {

    private String path;
    private double opacity;
    /**
     * Текстура (простейшее представление)
     * 
     * @param path    - путь к "картинке"
     * @param opacity - уровень прозрачности 0.0 - 1.0
     */
    public Texture(String path, double opacity) throws FileNotFoundException, IllegalArgumentException {
        if (opacity < 0.0 || opacity > 1.0) {
            throw new IllegalArgumentException(
                    String.format("Уровень прозрачности может быть только от 0.0 до 1.0 (заданное значение %f)",
                            opacity));
        }
        File file = new File(path);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException(
                    String.format("Файла %s не существует", path));
        }
        this.path = path;
        this.opacity = opacity;
    }

    /**
     * Текстура, полностью не прозрачная (можно поменять позже)
     * 
     * @param path - путь к "картинке"
     */
    public Texture(String path) throws FileNotFoundException, IllegalArgumentException {
        this(path, 0);
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
