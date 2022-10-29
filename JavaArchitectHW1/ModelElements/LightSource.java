package JavaArchitectHW1.ModelElements;

import JavaArchitectHW1.ModelElements.BasicClasses.Angle3D;
import JavaArchitectHW1.ModelElements.BasicClasses.Color;
import JavaArchitectHW1.ModelElements.BasicClasses.Point3D;

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

    public Angle3D getAngle() {
        return angle;
    }
    public void setAngle(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public Point3D getPosition() {
        return position;
    }
    public void setPosition(Point3D newPosition) {
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
