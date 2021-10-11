import java.util.List;
//https://slack.educ.di.unito.it/progiii/channels/off-topic
public class Calculator {
    public static <E extends Number> void print(List<E> list) {
        for (E element: list) {
            System.out.print("["+element+"]");
        }
    }

    public static <T extends Number> double sum(List<T> list) {
        double sum = 0;
        for (Number element: list) {
            sum += + element.doubleValue();
        }
        return sum;
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        T max = list.get(0);
        for(T element: list) {
            if(max.compareTo(element) < 0) {
                max = element;
            }
        }
        return max;
    }
}
