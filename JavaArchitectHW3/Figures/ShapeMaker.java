package JavaArchitectHW3.Figures;

import JavaArchitectHW3.Figures.Exceptions.IllegalFigureParametrs;

public class ShapeMaker {

    //singleton
    private static ShapeMaker instance;
    private ShapeMaker(){}
    public static ShapeMaker getFactory(){
        return instance == null ? new ShapeMaker() : instance;
    }

    public Square createSquare(double side_length) throws IllegalFigureParametrs {

        return new Square(side_length);
    }

    public Rectangle createRectangle(double side_one_length, double side_two_length) throws IllegalFigureParametrs {
        return new Rectangle(side_one_length, side_two_length);
    }

    public Circle createCircle(double radius) throws IllegalFigureParametrs {
        return new Circle(radius);
    }

    public Triangle createTriangle(double side_one_length, double side_two_length, double side_three_length)
            throws IllegalFigureParametrs {
        return new Triangle(side_one_length, side_two_length, side_three_length);
    }
}
