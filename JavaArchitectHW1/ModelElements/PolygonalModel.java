package JavaArchitectHW1.ModelElements;

import java.util.ArrayList;

public class PolygonalModel {
    private ArrayList<Polygon> polygons;
    private ArrayList<Texture> textures;

    /**
     * Модель обязана иметь хотя бы 1 полигон
     * Наличие текстур не обязательно при создании
     * @param polygons
     */
    public PolygonalModel(ArrayList<Polygon> polygons) throws Exception{
        if (polygons.size() < 1 || polygons == null) 
        {
            throw new Exception("Полигональная Модель обязана иметь хотя бы один полигон");
        }
        this.polygons = polygons;
    }

    public void addPoligon(Polygon polygon) {
        polygons.add(polygon);
    }

    public void removePoligon(Polygon polygon) {
        polygons.remove(polygon);
    }

    public void addTexture(Texture texture) {
        textures.add(texture);
    }

    public void removeTexture(Texture texture) {
        textures.remove(texture);
    }
}
