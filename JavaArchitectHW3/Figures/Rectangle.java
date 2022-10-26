package JavaArchitectHW3.Figures;

public class Rectangle extends Shape {
    private double side_one_length;
    private double side_two_length;

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
        return sb.append("Это прямоуголник со сторонами ").append(side_one_length).append(", ").append(side_two_length).append(".").toString();
    }
}