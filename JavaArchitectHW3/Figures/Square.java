package JavaArchitectHW3.Figures;

public class Square extends Shape{
    private double side_length;

    public Square(double side_length) throws Exception {
        if (side_length <= 0) {throw new Exception("Не получилось создать квадрат. Длинна стороны не может быть отрицательной");}
        this.side_length = side_length;
    }

    @Override
    public double calcPerimetr() {
        return side_length*4;
    }

    @Override
    public double calcArea() {
        return side_length*side_length;
    }

    public String description(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Это квадрат стороной ").append(side_length).append(".").toString();
    }
}
