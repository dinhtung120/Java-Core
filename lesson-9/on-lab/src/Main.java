import controller.Controller;
import model.Book;
import service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//       BookService service = new BookService();
//       ArrayList<Book> books = service.getAllBook();
//
//       service.show(books);
//
//        System.out.println();
//        System.out.println("Tìm sách theo tên");
//       service.searchByTitle(books,"dế mèn");
//
//        System.out.println();
//
//        Book updateBook = service.serchById(books,2);
//        service.updateBook(updateBook,"Nhà giả kim update");
//        System.out.println("Danh sách sau khi sửa");
//        service.show(books);
//
//        System.out.println("Sách sau khi sửa");
//        System.out.println(updateBook);
//
//        System.out.println();
//
//        System.out.println("Danh sách sau khi xóa");
//        service.deleteBook(books,updateBook);
//        service.show(books);
//
//        System.out.println();
//
//        System.out.println("Thêm sách mới");
//        Book newBook = service.creatNewBook();
//        service.addNewBook(newBook,books);
//        service.show(books);

        Controller.mainMenu();
    }
}
