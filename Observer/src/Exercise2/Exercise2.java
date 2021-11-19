package Exercise2;

import Exercise2.Controller.GeneraProverbi;
import Exercise2.Model.ListaProverbi;
import Exercise2.View.Window;

class Exercise2 {
    public static void main(String[] args) {
        Window window = new Window();
        ListaProverbi lista = new ListaProverbi();
        GeneraProverbi genera = new GeneraProverbi();
        lista.addObserver(window);

    }
}