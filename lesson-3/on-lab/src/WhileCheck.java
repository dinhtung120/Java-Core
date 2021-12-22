import java.util.Random;
import java.util.Scanner;

public class WhileCheck {
//    public static void whileCheck(){
//        Random rd = new Random();
//        int rdNumber = 0;
//        int count = 0;
//        while (rdNumber < 10){
//            rdNumber = rd.nextInt(15);
//            System.out.println(rdNumber);
//            count++;
//        }
//        System.out.println("Số lần lặp " +count);
//    }

    public static void whileCheck2(){
        Scanner sc = new Scanner(System.in);
        double weight = 0;
        double height =0;

        do {
            System.out.println("Nhập chiều cao");
            height = sc.nextDouble();
        }while (height<=0 || height>=2.5);

        do {
            System.out.println("Nhập cân nặng");
            weight = sc.nextDouble();
        }while (weight<=0 || weight>=100);
        double bmi = weight/(height*height);
        System.out.println("BMI của bạn là: " + bmi);


    }
}
