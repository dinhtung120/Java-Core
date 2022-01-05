public class Waiter extends Employee {
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + compensate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + formatMoney(compensate);
    }

    public static Waiter[] getAllWaiter() {
        Waiter[] waiters = new Waiter[1];
        waiters[0] = new Waiter(1, "Tùng", 26, 10000000, 2000000);
        return waiters;
    }

    public static void printWaiter(Waiter[] waiters) {
        for (Waiter waiter : waiters) {
            System.out.println(waiter);
        }
    }
}
