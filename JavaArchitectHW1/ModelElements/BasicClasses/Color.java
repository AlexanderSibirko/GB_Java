package JavaArchitectHW1.ModelElements.BasicClasses;

public class Color {
    private int[] rgb = new int[3];

    public Color(int R, int G, int B) throws IllegalArgumentException {
        if (R < 0 || R > 255 || G < 0 || G > 255 || B < 0 || B > 255) {
            throw new IllegalArgumentException(
                    String.format("Значения цветов должны быть в диапазоне 0-255 (полученные занчения: %d, %d, %d)", R,
                            G, B));
        }
        rgb[0] = R;
        rgb[1] = G;
        rgb[2] = B;
    }

    public int getRed() {
        return rgb[0];
    }

    public void setRed(int red) {
        rgb[0] = red;
    }

    public int getGreen() {
        return rgb[1];
    }

    public void setGreen(int green) {
        rgb[1] = green;
    }

    public int getBlue() {
        return rgb[2];
    }

    public void setBlue(int blue) {
        rgb[2] = blue;
    }
}
