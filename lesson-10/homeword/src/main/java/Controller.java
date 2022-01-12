import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static MovieService service = new MovieService();
    static ArrayList<Movie> movies = service.getAllMovie();

    public static void menu(){
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Để xem danh sách phim");
        System.out.println("Chọn 2: Để xem danh sách phim theo năm phát hành");
        System.out.println("Chọn 3: Để xem danh sách phim theo tên");
        System.out.println("Chọn 4: Để tìm phim theo tên");
        System.out.println("Chọn 5: Để xem 3 phim có lượt xem cao nhất");
        System.out.println("Chọn 6: Để tìm phim theo thể loại");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu(){
        boolean isContinue = true;

        while (isContinue){
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách phim là:");
                    service.show(movies);
                    break;
                case 2:
                    service.sortByYear(movies);
                    break;
                case 3:
                    service.sortByTitle(movies);
                    break;
                case 4:
                    System.out.println("Nhập tên phim muốn tìm:");
                    String title = scanner.nextLine();
                    service.searchByTitle(movies,title);
                    break;
                case 5:
                    service.top3View(movies);
                    break;
                case 6:
                    System.out.println("Nhập thể loại phim muốn tìm:");
                    String category = scanner.nextLine();
                    service.searchByCategory(movies,category);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
