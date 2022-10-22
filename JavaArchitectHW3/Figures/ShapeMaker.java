package JavaArchitectHW3.Figures;

public class ShapeMaker {

    public static Square createSquare(double side_length) throws Exception {
        if (side_length <= 0) {
            throw new Exception("Не получилось создать квадрат. Длинна стороны не может быть отрицательной");
        }
        return new Square(side_length);
    }

    public static Rectangle createRectangle(double side_one_length, double side_two_length) throws Exception {
        if (side_one_length <= 0 || side_two_length <= 0) {
            throw new Exception("Не получилось создать прямогульник. Один из размеров был отрицательны.");
        }
        return new Rectangle(side_one_length, side_two_length);
    }

    public static Circle createCircle(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Не получилось создать круг. Радиус должен быть положительным.");
        }
        return new Circle(radius);
    }

    public static Triangle createTriangle(double side_one_length, double side_two_length, double side_three_length)
            throws Exception {
        if (side_one_length <= 0 || side_two_length <= 0 || side_three_length <= 0) {
            throw new Exception("Не смог создать треугольник, одна из сторон отрицательная");
        }

        if (side_one_length + side_two_length < side_three_length
                || side_two_length + side_three_length < side_one_length
                || side_one_length + side_three_length < side_two_length) {
            throw new Exception("Не смог создать треугольник, одна из сторон больше суммы двух других");
        }
        return new Triangle(side_one_length, side_two_length, side_three_length);
    }
}
