package JavaArchitectHW3.Figures;

public class Square extends Rectangle{

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }
    
    //при переходе от прямоугольника к квадрату, второе измерение не применяется и просто игнорируется (для выполнения LSP)
    public Square(double sideOneLength, double sideTwoLength) {
        this(sideOneLength);
    }

    @Override
    public double calcPerimetr() {
        return sideOneLength*4;
    }

    @Override
    public double calcArea() {
        return sideOneLength*sideOneLength;
    }

    public String description(){
        return "Это квадрат стороной " + sideOneLength + ".";
    }

     public double getSide(){
         return super.getSideOneLength();
     }

     public void setSide(double sideLength){
         super.setSideOneLength(sideLength);
         super.setSideTwoLength(sideLength);
     }

     @Override
     public double getSideOneLength() {
         return super.getSideOneLength();
     }

     @Override
     public double getSideTwoLength() {
         return super.getSideOneLength();
     }

     @Override
     public void setSideOneLength(double sideOneLength) {
         super.setSideOneLength(sideOneLength);
         super.setSideTwoLength(sideOneLength);
     }

     @Override
     public void setSideTwoLength(double sideTwoLength) {
         super.setSideOneLength(sideTwoLength);
         super.setSideTwoLength(sideOneLength);
     }
}

