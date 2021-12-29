import java.util.Scanner;

public class ProductService {
    public Product createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đơn vị tính");
        System.out.println("Lựa chọn đơn vị");
        System.out.println("Chọn 1 - Chiếc");
        System.out.println("Chọn 2 - Gói");
        System.out.println("Chọn 3 - Thùng");
        int choice = Integer.parseInt(sc.nextLine());
        Unit unit = Unit.UNIT1;
        if(choice == 1){
            unit = Unit.UNIT1;
        }else if (choice == 2){
            unit = Unit.UNIT2;
        }else if (choice == 3){
            unit = Unit.UNIT3;
        }else {
            System.out.println("Không có lựa chọn này. đã chọn mặc định là \"Chiếc\"");
        }
        System.out.println("Nhập giá mua");
        double priceBuy = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá bán");
        double priceSell = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng bán");
        int amountSell = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id, name, amount, unit, priceBuy, priceSell, amountSell);
        return newProduct;
    }

    public double profit(double priceBuy, double priceSell, int amountSell){
        return (priceSell-priceBuy)*amountSell;
    }

    public Product[] addProduct(int size){
        Product[] products = new Product[size];
        for (int i =0; i<size;i++){
            products[i] = createProduct();
        }
        return products;
    }

    public void show(Product[] products){
        for (Product j : products){
            System.out.println(j + " lãi của sản phẩm là: " + profit(j.priceBuy, j.priceSell, j.amountSell));
        }
    }
}
