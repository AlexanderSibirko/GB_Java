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

    public Square createSquare(double sideLength) throws IllegalArgumentException {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Не получилось создать квадрат. Длинна стороны должна быть положительной.");
        }
        return new Square(sideLength);
    }

    public Rectangle createRectangle(double sideOneLength, double sideTwoLength) throws IllegalArgumentException {
        if (sideOneLength <= 0 || sideTwoLength <= 0) {
            throw new IllegalArgumentException("Не получилось создать прямогульник. Стороны должны быть положительными.");
        }
        return new Rectangle(sideOneLength, sideTwoLength);
    }

    public Circle createCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Не получилось создать круг. Радиус должен быть положительным.");
        }
        return new Circle(radius);
    }

    public Triangle createTriangle(double sideOneLength, double sideTwoLength, double sideThreeLength)
            throws IllegalArgumentException {
        if (sideOneLength <= 0 || sideTwoLength <= 0 || sideThreeLength <= 0) {
            throw new IllegalArgumentException("Не получилось создать треугольник, одна из сторон отрицательная");
        }

        if (sideOneLength + sideTwoLength < sideThreeLength
                || sideTwoLength + sideThreeLength < sideOneLength
                || sideOneLength + sideThreeLength < sideTwoLength) {
            throw new IllegalArgumentException("Не получилось создать треугольник, одна из сторон больше суммы двух других");
        }
        return new Triangle(sideOneLength, sideTwoLength, sideThreeLength);
    }
}
