public class Number {

    public static boolean isPrimeNumber(int number){
        if (number < 2){
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i<=sqrt;i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}
