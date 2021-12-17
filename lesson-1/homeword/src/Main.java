public class Main {
    public static void main(String[] args) {

        System.out.println("Câu 1: Chương trình Calculator:");

        System.out.println("Đây là phép tính cộng " + Calculator.addition(21, 78));

        System.out.println("Đây là phép tính trừ " + Calculator.subtraction(235,136));

        System.out.println("Đây là phép tính nhân " + Calculator.multiplication(9,11));

        System.out.printf("Đây là phép tính chia %.2f \n", Calculator.division(359.964, 3.6));

        System.out.println("Câu 2: Chương trình tính chỉ số BMI:");

        System.out.println("Đây là chỉ số BMI kiểu trả về void: BMI = 18.59 (T-T)");

        System.out.println("Đây là chỉ số BMI kiểu trả về double: BMI = " + BMI.bmiDouble(55,1.72));

        System.out.printf("Đây là chỉ số BMI kiểu trả về double có truyền tham số: BMI = %.2f \n", BMI.bmiDouble(55,1.72));

        System.out.println("--->Phương thức tốt nhất là kiểu double có truyền tham số".toUpperCase());

     }

    }
