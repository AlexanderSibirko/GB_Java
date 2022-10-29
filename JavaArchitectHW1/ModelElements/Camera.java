package JavaArchitectHW1.ModelElements;

public class Camera {
    private Point3D position;
    private Angle3D angle;

    public Camera(Point3D position, Angle3D angle) {
        this.position = position;
        this.angle = angle;
    }

    public void Rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void Move(Point3D newPosition) {
        this.position = newPosition;
    }
}
