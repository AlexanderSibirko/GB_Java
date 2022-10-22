package JavaArchitectHW3;

import JavaArchitectHW3.Figures.Circle;
import JavaArchitectHW3.Figures.Rectangle;
import JavaArchitectHW3.Figures.ShapesArray;
import JavaArchitectHW3.Figures.Square;
import JavaArchitectHW3.Figures.Triangle;

public class Program {
    public static void main(String[] args) {
        ShapesArray shapesArray = new ShapesArray();

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

        System.out.println("Получим подсчёт периметров всех фигур");
        System.out.print(shapesArray.calcAllPerimetrs());
        
        System.out.println("Получим подсчёт площадей всех фигур");
        System.out.print(shapesArray.calcAllAreas());
    }
}
