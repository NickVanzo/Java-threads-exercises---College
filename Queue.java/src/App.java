import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Double> newList = new LinkedList<>();
        QueueGeneric<Integer> queue = new QueueGeneric<>(list);
        queue.enqueue(15);
        queue.enqueue(20);
        int elementRemoved = queue.dequeue();
        QueueGeneric<Double> queue2 = new QueueGeneric<>(newList);
        queue2.enqueue(45.4);
        queue2.enqueue(4.2);
        queue2.enqueue(1.2);
        queue.print();
        queue2.print();
        System.out.println("Element removed: " + elementRemoved);
        System.out.println(queue.isEmpty());
    }
}
