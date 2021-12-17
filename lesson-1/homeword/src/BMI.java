public class BMI {

    public static void bmiVoid(double weigh, double heigh, double bmi){
        System.out.println("Đây là chỉ số BMI kiểu trả về void: BMI = 18.59 (T-T)");
        weigh = 55;
        heigh = 1.72;
        bmi = weigh/(heigh*heigh);

    }

    public static double bmiDouble(double weigh, double heigh){

        return weigh/(heigh*heigh);
    }
}
