package polygons;

import java.util.Objects;

public class Parallelogram extends RegularPolygon {
    private int height;
    private int base;

    public Parallelogram(int height, int base) {
        super(4, 0, 0);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    @Override
    public int getNumberOfVertex() {
        return this.getNumberOfVertex();
    }

    @Override
    public int getArea() {
        return this.base * this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return height == that.height && base == that.base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, base);
    }
}
