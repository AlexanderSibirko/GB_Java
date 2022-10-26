package JavaArchitectHW3;

import JavaArchitectHW3.Figures.ShapeMaker;
import JavaArchitectHW3.Figures.ShapesArray;

public class Program {
    public static void main(String[] args) {
        ShapesArray shapesArray = new ShapesArray();

        try {
            shapesArray.add(ShapeMaker.createCircle(3));    
            shapesArray.add(ShapeMaker.createCircle(-3));    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(ShapeMaker.createRectangle(5,2));
            shapesArray.add(ShapeMaker.createRectangle(-5,2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(ShapeMaker.createRectangle(5,-2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(ShapeMaker.createSquare(5));
            shapesArray.add(ShapeMaker.createSquare(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(ShapeMaker.createTriangle(5,3,4));
            shapesArray.add(ShapeMaker.createTriangle(5,3,9));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------\nПолучим подсчёт периметров всех фигур");
        System.out.print(shapesArray.calcAllPerimetrs());
        
        System.out.println("--------------------\nПолучим подсчёт площадей всех фигур");
        System.out.print(shapesArray.calcAllAreas());
    }
}
