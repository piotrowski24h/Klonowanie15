package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library implements Cloneable {
    final String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws CloneNotSupportedException {
        Library clone = (Library) super.clone();
        clone.books = new HashSet<>();

        for (Book book : books) {
            clone.books.add(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }

        return clone;
    }
}