public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + formatMoney(serviceCharge);
    }

    public static Kitchen[] getAllKichen() {
        Kitchen[] kitchens = new Kitchen[1];
        kitchens[0] = new Kitchen(2, "Tuấn", 28, 12000000, 3000000);
        return kitchens;
    }

    public static void printKitchen(Kitchen[] kitchens) {
        for (Kitchen kitchen : kitchens) {
            System.out.println(kitchen);
        }
    }
}
