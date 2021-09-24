package org.turn3.io;

import org.turn3.model.Person;

import java.util.ArrayList;

public class PrettyPrinter {
    public static void printPeople(ArrayList<Person> people) {
        int i = 0;
        for (Person person: people) {
            for(i = 0; i < 80; i++) {
                System.out.print("#");
            }
            System.out.println("\nName: " + person.getName() + " Age: " + person.getAge() + " Value: " +  person.totalValue());
            for(i = 0; i < 80; i++) {
                System.out.print("#");
            }
        }
    }
}
