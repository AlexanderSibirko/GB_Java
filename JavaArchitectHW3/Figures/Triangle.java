package JavaArchitectHW3.Figures;

import JavaArchitectHW3.Figures.Exceptions.IllegalFigureParametrs;

public class Triangle extends Shape{
    private double side_one_length;
    private double side_two_length;
    private double side_three_length;
    
    public Triangle(double side_one_length, double side_two_length, double side_three_length) throws IllegalFigureParametrs {
        if (side_one_length <= 0 || side_two_length <= 0 || side_three_length <= 0) {
            throw new IllegalFigureParametrs("Не смог создать треугольник, одна из сторон отрицательная");
        }

        if (side_one_length + side_two_length < side_three_length
                || side_two_length + side_three_length < side_one_length
                || side_one_length + side_three_length < side_two_length) {
            throw new IllegalFigureParametrs("Не смог создать треугольник, одна из сторон больше суммы двух других");
        }
        this.side_one_length = side_one_length;
        this.side_two_length = side_two_length;
        this.side_three_length = side_three_length;
    }

    @Override
    public double calcPerimetr() {
        return side_one_length + side_two_length + side_three_length;
    }

    @Override
    public double calcArea() {
        double halfPerimetr = calcPerimetr() / 2;
        return Math.sqrt(halfPerimetr*(halfPerimetr-side_one_length)
                                     *(halfPerimetr-side_two_length)
                                     *(halfPerimetr-side_three_length));
    }

    public String description(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Это треугольник со сторонами ").append(side_one_length).append(", ").append(side_two_length).append(", ").append(side_three_length).append(".").toString();
    }
}
