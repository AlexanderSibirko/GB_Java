package JavaArchitectHW3.Figures;

import JavaArchitectHW3.Figures.Exceptions.IllegalFigureParametrs;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws IllegalFigureParametrs {
        if (radius <= 0) {
            throw new IllegalFigureParametrs("Не получилось создать круг. Радиус должен быть положительным.");
        }
        this.perimetr_naming =  "Длинна окружности:";
        this.radius = radius;
    }

    public double calcPerimetr() {
        return 2 * Math.PI * radius;
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String description(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Это круг радиусом ").append(radius).append(".").toString();
    }
}
