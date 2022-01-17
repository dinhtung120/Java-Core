import java.util.Scanner;

public class Bmi {

    public void bmiCalcu() {
        System.out.println("Nhập chiều cao");
        double height = input();
        System.out.println("Nhập cân nặng");
        double weight = input();

        double bmi = weight/(height*height);
        System.out.println("chỉ số bmi của bạn là: " +bmi);
    }

    public double input() {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                number = Double.parseDouble(scanner.nextLine());
                if (number <= 0) {
                    throw new MyException("Không hợp lệ");
                }
                isContinue = false;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("vui lòng nhập lại:");
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }

        return number;
    }
}
