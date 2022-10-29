package JavaArchitectHW1.ModelElements;

import java.util.HashSet;
import JavaArchitectHW1.ModelElements.BasicClasses.Point3D;

public class Polygon {
    /** Набор точек (а не список), так как наличие двух идентичных точек в рамках одной поскости бессмысленно */
    private HashSet<Point3D> points;

    public Polygon(HashSet<Point3D> points){
        this.points = points;
    }
    public HashSet<Point3D> getAllPoints(){
        return points;
    }
    public void addPoint(Point3D point){
        this.points.add(point);
    }
    public void removePount(Point3D point){
        this.points.remove(point);
    }
}
