package JavaArchitectHW3;

import JavaArchitectHW3.Figures.Makers.ShapeMaker;
import JavaArchitectHW3.Figures.Repositories.ShapesArray;

public class Program {
    public static void main(String[] args) {
        ShapesArray shapesArray = new ShapesArray();
        ShapeMaker shapeMaker = ShapeMaker.getFactory();
        try {
            shapesArray.add(shapeMaker.createCircle(3));    
            shapesArray.add(shapeMaker.createCircle(-3));    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(shapeMaker.createRectangle(5,2));
            shapesArray.add(shapeMaker.createRectangle(-5,2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(shapeMaker.createRectangle(5,-2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(shapeMaker.createSquare(5));
            shapesArray.add(shapeMaker.createSquare(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            shapesArray.add(shapeMaker.createTriangle(5,3,4));
            shapesArray.add(shapeMaker.createTriangle(5,3,9));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------\nПолучим подсчёт периметров всех фигур");
        System.out.print(shapesArray.calcAllPerimetrs());
        
        System.out.println("--------------------\nПолучим подсчёт площадей всех фигур");
        System.out.print(shapesArray.calcAllAreas());
    }
}
