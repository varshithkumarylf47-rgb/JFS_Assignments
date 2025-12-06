package com.bookappStreams.service;


import com.bookappStreams.exception.BookNotFoundException;
import com.bookappStreams.model.Book;
import com.bookappStreams.util.BookDetails;

import java.util.List;

public class BookServiceImpl implements IBookService {

    @Override
    public List<Book> getAll() {
        List<Book> books = BookDetails.showBooks().stream().toList();
        return books;
    }

    @Override
    public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks()            // using streams
                .stream()
                .filter(book1 -> book1.getAuthor()
                        .equalsIgnoreCase(author))
                .toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("Book with the given author not found");
        }
        return books;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getCategory().equalsIgnoreCase(category))
                .toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("Book with the given category not found");
        }
        return books;
    }

    @Override
    public int getCountOfBooksByAuthor(String author) throws BookNotFoundException {
        long books = BookDetails.showBooks()
                .stream()
                .filter(book1 -> book1.getAuthor().equalsIgnoreCase(author))
                .count();
        if (books == 0) {
            throw new BookNotFoundException("No books by the given author");
        }
        return (int) books;
    }

    @Override
    public List<String> getByPriceLessThan(double price) throws BookNotFoundException {

        List<String> books = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getPrice() < price)
                .map(Book::toString).toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("Book under the given price not found");
        }
        return books;

    }

    @Override
    public List<Book> getByDatePublished(int year) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getDatePublished().getYear() == year)
                .toList();

        if (books.isEmpty()) {
            throw new BookNotFoundException("Book with the given year not found");
        }
        return books;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getAuthor().equalsIgnoreCase(author) && book1.getCategory().equalsIgnoreCase(category))
                .toList();
        if (books.isEmpty()) {
            throw new BookNotFoundException("Book with the given author and category not found");
        }
        return books;
    }

    @Override
    public Book getById(int bookId) throws BookNotFoundException {
        Book newbook = BookDetails.showBooks()
                .stream()
                .filter(book1 -> book1.getBookId() == bookId)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with ID " + bookId + " not found"));
        return newbook;
    }

    @Override
    public double getTotalPrice(String category) {
        double price = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getCategory().equalsIgnoreCase(category))
                .mapToDouble(Book::getPrice)
                .sum();

        return price;
    }
}

