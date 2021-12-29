public class Product{
    public int id;
    public String name;
    public int amount;
    public Unit unit;
    public double priceBuy;
    public double priceSell;
    public int amountSell;

    public Product(int id, String name, int amount, Unit unit, double priceBuy, double priceSell, int amountSell) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.amountSell = amountSell;
    }

    @Override
    public String toString() {
        return  "Sản phẩm: " + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", unit=" + unit +
                ", priceBuy=" + priceBuy +
                ", priceSell=" + priceSell +
                ", amountSell=" + amountSell
                ;
    }
}
