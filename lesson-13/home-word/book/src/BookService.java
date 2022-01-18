import model.Book;
import model.Newspaper;
import model.Schoolbook;

import java.time.LocalDate;
import java.util.*;

public class BookService {
    Scanner scanner = new Scanner(System.in);

    SchoolbookService schoolbookService = new SchoolbookService();
    NewspaperService newspaperService = new NewspaperService();
    EbookService ebookService = new EbookService();

    ArrayList<Schoolbook> schoolbooks = schoolbookService.getSchoolBook();
    ArrayList<Newspaper> newspapers = newspaperService.getNewspaper();
    ArrayList<Ebook> ebooks = ebookService.getEbook();

    public ArrayList<Book> getAllBook() {

        ArrayList<Book> books = new ArrayList<>();

        books.addAll(schoolbooks);
        books.addAll(newspapers);
        books.addAll(ebooks);

        return books;
    }

    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void showByType() {
        System.out.println("Bạn đang xem sách theo từng loại: ");
        System.out.println("Chọn 1: Để xem danh sách sách giáo khoa");
        System.out.println("Chọn 2: Để xem danh sách Báo");
        System.out.println("Chọn 3: Để xem danh sách Ebook");

        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.println("Danh sách sách giáo khoa");
            show(schoolbooks);
        } else if (choice == 2) {
            System.out.println("Danh sách Báo");
            show(newspapers);
        } else if (choice == 3) {
            System.out.println("Danh sách Ebook");
            show(ebooks);
        } else {
            System.out.println("Không có lựa chọn này");
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println("Sách bạn muốn tìm là: ");
                System.out.println(book);
            }
        }
    }

    public void searchByCategory(ArrayList<Book> books, String searchCategory) {
        for (Book book : books) {
            if (Arrays.toString(book.getCategory()).toLowerCase().contains(searchCategory.toLowerCase())) {
                System.out.println("Sách bạn muốn tìm là: ");
                System.out.println(book);
            }
        }
    }

    public void topEbookDownload(ArrayList<Ebook> ebooks) {
        System.out.println("Ebook có lượt tải cao nhất là: ");
        Collections.sort(ebooks, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook o1, Ebook o2) {
                return o2.getDownload() - o1.getDownload();
            }
        });
        System.out.println(ebooks.get(0));
    }

    public void newspaperThisYear(ArrayList<Newspaper> newspapers){
        System.out.println("Các báo phát hành trong năm nay là");
        int thisYear = LocalDate.now().getYear();
        for (Newspaper newspaper: newspapers){
            if (newspaper.getDate().getYear() == thisYear){
                System.out.println(newspaper);
            }
        }
    }


}



