import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class SortableListImpl<T extends Comparable> implements SortableList<T> {
    private List<T> arrayList;

    public SortableListImpl() {
        this.arrayList = new ArrayList<>();
    }

    public void add(T newElement) {
        arrayList.add(newElement);
    }

    public void remove(T elementToRemove) {
        arrayList.remove(elementToRemove);
    }

    public void sort() {
        Collections.sort(arrayList);
    }

    public void print() {
        for(Comparable element : arrayList) {
            System.out.println("Element: " + element);
        }
    }
}
