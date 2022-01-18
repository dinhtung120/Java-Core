import model.Book;
import model.Newspaper;
import model.Schoolbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner scanner = new Scanner(System.in);

    static BookService service = new BookService();
    static SchoolbookService schoolbookService = new SchoolbookService();
    static NewspaperService newspaperService = new NewspaperService();
    static EbookService ebookService = new EbookService();

    static ArrayList<Book> books = service.getAllBook();
    static ArrayList<Schoolbook> schoolbooks = schoolbookService.getSchoolBook();
    static ArrayList<Newspaper> newspapers = newspaperService.getNewspaper();
    static ArrayList<Ebook> ebooks = ebookService.getEbook();

    public static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để xem danh sách sách theo từng loại");
        System.out.println("Chọn 2: Để tìm sách theo tên");
        System.out.println("Chọn 3: Để tìm sách theo thể loại");
        System.out.println("Chọn 4: Để lấy ra ebook có lượt tải cao nhất");
        System.out.println("Chọn 5: Để tìm các báo phát hành trong năm nay");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;
        while (isContinue){
            menu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        service.showByType();
                        break;
                    case 2:
                        System.out.println("Nhập tên sách muốn tìm kiềm");
                        String searchTitle = scanner.nextLine();
                        service.searchByTitle(books,searchTitle);
                        break;
                    case 3:
                        System.out.println("Nhập thể loại sách muốn xem");
                        String searchCategory = scanner.nextLine();
                        service.searchByCategory(books,searchCategory);
                        break;
                    case 4:
                        service.topEbookDownload(ebooks);
                        break;
                    case 5:
                        service.newspaperThisYear(newspapers);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");

                }
            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập số ");
            }
        }
    }

}
