package JavaArchitectHW1.ModelElements;

import java.util.ArrayList;

public class PolygonalModel {
    private ArrayList<Polygon> polygons;
    private ArrayList<Texture> textures;

    public void addPoligon(Poligon polygon) {
        polygons.add(polygon);
    }

    public void removePoligon(Poligon polygon) {
        polygons.remove(polygon);
    }

    public void addTexture(Texture texture) {
        textures.add(texture);
    }

    public void removeTexture(Texture texture) {
        textures.remove(texture);
    }
}
