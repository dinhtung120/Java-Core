import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        ArrayList<Product> products = service.getAllPruduct();

//        service.show(products);

//        service.searchByName(products,"áo");

//        service.sortByUnit(products);

//        service.sortByUnit(products);

        Controller.mainMenu();
    }
}
