import model.Book;
import model.Newspaper;
import model.Schoolbook;
import service.NewspaperService;
import service.SchoolbookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    BookService service = new BookService();
    SchoolbookService schoolbookService = new SchoolbookService();
    NewspaperService newspaperService = new NewspaperService();
    EbookService ebookService = new EbookService();
    ArrayList<Book> books = service.getAllBook();
    ArrayList<Schoolbook> schoolbooks = schoolbookService.getSchoolBook();
    ArrayList<Newspaper> newspapers = newspaperService.getNewspaper();
    ArrayList<Ebook> ebooks = ebookService.getEbook();

    service.show(books);

    }
}
