import java.util.Scanner;

public class CheckString {
    public static void check(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi đầu tiên: ");
        String str1 = sc.nextLine();

        System.out.println("Nhập chuỗi thứ 2: ");
        String str2 = sc.nextLine();

        String test1 = str1.equals(str2) ? "Hai chuỗi bằng nhau" : "Hai chuỗi khác nhau";
        System.out.println(test1);

        String test2 = str1.length() == str2.length() ? "Hai chuỗi có kích thước bằng nhau" : "Hai chuỗi có kích thước khác nhau";
        System.out.println(test2);
    }
}
