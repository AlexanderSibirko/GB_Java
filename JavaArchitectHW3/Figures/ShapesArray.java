package JavaArchitectHW3.Figures;
import java.util.ArrayList;

public class ShapesArray {
    ArrayList<Shape> content;
    
    public ShapesArray() {
        this.content = new ArrayList<>();
    }

    public void add(Shape shape) {
        content.add(shape);
    }

    public void remove(Shape shape) {
        content.remove(shape);
    }

    public String calcAllPerimetrs(){
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s %s\n", shape.description(), shape.getPerimetr()));
        }
        return sb.toString();
    }

    public String calcAllAreas(){
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s %s\n", shape.description(), shape.getArea()));
        }
        return sb.toString();
    }
}
