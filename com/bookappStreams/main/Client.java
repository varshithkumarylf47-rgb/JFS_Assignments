package com.bookappStreams.main;

import com.bookappStreams.exception.BookNotFoundException;
import com.bookappStreams.model.Book;
import com.bookappStreams.service.BookServiceImpl;
import com.bookappStreams.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws BookNotFoundException {
        Scanner scanner = new Scanner(System.in);
        IBookService bookService = new BookServiceImpl();

        while (true) {
            System.out.println("\n-----BOOK SEARCH------");
            System.out.println("1. Get All Books");
            System.out.println("2. Search by Author ");
            System.out.println("3. Search by Category");
            System.out.println("4. Search by Price Less Than");
            System.out.println("5. Search by Author + Category");
            System.out.println("6. Search by Published Year");
            System.out.println("7. Get total count of books by author");
            System.out.println("8. Get sum of price of all books by category");
            System.out.println("9. Search by Book ID");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nALL BOOKS ");
                    List<Book> all = bookService.getAll();
                    if (all.isEmpty()) {
                        System.out.println("NO BOOKS AVAILABLE");
                    } else {
                        for (Book b : all) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    List<Book> byAuthor = bookService.getByAuthorContains(author);
                    for (Book b : byAuthor) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    List<Book> byCategory = bookService.getByCategory(category);
                    for (Book b : byCategory) {
                        System.out.println(b);
                    }
                    break;

                case 4:
                    System.out.print("Enter max price: ");
                    double price = scanner.nextDouble();
                    List<String> byPrice = bookService.getByPriceLessThan(price);
                    for (String b : byPrice) {
                        System.out.println(b);
                    }

                    break;

                case 5:
                    System.out.print("Enter author name: ");
                    String a = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String c = scanner.nextLine();
                    List<Book> byAuthorCat = bookService.getByAuthorContainsAndCategory(a, c);
                    for (Book b : byAuthorCat) {
                        System.out.println(b);
                    }
                    break;

                case 6:
                    System.out.print("Enter published year: ");
                    int year = scanner.nextInt();
                    List<Book> byYear = bookService.getByDatePublished(year);
                    for (Book b : byYear) {
                            System.out.println(b);
                    }

                    break;

                case 7:
                    System.out.print("Enter author name: ");
                    String authorPrice = scanner.nextLine();
                    int byAuthorPrice = bookService.getCountOfBooksByAuthor(authorPrice);
                    System.out.println(byAuthorPrice);
                    break;

                case 8:
                    System.out.print("Enter category: ");
                    String categoryP = scanner.nextLine();
                    double byCategoryPrice = bookService.getTotalPrice(categoryP);
                    if(byCategoryPrice==0){
                        System.out.println("no such category");
                    }else {
                        System.out.println(byCategoryPrice);
                    }
                    break;

                case 9:
                    System.out.print("Enter the book ID: ");
                    int bookId1 = scanner.nextInt();
                    Book bookID = bookService.getById(bookId1);
                    System.out.println(bookID);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


