import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
//        while (isContinue) {
//
//            try {
//                System.out.println("nhập a");
//                int a = Integer.parseInt(scanner.nextLine());
//                System.out.println("nhap b");
//                int b = Integer.parseInt(scanner.nextLine());
//                int c = b / a;
//                System.out.println(c);
//                isContinue = false;
//            } catch (ArithmeticException e) {
//                System.out.println("Bạn đang chia 1 số cho 0");
//            } catch (NumberFormatException e){
//                System.out.println("Bạn phải nhập số");
//            } finally {
//                System.out.println("Tạm biệt");
//            }
//
//        }


//        while (isContinue){
//            System.out.println("Nhập tuổi");
//            try {
//                int age = Integer.parseInt(scanner.nextLine());
//                Validate.validateAge(age);
//                isContinue = false;
//            } catch (MyException e) {
//                e.printStackTrace();
//            } catch (NumberFormatException e){
//                e.printStackTrace();
//            }
//        }

        Bmi bmi = new Bmi();
        bmi.bmiCalcu();
    }
}
