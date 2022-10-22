package JavaArchitectHW3.Figures;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws Exception{
        if (radius <= 0) {throw new Exception("Не получилось создать круг. Радиус должен быть положительным.");}
        this.radius = radius;
    };

    @Override
    public double calcPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public String description(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Это круг радиусом ").append(radius).append(".").toString();
    }
}
