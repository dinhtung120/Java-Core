import java.util.Scanner;

public class Poin {
    public static void poin(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm thực hành: ");
        double poin1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Nhập điểm lý thuyết: ");
        double poin2 = sc.nextDouble();

        sc.nextLine();

        double average =(poin1 + poin2)/2;
        System.out.printf("Điểm trung bình của bạn là: %.2f \n", average);

        String result = average >= 6 ? "Chúc mừng, bạn đã qua môn" : "Hẹn gặp lại bạn vào kỳ sau";
        System.out.println(result);

    }
}
