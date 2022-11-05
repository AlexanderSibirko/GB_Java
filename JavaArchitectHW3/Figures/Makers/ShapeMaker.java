package JavaArchitectHW3.Figures.Makers;

import JavaArchitectHW3.Figures.Circle;
import JavaArchitectHW3.Figures.Rectangle;
import JavaArchitectHW3.Figures.Square;
import JavaArchitectHW3.Figures.Triangle;

/** simple Factory */
public class ShapeMaker {

    // singleton
    private static ShapeMaker instance;
    private ShapeMaker(){}
    public static ShapeMaker getFactory(){
        return instance == null ? new ShapeMaker() : instance;
    }

    public Square createSquare(double side_length) throws IllegalArgumentException {
        return new Square(side_length);
    }

    public Rectangle createRectangle(double side_one_length, double side_two_length) throws IllegalArgumentException {
        return new Rectangle(side_one_length, side_two_length);
    }

    public Circle createCircle(double radius) throws IllegalArgumentException {
        return new Circle(radius);
    }

    public Triangle createTriangle(double side_one_length, double side_two_length, double side_three_length)
            throws IllegalArgumentException {
        return new Triangle(side_one_length, side_two_length, side_three_length);
    }
}
