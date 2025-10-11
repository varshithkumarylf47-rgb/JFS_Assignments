package com.basics.quest1;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird","Harper Lee",499.99,"Fiction / Classic");
        book.getDetails();
        book.checkBookType();
        System.out.println();
        Book book1 = new Book("Project Hail Mary","Andy Weir ",501,"Science Fiction");
        book1.getDetails();
        book1.checkBookType();
    }
}
