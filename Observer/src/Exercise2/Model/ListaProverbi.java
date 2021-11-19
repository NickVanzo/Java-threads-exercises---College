package Exercise2.Model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ListaProverbi extends Observable {
    ArrayList<String> proverbi;
    String proverbio;

    public ListaProverbi() {
        proverbi = new ArrayList<>();
        proverbi.add("Non è tutto oro quel che luccica.");
        proverbi.add("Morto un papa se ne fa un altro.");
        proverbi.add("Chi non risica non rosica.");
        generateRandomProverbio();
    }

    public void generateRandomProverbio() {
        int max = proverbi.size()-1;
        int min = 0;
        proverbio = proverbi.get((int)Math.floor(Math.random()*(max-min+1)+min));
        setChanged();
        notifyObservers(proverbio);
    }

}
