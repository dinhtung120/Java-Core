public class ForCheck {
    //    public static void forcheck(){
//        for (int i=1;i<=10;i++){
//            System.out.println("Hello World");
//        }
//    }
    public static void forCheck2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
