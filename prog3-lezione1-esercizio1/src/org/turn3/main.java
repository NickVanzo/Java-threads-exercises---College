package org.turn3;

import org.turn3.io.PrettyPrinter;
import org.turn3.model.Item;
import org.turn3.model.Person;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Person> array = new ArrayList<>();
        Person person = new Person("Nick", 9);
        Item iPhone = new Item("iPhone", 1200);
        Item cake = new Item("cake", 20);
        person.addItem(iPhone);
        person.addItem(cake);
        Person nausica = new Person("Nausica", 10);
        Item iPhone2 = new Item("iPhone", 1229292);
        Item cake2 = new Item("cake", 10);
        nausica.addItem(iPhone2);
        nausica.addItem(cake2);
        array.add(person);
        array.add(nausica);
        PrettyPrinter.printPeople(array);
    }
}
