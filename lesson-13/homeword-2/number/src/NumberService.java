import java.util.Scanner;

public class NumberService {

    public void checkPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        String choice;
        int number;

        try {
            while (isContinue) {
                System.out.println("Nhập số bạn muốn kiểm tra: ");
                choice = scanner.nextLine();
                if (choice.equals("x") | choice.equals("q")) {
                    System.out.println("cảm ơn bạn đã sử dụng chương trình");
                    isContinue = false;
                } else {
                    number = Integer.valueOf(choice);
                    if (Number.isPrimeNumber(number) == true) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không phải là số nguyên tố");
                    }
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("bạn phải nhập số");
            checkPrimeNumber();
        }


    }
}

