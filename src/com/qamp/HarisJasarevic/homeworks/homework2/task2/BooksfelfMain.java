package com.qamp.HarisJasarevic.homeworks.homework2.task2;

public class BooksfelfMain {

    public static void main(String[] args) {

        Bookshelf bookshelf = new Bookshelf();

        bookshelf.booksList.add(new Book("Rat i mir", 123456, "Lav Nikolajević Tolstoj"));
        bookshelf.booksList.add(new Book("Black spring", 777888, "Henry Valentine Miller"));
        bookshelf.booksList.add(new Book("Tvrđava", 987654, "Meša Selimović"));

        bookshelf.printBookshelf();

        boolean hasBlackSpring = bookshelf.containsBook("Black spring");
        boolean has123456 = bookshelf.containsBook(123456);

        System.out.println("\nThe bookshelf " + (hasBlackSpring ? "contains" : "does not contain") + " The Catcher in the Rye");
        System.out.println("The bookshelf " + (has123456 ? "contains" : "does not contain") + " 123456");

    }
}
