import model.Book;
import model.Newspaper;
import model.Schoolbook;
import service.NewspaperService;
import service.SchoolbookService;

import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Book> getAllBook(){
        SchoolbookService schoolbookService = new SchoolbookService();
        NewspaperService newspaperService = new NewspaperService();
        EbookService ebookService = new EbookService();

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Schoolbook> schoolbooks = schoolbookService.getSchoolBook();
        ArrayList<Newspaper> newspapers = newspaperService.getNewspaper();
        ArrayList<Ebook> ebooks = ebookService.getEbook();
        books.addAll(schoolbooks);
        books.addAll(newspapers);
        books.addAll(ebooks);

        return books;
    }

    public void show(ArrayList<?> list){
        for (Object o:list){
            System.out.println(o);
        }
    }

    public void showByType(ArrayList<?> list){
        System.out.println("Chọn 1: Để xem danh sách sách giáo khoa");
        System.out.println("Chọn 2: Để xem danh sách Báo");
        System.out.println("Chọn 3: Để xem danh sách Ebook");

        int choice = Integer.parseInt(scanner.nextLine());

    }

}
