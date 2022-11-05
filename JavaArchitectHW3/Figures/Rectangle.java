package JavaArchitectHW3.Figures;

public class Rectangle extends Shape {
    protected double sideOneLength;
    protected double sideTwoLength;


    public Rectangle(double sideOneLength, double sideTwoLength) {
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
        return "Это прямоуголник со сторонами " + sideOneLength + ", " + sideTwoLength +
                ".";
    }

     public double getSideOneLength() {
         return sideOneLength;
     }

     public void setSideOneLength(double sideOneLength) {
         this.sideOneLength = sideOneLength;
     }

     public double getSideTwoLength() {
         return sideTwoLength;
     }

     public void setSideTwoLength(double sideTwoLength) {
         this.sideTwoLength = sideTwoLength;
     }
}
