public class Main {
    public static void main(String[] args) {
        System.out.println("\t Câu 1:");
        System.out.println("Vẽ hình vuông");
        Test05.question1a();

        System.out.println("Vẽ hình tam giác");
        Test05.question1b();
        System.out.println("\t Câu 2:Cho chuỗi sau\"You only live once, but if you do it right, once is enough\"");
        Test05.question2a();

        Test05.question2b();

        System.out.println("\t Câu 3:Sinh số ngẫu nhiên");
        Test05.question3();

        System.out.println("\t Câu 4:");
        Test05.question4();

        System.out.println("\n\t Câu 5:");
        Test05.question5a();

        Test05.question5b();

        System.out.println("\t Câu 6:");
        int[][] arr =Test05.creatArray();
        Test05.printArray(arr);
        Test05.printDuongCheo(arr);


    }
}
