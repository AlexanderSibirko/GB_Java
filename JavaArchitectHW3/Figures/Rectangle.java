package JavaArchitectHW3.Figures;

public class Rectangle extends Shape {
    private double side_one_length;
    private double side_two_length;

    //квадрат, как частный случай прямоугольника
    public Rectangle(double side_one_length) {
        this.side_one_length = side_one_length;
        this.side_two_length = side_one_length;
    }
    //прямоугольник
    public Rectangle(double side_one_length, double side_two_length) {
        this.side_one_length = side_one_length;
        this.side_two_length = side_two_length;
    }

    @Override
    public double calcPerimetr() {
        return (side_one_length+side_two_length)*2;
    }
    @Override
    public double calcArea() {
        return side_one_length*side_two_length;
    }

    public String description(){
        StringBuilder sb = new StringBuilder();
        if (side_one_length == side_two_length) {
            return sb.append("Это квадрат со стороной ").append(side_one_length).append(".").toString();
        } else {
            return sb.append("Это прямоуголник со сторонами ").append(side_one_length).append(", ").append(side_two_length).append(".").toString();
        }
    }
}
