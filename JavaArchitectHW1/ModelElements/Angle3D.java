package JavaArchitectHW1.ModelElements;

public class Angle3D {
    private int degreeX;
    private int degreeY;
    private int degreeZ;

    public Angle3D(int degreeX, int degreeY, int degreeZ) {
        this.degreeX = degreeX % 360;
        this.degreeY = degreeY % 360;
        this.degreeZ = degreeZ % 360;
    }
    public int getAngleX() {
        return degreeX;
    }
    public void setAngleX(int angleX) {
        this.degreeX = angleX;
    }
    public int getAngleY() {
        return degreeY;
    }
    public void setAngleY(int angleY) {
        this.degreeY = angleY;
    }
    public int getAngleZ() {
        return degreeZ;
    }
    public void setAngleZ(int angleZ) {
        this.degreeZ = angleZ;
    }

}
