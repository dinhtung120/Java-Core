import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getAllPruduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Nồi cơm điện", 1000000, 10, Unit.UNIT1, 5));
        products.add(new Product(2, "Bánh chocopie", 4000000, 40, Unit.UNIT2, 33));
        products.add(new Product(3, "Áo khoác nam", 7000000, 70, Unit.UNIT3, 66));
        products.add(new Product(4, "Quạt điện", 2000000, 20, Unit.UNIT1, 11));
        products.add(new Product(5, "Kẹo mút chupa chups", 5000000, 50, Unit.UNIT2, 44));
        products.add(new Product(6, "Áo sơ mi nam", 8000000, 80, Unit.UNIT3, 77));
        products.add(new Product(7, "Lò nướng", 3000000, 30, Unit.UNIT1, 22));
        products.add(new Product(8, "Kẹo xylitol", 6000000, 60, Unit.UNIT2, 55));
        products.add(new Product(9, "áo len nam", 9000000, 90, Unit.UNIT3, 88));

        return products;
    }

    public void show(ArrayList<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchByName(ArrayList<Product> products, String searchName) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(p);
            }
        }
    }


    public void sortByUnit(ArrayList<Product> products) {
        System.out.println("Chọn 1: Để xem danh sách đồ gia dụng");
        System.out.println("Chọn 2: Để xem danh sách thực phẩm");
        System.out.println("Chọn 3: Để xem danh sách đồ thời trang");
        int choice = Integer.parseInt(sc.nextLine());
        Unit unitName = Unit.UNIT1;
        if (choice == 1) {
            unitName = Unit.UNIT1;
        } else if (choice == 2) {
            unitName = Unit.UNIT2;
        } else if (choice == 3) {
            unitName = Unit.UNIT3;
        } else {
            System.out.println("Không có lựa chọn này. đã chọn mặc định là \"Đồ gia dụng\"");
        }
        for (Product p : products) {
            if (p.getUnit().getValue().contains(unitName.getValue())) {
                System.out.println(p);
            }
        }
    }

    public Product searchByID(ArrayList<Product> products, int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void updadeName(Product product, String newName) {
        product.setName(newName);
    }

    public void updatePrice(Product product, long newPrice) {
        product.setPriceSell(newPrice);
    }

    public void deleteProduct(ArrayList<Product> products, Product product) {
        products.remove(product);
    }

    public Product createNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String name = sc.nextLine();
        System.out.println("Nhập giá bán sản phẩm:");
        long price = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lượng sản phẩm:");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("nhập loại sản phẩm:  ");
        System.out.println("Chọn 1: Đồ gia dụng");
        System.out.println("Chọn 2: Thực phẩm");
        System.out.println("Chọn 3: Đồ thời trang");
        int choice = Integer.parseInt(sc.nextLine());
        Unit unit = Unit.UNIT1;
        if (choice == 1) {
            unit = Unit.UNIT1;
        } else if (choice == 2) {
            unit = Unit.UNIT2;
        } else if (choice == 3) {
            unit = Unit.UNIT3;
        } else {
            System.out.println("Không có lựa chọn này. đã chọn mặc định là \"Đồ gia dụng\"");
        }
        System.out.println("Nhập số lượng bán");
        int amountSell = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id, name, price, amount, unit, amountSell);
        return newProduct;
    }

    public void addNewProudct(Product product, ArrayList<Product> products) {
        products.add(product);
    }

}
