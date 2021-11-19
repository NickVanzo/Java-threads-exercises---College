
import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {

        Visualizer v = new Visualizer();
        Filter f = new Filter(v);
        f.addObserver(v);
        Counter c = new Counter(f);
        c.addObserver(f);
        c.start();
    }
}

class Counter extends Observable {
    //C sarebbe lo stato del counter
    private int c;

    public Counter(Filter f) {
        c = 0;
    }

    public void start() {

        for (int i=0; i<50; i++) {
            c++;
            if (c%5==0) {
                setChanged();
                notifyObservers(c);
            }
        }
    }
}

class Filter extends Observable implements Observer {

    private List<Integer> list;

    public Filter(Visualizer v) {
        list = new ArrayList<Integer>();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Counter) {
            list.add((int) arg);
            if(list.size()%2==0) {
                System.out.println("lista size: " + list.size());
                setChanged();
                notifyObservers(list);
            }
        }
    }
}

class Visualizer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Filter) {
            for(Integer i : (List<Integer>) arg) {
                System.out.println(i.intValue());
            }
            System.out.println();
        }
    }
}
