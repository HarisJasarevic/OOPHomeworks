package com.qamp.HarisJasarevic.homeworks.homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    public List<Book> booksList;

    public Bookshelf () {
        booksList = new ArrayList<>();
    }

    public final boolean containsBook (final String bookTitle) {
        for (final Book book : booksList) {
            if (book.bookTitle.equals(bookTitle)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsBook (long ISBN) {
        for (final Book book : booksList) {
            if (book.ISBN == ISBN) {
                return true;
            }
        }
        return false;
    }

    public final void printBookshelf() {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }

}
