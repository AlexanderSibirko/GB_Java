package JavaArchitectHW1.ModelElements;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void Move(Point3D newLocation) {
        this.location = newLocation;
    }
}
