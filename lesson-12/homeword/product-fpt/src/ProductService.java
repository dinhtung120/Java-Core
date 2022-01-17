import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Product> gerAllProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Apple iPhone 13 Pro Max", "Chính hãng VN/A",
                29850000, 10, 5, "Apple",
                new Category[]{Category.PHONE, Category.APPLE}));
        products.add(new Product(2, "Apple iPhone 13 ", "Chính hãng VN/A",
                21750000, 10, 5, "Apple",
                new Category[]{Category.PHONE, Category.APPLE}));
        products.add(new Product(3, "Samsung Galaxy A52", "Chính hãng",
                7790000, 10, 5, "Samsung ",
                new Category[]{Category.PHONE}));
        products.add(new Product(4, "Samsung Galaxy A22", "Chính hãng",
                4790000, 10, 5, "Samsung",
                new Category[]{Category.PHONE}));
        products.add(new Product(5, "Samsung Galaxy A03", "Chính hãng VN/A",
                2750000, 10, 5, "Samsung",
                new Category[]{Category.PHONE}));
        products.add(new Product(6, "MacBook Pro 13\" 16GB/512GB 2020", "Chính hãng Apple Việt Nam",
                42290000, 10, 5, "Apple",
                new Category[]{Category.LAPTOP, Category.APPLE}));
        products.add(new Product(7, "Laptop Asus D515DA-EJ845T", "Chính hãng",
                12190000, 10, 5, "Asus",
                new Category[]{Category.LAPTOP}));
        products.add(new Product(8, "Apple AirPods 2 ", "Chính hãng VN/A",
                3150000, 10, 5, "Apple",
                new Category[]{Category.ACCESSORIES, Category.APPLE}));
        products.add(new Product(9, "Chuột không dây Elecom M-IR07DRBK", "Chính hãng",
                240000, 10, 5, "Elecom",
                new Category[]{Category.ACCESSORIES}));

        return products;
    }

    public void show(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void showByCategory(ArrayList<Product> products) {
        System.out.println("Chọn 1: Để xem danh sách điện thoại");
        System.out.println("Chọn 2: Để xem danh sách laptop");
        System.out.println("Chọn 3: Để xem danh sách đồ Apple");
        System.out.println("Chọn 4: Để xem danh sách phụ kiện");

        int choice = Integer.parseInt(scanner.nextLine());
        Category category = Category.NULL;
        if (choice == 1) {
            category = Category.PHONE;
        } else if (choice == 2) {
            category = Category.LAPTOP;
        } else if (choice == 3) {
            category = Category.APPLE;
        } else if (choice == 4) {
            category = Category.ACCESSORIES;
        } else {
            System.out.println("Không có lựa chọn này");
        }

        for (Product product : products) {
            if (Arrays.toString(product.getCategory()).contains(category.toString())) {
                System.out.println(product);
            }
        }
    }

    public void showByBrand(ArrayList<Product> products, String searchBrand) {
        for (Product product : products) {
            if (product.getBrand().toLowerCase().contains(searchBrand.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void showByPrice(ArrayList<Product> products) {
        System.out.println("Chọn 1: Để xem danh sách sản phẩm dưới 2 triệu");
        System.out.println("Chọn 2: Để xem danh sách sản phẩm từ 2 - 4 triệu");
        System.out.println("Chọn 3: Để xem danh sách sản phẩm từ 4 - 7 triệu");
        System.out.println("Chọn 4: Để xem danh sách sản phẩm từ 7 - 13 triệu");
        System.out.println("Chọn 5: Để xem danh sách sản phẩm trên 13 triệu");
        long searchPrice = 0;
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            for (Product product : products) {
                if (product.getPrice() < 2000000) {
                    System.out.println(product);
                }
            }

        } else if (choice == 2) {
            for (Product product : products) {
                if (product.getPrice() > 2000000 & product.getPrice() < 4000000) {
                    System.out.println(product);
                }
            }
        } else if (choice == 3) {
            for (Product product : products) {
                if (product.getPrice() > 4000000 & product.getPrice() < 7000000) {
                    System.out.println(product);
                }
            }
        } else if (choice == 4) {
            for (Product product : products) {
                if (product.getPrice() > 7000000 & product.getPrice() < 13000000) {
                    System.out.println(product);
                }
            }
        } else if (choice == 5) {
            for (Product product : products) {
                if (product.getPrice() > 13000000) {
                    System.out.println(product);
                }
            }
        }
    }

    public void searchByName(ArrayList<Product> products, String searchName) {
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void countCategory(ArrayList<Product> products) {
        int countPhone = 0;
        int countLaptop = 0;
        int countApple = 0;
        int countAccessories = 0;
        for (Product product : products) {
            if (Arrays.toString(product.getCategory()).contains(Category.PHONE.toString())) {
                countPhone++;
            }
            if (Arrays.toString(product.getCategory()).contains(Category.LAPTOP.toString())) {
                countLaptop++;
            }
            if (Arrays.toString(product.getCategory()).contains(Category.APPLE.toString())) {
                countApple++;
            }
            if (Arrays.toString(product.getCategory()).contains(Category.ACCESSORIES.toString())) {
                countAccessories++;
            }
        }

        System.out.println("Số sản phẩm điện thoại là: " + countPhone + " sản phẩm");
        System.out.println("Số sản phẩm laptop là: " + countLaptop + " sản phẩm");
        System.out.println("Số sản phẩm của Apple là: " + countApple + " sản phẩm");
        System.out.println("Số sản phẩm phụ kiện là: " + countAccessories + " sản phẩm");
    }
}
