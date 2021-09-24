package org.turn3.model;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Item> ownedItems;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.ownedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addItem(Item newItem) {
        ownedItems.add(newItem);
    }

    public void deleteItem(Item itemToDelete) {
        if(ownedItems.contains(itemToDelete)) {
            ownedItems.remove(itemToDelete);
        }
    }

    public int totalValue() {
        int sum = 0;
        for (Item item: ownedItems) {
            sum += item.getValue();
        }
        return sum;
    }
}
