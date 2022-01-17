import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner scanner = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.gerAllProduct();

    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Để xem danh sách sản phẩm theo danh mục");
        System.out.println("Chọn 2: Để xem danh sách sản phẩm theo hãng");
        System.out.println("Chọn 3: Để xem danh sách sản phẩm theo mức giá");
        System.out.println("Chọn 4: Để tìm kiếm sản phẩm theo tên");
        System.out.println("Chọn 5: Thống kê số sản phẩm mỗi danh mục");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        service.showByCategory(products);
                        break;
                    case 2:
                        System.out.println("Nhập tên hãng muốn xem");
                        String searchBrand = scanner.nextLine();
                        service.showByBrand(products, searchBrand);
                        break;
                    case 3:
                        service.showByPrice(products);
                        break;
                    case 4:
                        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
                        String searchName = scanner.nextLine();
                        service.searchByName(products, searchName);
                        break;
                    case 5:
                        service.countCategory(products);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");

                }

            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập số");
            }

        }
    }
}
