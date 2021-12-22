import java.util.Scanner;

public class Triangle {
    public static void check(double a, double b, double c) {
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("ABC là tam giác");
        } else {
            System.out.println("ABC không là tam giác");
        }

    }

    public static void check2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số A");
        double a2 = sc.nextDouble();

        System.out.println("Nhập số B");
        double b2 = sc.nextDouble();

        System.out.println("Nhập số C");
        double c2 = sc.nextDouble();

        if ((a2 + b2) > c2 && (b2 + c2) > a2 && (a2 + c2) > b2) {
            System.out.println("ABC là tam giác");
        } else {
            System.out.println("ABC không là tam giác");
        }
    }
}
