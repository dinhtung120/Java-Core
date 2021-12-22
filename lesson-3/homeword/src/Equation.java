import java.util.Scanner;

public class Equation {
    public static void equation() {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;

        System.out.println("Nhập số a: ");
        a = sc.nextDouble();

        System.out.println("Nhập số b: ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình: " + a + "x + " + b + " = 0 có vô số nghiệm");
            } else {
                System.out.println("Phương trình: " + a + "x + " + b + " = 0 vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình: " + a + "x + " + b + " = 0 có nghiệm duy nhất là: x = " + x);
        }
    }
}
