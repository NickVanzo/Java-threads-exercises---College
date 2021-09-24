package org.prog3.turn3.main;

import org.prog3.turn3.model.Book;
import org.prog3.turn3.model.Library;

public class RunLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Divina Commedia", "Dante", 999);
        Book book2 = new Book("Shining", "Stephen King", 300);
        Book book3 = new Book("Kujo", "Stephen King", 450);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printLibrary();
    }
}
