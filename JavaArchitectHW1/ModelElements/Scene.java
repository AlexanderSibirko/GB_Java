package JavaArchitectHW1.ModelElements;
import java.lang.instrument.IllegalClassFormatException;
import java.util.List;

public class Scene {
    private HashSet<Camera> cameras;
    private HashSet<LightSource> lightSources;
    private HashSet<PoligonalModel> poligonalModels;

    public void addObject(Object object) throws IllegalClassFormatException {
        if (object instanceof Camera) {
            cameras.add(object);
        } else if (object instanceof LightSource) {
            lightSources.add(object);
        } else if (object instanceof PoligonalModel) {
            poligonalModels.add(object);
        } else {
            throw IllegalClassFormatException("Неправильный класс добавляемого объекта");
        }
    }

    public void deleteObject(Object object) throws IllegalClassFormatException {
        if (object instanceof Camera) {
            cameras.remove(object);
        } else if (object instanceof LightSource) {
            lightSources.remove(object);
        } else if (object instanceof PoligonalModel) {
            poligonalModels.remove(object);
        } else {
            throw IllegalClassFormatException("Неправильный класс добавляемого объекта");
        }
    }
}
