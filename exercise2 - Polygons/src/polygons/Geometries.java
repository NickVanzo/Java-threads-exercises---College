package polygons;

import java.util.ArrayList;

public class Geometries {
    private static ArrayList<Polygon> myPolygons = new ArrayList<>();

    public static boolean addPolygon(Polygon newPolygon) {
        if(newPolygon != null && !myPolygons.contains(newPolygon)) {
            myPolygons.add(newPolygon);
            return true;
        }
        return false;
    }

    public static ArrayList<Polygon> getGeometries () {
        return myPolygons;
    }

    public int numberOfPolygons() {
        return myPolygons.size();
    }
}
