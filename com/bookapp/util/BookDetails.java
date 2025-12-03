package com.bookapp.util;

import com.bookapp.model.Book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> showBooks() {

        List<Book> books = Arrays.asList(
                new Book("The Silent Code", 101, 19.99, "Alice Morgan", "Technology", LocalDate.of(2020, 5, 12)),
                new Book("Whispers of Time", 102, 14.50, "Daniel Carter", "Fiction", LocalDate.of(2018, 8, 3)),
                new Book("Mastering Java", 103, 29.99, "Robert Hughes", "Programming", LocalDate.of(2021, 2, 20)),
                new Book("The Science Within", 104, 22.75, "Emily Richards", "Science", LocalDate.of(2019, 11, 15)),
                new Book("Mindful Living", 105, 17.40, "Sarah Thompson", "Self-Help", LocalDate.of(2022, 7, 28)),
                new Book("Journey Through Space", 106, 25.60, "Michael Lewis", "Astronomy", LocalDate.of(2017, 1, 5)) //add book with parameters

        );
    return books;
    }
}