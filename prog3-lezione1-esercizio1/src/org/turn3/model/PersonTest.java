package org.turn3.model;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Person person = new Person("Nick", 21);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Person person = new Person("Nick", 21);
        assertEquals("Nick", person.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Person person = new Person("Nick", 21);
        assertEquals("Nick", person.getName());
        person.setName("Nick2");
        assertEquals("Nick2", person.getName());
    }


    @org.junit.jupiter.api.Test
    void totalValue() {
        Person person = new Person("Nick", 21);
        assertEquals(0, person.totalValue());
        Item iPhone = new Item("iPhone", 1200);
        Item cake = new Item("cake", 20);
        person.addItem(iPhone);
        person.addItem(cake);
        assertEquals(1220, person.totalValue());
        assertNotEquals(100, person.totalValue());
    }

}