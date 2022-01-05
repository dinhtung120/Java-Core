public class Main {
    public static void main(String[] args) {

        Waiter[] waiters = Waiter.getAllWaiter();
        System.out.println("Danh sách bồi bàn:");
        Waiter.printWaiter(waiters);

        System.out.println();

        Kitchen[] kitchens = Kitchen.getAllKichen();
        System.out.println("Danh sách đầu bếp:");
        Kitchen.printKitchen(kitchens);
    }
}
