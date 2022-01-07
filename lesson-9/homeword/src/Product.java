public class Product {
    private int id;
    private String name;
    private long priceSell;
    private int amount;
    private Unit unit;
    private int amountSell;

    public Product(int id, String name, long priceSell, int amount, Unit unit, int amountSell) {
        this.id = id;
        this.name = name;
        this.priceSell = priceSell;
        this.amount = amount;
        this.unit = unit;
        this.amountSell = amountSell;
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

    public long getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(long priceSell) {
        this.priceSell = priceSell;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getAmountSell() {
        return amountSell;
    }

    public void setAmountSell(int amountSell) {
        this.amountSell = amountSell;
    }

    @Override
    public String toString() {
        return id + " - " +name + " - " +priceSell + " - " +amount + " - " +unit.getValue() + " - " +amountSell;
    }
}
