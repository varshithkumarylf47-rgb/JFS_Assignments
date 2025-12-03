package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {

    Book book;

    @Override
    public List<Book> getAll() {
        return BookDetails.showBooks();
    }

    @Override
    public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getAuthor().equalsIgnoreCase(author)) {
                result.add(book1);
            }
        }
        return result;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();
        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getCategory().equalsIgnoreCase(category)) {
                result.add(book1);
            }
        }
        return result;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getPrice() < price) {
                result.add(book1);
            }
        }
        return result;
    }

    @Override
    public List<Book> getByDatePublished(int year) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getDatePublished().getYear() == year) {
                result.add(book1);
            }
        }
        return result;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getAuthor().equalsIgnoreCase(author) && book1.getCategory().equalsIgnoreCase(category)) {
                result.add(book1);
            }
        }
        return result;
    }

    @Override
    public Book getById(int bookId) throws BookNotFoundException {
        for (Book book1 : BookDetails.showBooks()) {
            if (book1.getBookId() == bookId) {
                return book1;
            }
        }
        return null;
    }
}