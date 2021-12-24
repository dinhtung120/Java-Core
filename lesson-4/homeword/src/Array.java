import java.util.Scanner;

public class Array {
    public static String[] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = sc.next();
        }
        return arr;
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void countJava(String[] arr) {
        int count = 0;
        String compare = "Java";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(compare)) {
                count++;
                System.out.printf("Xuất hiện \"Java\" ở vị trí [%d] \n", i);
            }
        }
        System.out.println("Số lần Java xuất hiện là: " + count + " lần");
    }

    public static void searchString(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm: ");
        String compare = sc.next();

        for (int i = 0; i< arr.length;i++){
            if(arr[i].equals(compare)){
                System.out.printf("Phát hiện \"%s\" ở vị trí [%d] của mảng \n", compare, i);
            }
        }

    }
}
