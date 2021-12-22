import java.util.Random;
import java.util.Scanner;

public class CheckNumber {
    public static void checkNumber(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);
        boolean isContinue = true;

        while (isContinue){
            System.out.println("Đoán số");
            int number = sc.nextInt();

            if(number == rdNumber){
                System.out.println("Bạn đoán đúng rồi");
                isContinue = false;
            }else if (number > rdNumber){
                System.out.println("Bạn đoán lớn rồi");
            }else {
                System.out.println("Bạn đoán nhỏ rồi");
            }
        }
    }
}
