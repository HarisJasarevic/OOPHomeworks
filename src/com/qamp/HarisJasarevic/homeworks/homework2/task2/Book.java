package com.qamp.HarisJasarevic.homeworks.homework2.task2;

public class Book {

    String bookTitle;
    public final long ISBN;
    private final String bookAuthor;

    public Book(final String bookTitle, long ISBN, final String bookAuthor) {
        this.bookTitle = bookTitle;
        this.ISBN = ISBN;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public final String toString() {
        return bookTitle + ", " + bookAuthor + " (" + ISBN + ") ";
    }
}
