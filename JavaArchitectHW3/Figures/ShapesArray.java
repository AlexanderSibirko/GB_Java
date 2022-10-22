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

    public String printAllPerimetrs(){
        return "";
    }

    public String calcAllPerimetrs(){ //ToDo
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s Периметр фигуры: %f \n", shape.description(), shape.calcPerimetr()));
        }
        return sb.toString();
    }

    public String calcAllAreas(){ //ToDo
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s Площадь фигуры: %f \n", shape.description(), shape.calcArea()));
        }
        return sb.toString();
    }
}
