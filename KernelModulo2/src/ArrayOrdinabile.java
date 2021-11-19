import java.util.ArrayList;

public class ArrayOrdinabile<T extends Comparable> {
    SortableList<T> obj;

    public ArrayOrdinabile() {
        obj = new SortableListImpl();
    }

    public void addModulo(SortableList newModulo) {
        this.obj = newModulo;
    }

    public void remove(T elementToRemove) {
        this.obj.remove(elementToRemove);
    }

    public void sort() {
        this.obj.sort();
    }

    public void add(T elementToAdd) {
        this.obj.add(elementToAdd);
    }

    public void print() {
        this.obj.print();
    }
}
