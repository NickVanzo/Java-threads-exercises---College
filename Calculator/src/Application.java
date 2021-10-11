import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(12);
        myArray.add(90);
        Calculator.print(myArray);
        System.out.println(Calculator.sum(myArray));
        System.out.println(Calculator.max(myArray));
    }
}
