import java.util.List;

public class QueueGeneric<T> {
    private List<T> queue;

    public QueueGeneric(List<T> queue) {
        this.queue = queue;
    }

    public T dequeue() {
        T elementToRemove = this.queue.get(0);
        try {
            queue.remove(elementToRemove);
        } catch(ClassCastException e) {
            System.err.println("You cannot remove this element from the list.\nSee error message: " + e.getMessage());
        } catch(NullPointerException e) {
            System.err.println("You cannot remove a null element from the list.\nSee error message: " + e.getMessage());
        } catch(UnsupportedOperationException e) {
            System.err.println("Operation not supported in this type of List.\nSee error message: " + e.getMessage());
        }
        return elementToRemove;
    }

    public void enqueue(T element) {
        try {
            queue.add(element);
        } catch(ClassCastException e) {
            System.err.println("You cannot add this element in the list.\nSee error message: " + e.getMessage());
        } catch(UnsupportedOperationException e) {
            System.err.println("Operation not supported in this type of List.\nSee error message: " + e.getMessage());
        } catch(NullPointerException e) {
            System.err.println("Null values not accepted!\nSee error message: " + e.getMessage());
        }
    }

    public void print() {
        for (T element: this.queue) {
            System.out.print("[" + element + "]");
        }
        System.out.println("\n");
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
