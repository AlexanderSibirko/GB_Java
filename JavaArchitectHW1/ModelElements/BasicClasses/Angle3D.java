package JavaArchitectHW1.ModelElements.BasicClasses;

public class Angle3D {
    private int degreeX;
    private int degreeY;
    private int degreeZ;

    /**
     * 3-х мерный угол (как углы по 3-м осям)
     * Любые введенные значения приводится к идентичному положению со значениям -360° - 360°
     * @param degreeX - угол Х
     * @param degreeY - угол У
     * @param degreeZ - угол Z
     */
    public Angle3D(int degreeX, int degreeY, int degreeZ) {
        this.degreeX = degreeX % 360;
        this.degreeY = degreeY % 360;
        this.degreeZ = degreeZ % 360;
    }
    public int getAngleX() {
        return degreeX;
    }
    public void setAngleX(int angleX) {
        this.degreeX = angleX % 360;
    }
    public int getAngleY() {
        return degreeY;
    }
    public void setAngleY(int angleY) {
        this.degreeY = angleY % 360;
    }
    public int getAngleZ() {
        return degreeZ;
    }
    public void setAngleZ(int angleZ) {
        this.degreeZ = angleZ % 360;
    }

}
