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
                    if (byAuthor.isEmpty()) {
                        System.out.println("NO SUCH AUTHOR FOUND");
                    } else {
                        for (Book b : byAuthor) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    List<Book> byCategory = bookService.getByCategory(category);
                    if (byCategory.isEmpty()) {
                        System.out.println("NO SUCH BOOK WITH CATEGORY FOUND");
                    } else {
                        for (Book b : byCategory) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter max price: ");
                    double price = scanner.nextDouble();

                    List<Book> byPrice = bookService.getByPriceLessThan(price);
                    if (byPrice.isEmpty()) {
                        System.out.println("NO BOOK FOUND UNDER THE GIVEN PRICE");
                    } else {
                        for (Book b : byPrice) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter author name: ");
                    String a = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String c = scanner.nextLine();

                    List<Book> byAuthorCat = bookService.getByAuthorContainsAndCategory(a, c);
                    if (byAuthorCat.isEmpty()) {
                        System.out.println("NO BOOK FOUND WITH THE GIVEN AUTHOR AND CATEGORY");
                    } else {
                        for (Book b : byAuthorCat) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter published year: ");
                    int year = scanner.nextInt();

                    List<Book> byYear = bookService.getByDatePublished(year);
                    if (byYear.isEmpty()) {
                        System.out.println("NO BOOK WITH THE GIVEN PUBLISHED YEAR");
                    } else {
                        for (Book b : byYear) {
                            System.out.println(b);
                        }
                    }
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


