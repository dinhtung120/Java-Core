import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllPruduct();

    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Để xem danh sách sản phẩm");
        System.out.println("Chọn 2: Để tìm sản phẩm theo tên");
        System.out.println("Chọn 3: Để liệt kê sản phẩm theo loại mặt hàng");
        System.out.println("Chọn 4: Để cập nhật tên, giá hoặc xóa sản phẩm");
        System.out.println("Chọn 5: Để thêm một sản phẩm");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subMenu() {
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Để cập nhật tên sản phẩm");
        System.out.println("Chọn 2: Để cập nhật giá sản phẩm");
        System.out.println("Chọn 3: Để xóa sản phẩm");
        System.out.println("Chọn 4: Để quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu() {
        boolean isContinue = true;

        while (isContinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm là: ");
                    service.show(products);
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm");
                    String name = sc.nextLine();
                    service.searchByName(products, name);
                    break;
                case 3:
                    System.out.println("Chọn loại sản phẩm bạn muốn xem");
                    service.sortByUnit(products);
                    break;
                case 4:
                    searchByID();
                    break;
                case 5:
                    System.out.println("Thêm sản phẩm");
                    Product newProduct = service.createNewProduct();
                    service.addNewProudct(newProduct,products);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void searchByID() {
        System.out.println("Nhập id sản phẩm bạn muốn chọn");
        int id = Integer.parseInt(sc.nextLine());
        Product product = service.searchByID(products, id);
        System.out.println(product);
        subMenu();
        int choise = Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1:
                System.out.println("Nhập tên mới");
                String newName = sc.nextLine();
                service.updadeName(product, newName);
                break;
            case 2:
                System.out.println("Nhập giá mới");
                long newPrice = Long.parseLong(sc.nextLine());
                service.updatePrice(product, newPrice);
                break;
            case 3:
                System.out.println("Danh sách sau khi xóa");
                service.deleteProduct(products, product);
                service.show(products);
                break;
            case 4:
                menu();
                break;
        }

    }
}



