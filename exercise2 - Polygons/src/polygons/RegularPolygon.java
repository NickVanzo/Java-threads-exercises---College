package polygons;

public class RegularPolygon extends Polygon {
    private int apothem;
    private int sideLength;

    public RegularPolygon(int numOfVertix,int apothem, int sideLength) {
        super(numOfVertix);
        this.apothem = apothem;
        this.sideLength = sideLength;
    }

    public int getApothem() {
        return this.apothem;
    }

    private int getPerimeter() {
        return sideLength * this.getNumberOfVertex();
    }

    public int getArea() {
        return this.getPerimeter() * apothem / 2;
    }
}
