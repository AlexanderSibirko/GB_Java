package JavaArchitectHW1.ModelElements;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void Move(Point3D newLocation) {
        this.location = newLocation;
    }
}
