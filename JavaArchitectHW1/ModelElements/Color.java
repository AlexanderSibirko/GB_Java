package JavaArchitectHW1.ModelElements;

public class Color {
    private int red;
    private int green;
    private int blue;
    
    public Color(int R, int G, int B){
        this.red = R;
        this.green = G;
        this.blue = B;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
