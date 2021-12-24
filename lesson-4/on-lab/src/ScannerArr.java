import java.util.Scanner;

public class ScannerArr {
    public static int[] scannerArr(){
        int[] arrInt = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số 0");
        arrInt[0] = sc.nextInt();
        System.out.println("Nhập số 1");
        arrInt[1] = sc.nextInt();
        System.out.println("Nhập số 2");
        arrInt[2] = sc.nextInt();
        System.out.println("Nhập số 3");
        arrInt[3] = sc.nextInt();
        System.out.println("Nhập số 4");
        arrInt[4] = sc.nextInt();

        return arrInt;
    }

    public static void printArr(int[] arrInt){
        for (int i =0; i<arrInt.length;i++){
            System.out.print(arrInt[i] + "\t");
        }
    }
}
