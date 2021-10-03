package polygons;

public class Rectangle extends Parallelogram {
    public Rectangle(int height, int base) {
        super(height, base);
    }

    public int getPerimeter() {
        return this.getBase() * 2 + this.getHeight() * 2;
    }
}
