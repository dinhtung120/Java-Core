import java.util.Arrays;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int amount;
    private int amountSell;
    private String brand;
    private Category[] category;

    public Product(int id, String name, String description, long price, int amount, int amountSell, String brand, Category[] category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.amountSell = amountSell;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(int amountSell) {
        this.amountSell = amountSell;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category[] getCategory() {
        return category;
    }

    public void setCategory(Category[] category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return
                id + " - " + name + " - " + description
                        + " - " + price + " - " + amount + " - " + amountSell
                        + " - " + brand + " - " + Arrays.toString(category);

    }
}
