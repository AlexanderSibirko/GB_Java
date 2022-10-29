package JavaArchitectHW1.ModelElements;
import java.util.HashSet;

public class Scene {
    private HashSet<Camera> cameras;
    private HashSet<LightSource> lightSources;
    private HashSet<PolygonalModel> poligonalModels;

    public void addObject(Object object)  throws Exception {
        if (object instanceof Camera) {
            cameras.add((Camera)object);
        } else if (object instanceof LightSource) {
            lightSources.add((LightSource)object);
        } else if (object instanceof PolygonalModel) {
            poligonalModels.add((PolygonalModel)object);
        } else {
            throw new Exception("Неправильный класс добавляемого объекта");
        }
    }

    public void deleteObject(Object object) throws Exception {
        if (object instanceof Camera) {
            cameras.remove((Camera)object);
        } else if (object instanceof LightSource) {
            lightSources.remove((LightSource)object);
        } else if (object instanceof PolygonalModel) {
            poligonalModels.remove((PolygonalModel)object);
        } else {
            throw new Exception("Неправильный класс добавляемого объекта");
        }
    }
}
