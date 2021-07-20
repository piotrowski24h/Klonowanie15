package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class LibraryTestSuite {


    @Test
    public void testGetAllBooks() {
        Library library = new Library("Main library");
        Book book1 = new Book("My title", "John Doe", LocalDate.now());
        Book book2 = new Book("My second title", "Mary Brown", LocalDate.now());

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testShallowClone() throws CloneNotSupportedException {
        Library library = new Library("Main library");
        Book book1 = new Book("My title", "John Doe", LocalDate.now());
        Book book2 = new Book("My second title", "Mary Brown", LocalDate.now());

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library libraryClone = (Library) library.clone();

        Book book3 = new Book("My third title", "Adam Mickiewicz", LocalDate.now());
        library.getBooks().add(book3);

        assertEquals(3, library.getBooks().size());
        assertEquals(3, libraryClone.getBooks().size());
    }

    @Test
    public void testDeepClone() throws CloneNotSupportedException {
        Library library = new Library("Main library");
        Book book1 = new Book("My title", "John Doe", LocalDate.now());
        Book book2 = new Book("My second title", "Mary Brown", LocalDate.now());

        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library libraryClone = (Library) library.deepClone();

        Book book3 = new Book("My third title", "Adam Mickiewicz", LocalDate.now());
        library.getBooks().add(book3);

        assertEquals(3, library.getBooks().size());
        assertEquals(2, libraryClone.getBooks().size());
    }

}
