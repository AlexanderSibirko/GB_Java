package JavaArchitectHW3.Figures;


public class Triangle extends Shape{
    protected double side_one_length;
    protected double side_two_length;
    protected double side_three_length;
    
    public Triangle(double side_one_length, double side_two_length, double side_three_length) {
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
        return "Это треугольник со сторонами " + side_one_length + ", " + side_two_length + ", " + side_three_length + ".";
    }

    public double getSide_one_length() {
        return side_one_length;
    }

    public void setSide_one_length(double side_one_length) {
        this.side_one_length = side_one_length;
    }

    public double getSide_two_length() {
        return side_two_length;
    }

    public void setSide_two_length(double side_two_length) {
        this.side_two_length = side_two_length;
    }

    public double getSide_three_length() {
        return side_three_length;
    }

    public void setSide_three_length(double side_three_length) {
        this.side_three_length = side_three_length;
    }
}
