package controller;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BookService service = new BookService();
    static ArrayList<Book> books = service.getAllBook();

    public static void mennu() {
        System.out.println("----------------------------------");
        System.out.println("Chọn 1 để xem danh sách");
        System.out.println("Chọn 2 để thêm 1 quyển sách");
        System.out.println("Chọn 3 tìm sách theo tên");
        System.out.println("Chọn 4 tìm sách theo id");
        System.out.println("Chọn 0 để thoát chương trình");
        System.out.println("Lựa chọn của bạn là:");
    }

    public static void subMenu() {
        System.out.println("-----------------------------------");
        System.out.println("Chọn 1 sửa tên sách");
        System.out.println("Chọn 2 xóa quyển sách");
        System.out.println("Chọn 3 quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là");
    }

    public static void mainMenu() {
        boolean isContinue = true;

        while (isContinue) {
            mennu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Dach sách");
                    service.show(books);
                    break;
                case 2:
                    System.out.println("Thêm quyển sách");
                    Book newBook = service.creatNewBook();
                    service.addNewBook(newBook, books);
                    break;
                case 3:
                    System.out.println("Nhập tên quyển sách bạn muốn tìm");
                    String title = sc.nextLine();
                    service.searchByTitle(books, title);
                    break;
                case 4:
                   searchByID();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void searchByID(){
        System.out.println("Nhập id quyển sách bạn muốn tìm");
        int id = Integer.parseInt(sc.nextLine());
        Book book = service.serchById(books, id);
        System.out.println(book);
        subMenu();
        int chose = Integer.parseInt(sc.nextLine());
        switch (chose) {
            case 1:
                System.out.println("Nhập tên mới");
                String newTitle = sc.nextLine();
                service.updateBook(book, newTitle);
                break;
            case 2:
                System.out.println("Danh sách sau khi xóa");
                service.deleteBook(books, book);
                service.show(books);
                break;

            case 3:
                mennu();
                break;
        }

    }
}
