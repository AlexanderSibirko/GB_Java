package JavaArchitectHW1.ModelElements;

public class Color {
    private int[] RGB = new int[3];
    
    public Color(int R, int G, int B){
        RGB[0] = R;
        RGB[1] = G;
        RGB[2] = B;
    }

    public int getRed() {
        return RGB[0];
    }

    public void setRed(int red) {
        RGB[0] = red;
    }

    public int getGreen() {
        return RGB[1];
    }

    public void setGreen(int green) {
        RGB[1] = green;
    }

    public int getBlue() {
        return RGB[2];
    }

    public void setBlue(int blue) {
        RGB[2] = blue;
    }
}
