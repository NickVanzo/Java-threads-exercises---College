package polygons;

abstract public class Polygon {
    private int numbVertices;

    public Polygon(int numbVertices) {
        this.numbVertices = numbVertices;
    }

    public int getNumberOfVertex() {
        return this.numbVertices;
    }

    abstract public int getArea();
}
