package JavaArchitectHW3.Figures.Repositories;
import java.util.ArrayList;

import JavaArchitectHW3.Figures.Shape;

public class ShapesArray {
    private ArrayList<Shape> shapes;
    
    public ShapesArray() {
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public ArrayList<Shape> getAllShapes(){
        return shapes;
    }

    public String calcAllPerimetrs(){
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(String.format("Фигура: %s %s\n", shape.description(), shape.getPerimetr()));
        }
        return sb.toString();
    }

    public String calcAllAreas(){
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(String.format("Фигура: %s %s\n", shape.description(), shape.getArea()));
        }
        return sb.toString();
    }
}
