import java.util.Scanner;

public class CheckMonth {
    public static void checkMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng bất kỳ");
        int month = sc.nextInt();

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                System.out.println("Có 28 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng này");
                break;
        }
    }
}
