package polygons;

import java.util.Objects;

public class Triangle extends RegularPolygon {
    private int height;
    private int base;

    public Triangle(int height, int base) {
        super(3, 0, 0);
        this.height = height;
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && base == triangle.base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, base);
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }
}
