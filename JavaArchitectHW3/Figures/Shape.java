package JavaArchitectHW3.Figures;
public abstract class Shape {
/** Базовое название длинны границы фигуры, если для фигуры оно отличается то переопределить в потомке Например: для круга "Длинна окружности"*/
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
