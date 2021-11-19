package Exercise2.Controller;

import Exercise2.Model.ListaProverbi;

import java.util.Observable;
import java.util.Observer;

public class GeneraProverbi extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ListaProverbi) {
            ((ListaProverbi) o).generateRandomProverbio();
        }
    }
}
