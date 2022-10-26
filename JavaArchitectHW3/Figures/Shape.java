package JavaArchitectHW3.Figures;

public abstract class Shape {
    protected String perimetr_naming = "Периметр:";
    public abstract String description();
    public abstract double calcPerimetr();
    public abstract double calcArea();

    public String getArea() {
        return String.format("Площадь фигуры: %f", calcArea());
    }
    public String getPerimetr() {
        return String.format("%s %f", perimetr_naming, calcPerimetr());
    }
}
