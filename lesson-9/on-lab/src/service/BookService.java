package service;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    public ArrayList<Book> getAllBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Dế mèn phiêu lưu ký", "Tô Hoài", "Phiêu lưu, thiếu nhi"));
        books.add(new Book(2, "Nhà giả kim", "Paulo", "Viễn tưởng"));

        return books;
    }

    public void show(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle) {
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(b);
            }
        }
    }

    public Book serchById(ArrayList<Book> books, int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public void updateBook(Book book, String newTitle) {
        book.setTitle(newTitle);
    }

    public void deleteBook(ArrayList<Book> books, Book book) {
        books.remove(book);
    }

    public Book creatNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        String title = sc.nextLine();
        System.out.println("Nhập tác giả");
        String author = sc.nextLine();
        System.out.println("Nhập thể loại");
        String gender = sc.nextLine();

        Book newBook = new Book(id, title, author, gender);

        return newBook;
    }

    public void addNewBook(Book book, ArrayList<Book> books) {
        books.add(book);

    }
}
