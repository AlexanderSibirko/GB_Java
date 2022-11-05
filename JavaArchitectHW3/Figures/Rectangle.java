package JavaArchitectHW3.Figures;

public class Rectangle extends Shape {
    protected double sideOneLength;
    protected double sideTwoLength;


    public Rectangle(double sideOneLength, double sideTwoLength) throws IllegalArgumentException {
        if (sideOneLength <= 0 || sideTwoLength <= 0) {
            throw new IllegalArgumentException("Не получилось создать прямогульник/квадрат. Один из размеров был отрицательны.");
        }
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
    }

    @Override
    public double calcPerimetr() {
        return (sideOneLength + sideTwoLength) * 2;
    }

    @Override
    public double calcArea() {
        return sideOneLength * sideTwoLength;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Это прямоуголник со сторонами ").append(sideOneLength).append(", ").append(sideTwoLength)
                .append(".").toString();
    }

    // public double getSideOneLength() {
    //     return sideOneLength;
    // }

    // public void setSideOneLength(double sideOneLength) {
    //     this.sideOneLength = sideOneLength;
    // }

    // public double getSideTwoLength() {
    //     return sideTwoLength;
    // }

    // public void setSideTwoLength(double sideTwoLength) {
    //     this.sideTwoLength = sideTwoLength;
    // }
}
