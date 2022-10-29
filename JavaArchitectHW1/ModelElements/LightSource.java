package JavaArchitectHW1.ModelElements;

public class LightSource {
    private Point3D position;
    private Angle3D angle;
    private Color color;
    private Float power;

    public LightSource(Point3D position, Angle3D angle, Color color, Float power) {
        this.position = position;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void Move(Point3D newPosition) {
        this.position = newPosition;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }
}
