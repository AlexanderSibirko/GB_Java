package JavaArchitectHW3;

import java.util.ArrayList;

import JavaArchitectHW3.Figures.Circle;
import JavaArchitectHW3.Figures.Rectangle;
import JavaArchitectHW3.Figures.Shapes;
import JavaArchitectHW3.Figures.Square;
import JavaArchitectHW3.Figures.Triangle;

public class Program {
    public static void main(String[] args) {
        ArrayList<Shapes> shapesArray = new ArrayList<>();

        try {
            shapesArray.add(new Circle(3));    
            shapesArray.add(new Circle(-3));    
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            shapesArray.add(new Rectangle(5,2));
            shapesArray.add(new Rectangle(-5,2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            shapesArray.add(new Rectangle(5,-2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            shapesArray.add(new Square(5));
            shapesArray.add(new Square(-5));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            shapesArray.add(new Triangle(5,3,4));
            shapesArray.add(new Triangle(5,3,9));
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (Shapes shapes : shapesArray) {
            System.out.printf("ТипФигуры: %s Площадь фигуры: %f Периметр фигуры: %f \n", shapes.description(), shapes.calcArea(), shapes.calcPerimetr());
        }
    }
}
