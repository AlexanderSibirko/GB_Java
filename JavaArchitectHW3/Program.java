package JavaArchitectHW3;

import JavaArchitectHW3.Figures.Circle;
import JavaArchitectHW3.Figures.Rectangle;
import JavaArchitectHW3.Figures.ShapeMaker;
import JavaArchitectHW3.Figures.ShapesArray;
import JavaArchitectHW3.Figures.Square;
import JavaArchitectHW3.Figures.Triangle;

public class Program {
    public static void main(String[] args) {
        ShapesArray shapesArray = new ShapesArray();

        try {
            shapesArray.add(ShapeMaker.createCircle(3));    
            shapesArray.add(ShapeMaker.createCircle(-3));    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // try {
        //     shapesArray.add(new Rectangle(5,2));
        //     shapesArray.add(new Rectangle(-5,2));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // try {
        //     shapesArray.add(new Rectangle(5,-2));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // try {
        //     shapesArray.add(new Square(5));
        //     shapesArray.add(new Square(-5));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // try {
        //     shapesArray.add(new Triangle(5,3,4));
        //     shapesArray.add(new Triangle(5,3,9));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        System.out.println("--------------------\nПолучим подсчёт периметров всех фигур");
        System.out.print(shapesArray.calcAllPerimetrs());
        
        System.out.println("--------------------\nПолучим подсчёт площадей всех фигур");
        System.out.print(shapesArray.calcAllAreas());
    }
}
