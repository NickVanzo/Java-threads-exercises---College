import java.util.List;

public  class Step extends Thread {
    private int secondsToSleep;
    List<Step> precondizioni;
    private static int counter = 0;

    public Step(String str, List<Step> precondizioni, int secondsToSleep) {
        super(str);
        this.precondizioni = precondizioni;
        this.secondsToSleep = secondsToSleep;
    }

    private void myJoin() {
        for(Thread prec: precondizioni) {
            try {
                prec.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private synchronized void incrementVar() {
        counter++;
    }

    public void run() {
        myJoin();
        try {
            this.incrementVar();
            System.out.println("Variabile: " + counter);
            sleep(secondsToSleep);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(getName() + " TERMINATO");
    }

}
