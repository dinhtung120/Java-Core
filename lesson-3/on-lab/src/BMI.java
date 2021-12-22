public class BMI {
    public static void bmiPoin(double weigh, double heigh) {
        double bmi = weigh / (heigh * heigh);
        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi >= 15.5 && bmi <= 24.9) {
            System.out.println("Bình thường");
        } else {
            System.out.println("Béo");
        }
        ;
    }
}
