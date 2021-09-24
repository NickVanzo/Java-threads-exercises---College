package org.prog3.turn3.model;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        library = new Library();
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        assertEquals(0, library.books.size());
        Book book1 = new Book("Divina Commedia", "Dante", 999);
        library.addBook(book1);
        assertEquals(1, library.books.size());
    }

    @org.junit.jupiter.api.Test
    void getBooks() {
    }

    @org.junit.jupiter.api.Test
    void capacity() {
    }

    @org.junit.jupiter.api.Test
    void printLibrary() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}