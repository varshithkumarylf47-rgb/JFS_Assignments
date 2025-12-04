package com.bookappStreams.service;


import com.bookappStreams.exception.BookNotFoundException;
import com.bookappStreams.model.Book;
import com.bookappStreams.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {

    Book book;

    @Override
    public List<Book> getAll() {
        List<Book> newBook = BookDetails.showBooks().stream().toList();
        return newBook;
    }

    @Override
    public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        result = BookDetails.showBooks()            // using streams
                .stream()
                .filter(book1 -> book1.getAuthor()
                        .equalsIgnoreCase(author))
                .toList();
//        for (Book book1 : BookDetails.showBooks()) {         //legacy way
//            if (book1.getAuthor().equalsIgnoreCase(author)) {
//                result.add(book1);
//            }
//        }
        return result;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();
        result = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getCategory().equalsIgnoreCase(category))
                .toList();

//        for (Book book1 : BookDetails.showBooks()) {          //legacy way
//            if (book1.getCategory().equalsIgnoreCase(category)) {
//                result.add(book1);
//            }
//        }
        return result;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();
        result = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getPrice() < price)
                .toList();
//        for (Book book1 : BookDetails.showBooks()) {     //legacy way
//            if (book1.getPrice() < price) {
//                result.add(book1);
//            }
//        }
        return result;
    }

    @Override
    public List<Book> getByDatePublished(int year) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        result = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getDatePublished().getYear() == year)
                .toList();

//        for (Book book1 : BookDetails.showBooks()) {          //legacy way
//            if (book1.getDatePublished().getYear() == year) {
//                result.add(book1);
//            }
//        }
        return result;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> result = new ArrayList<>();

        result = BookDetails.showBooks()        // using streams
                .stream()
                .filter(book1 -> book1.getAuthor().equalsIgnoreCase(author) && book1.getCategory().equalsIgnoreCase(category))
                .toList();

//        for (Book book1 : BookDetails.showBooks()) {      //legacy way
//            if (book1.getAuthor().equalsIgnoreCase(author) && book1.getCategory().equalsIgnoreCase(category)) {
//                result.add(book1);
//            }
//        }
        return result;
    }

    @Override
    public Book getById(int bookId) throws BookNotFoundException {
        BookDetails.showBooks()
                .stream()
                .filter(book1 -> book1.getBookId() == bookId);

//        for (Book book1 : BookDetails.showBooks()) {          //legacy way
//            if (book1.getBookId() == bookId) {
//                return book1;
//            }
//        }
        return null;
    }
}