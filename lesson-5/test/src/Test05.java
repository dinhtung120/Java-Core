import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Test05 {

    public static void question1a() {
        int height = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void question1b() {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void question2a() {
        String str = "You only live once, but if you do it right, once is enough";
        int count = 1;
        char kiTu = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println("Chuỗi đã cho có " + count + " từ");
    }

    public static void question2b() {
        String str = "You only live once, but if you do it right, once is enough";
        int count = 0;
        char kiTu = 'o';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kiTu) {
                System.out.printf("Phát hiện kí tự \'%c\' ở vị trí %d \n", kiTu, i);
                count++;
            }
        }
        System.out.println("Chuỗi đã cho có " + count + " kí tự \'" + kiTu + "\'");
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void question3() {
        Random rd = new Random();
        int rdNumber = rd.nextInt();
        System.out.println("Số ngẫu nhiên là: " + rdNumber);

        if (isPrimeNumber(rdNumber)) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải là số nguyên tố");
        }
    }

    public static void question4() {
        int count = 0;
        int soNguyenTo = 10;
        int i = 2;
        System.out.printf("10 số nguyên tố đầu tiên là: ");
        while (count < soNguyenTo) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

        System.out.printf("\nCác số nguyên tố nhỏ hơn 10 là: ");
        for (int j = 2; j < 10; j++) {
            if (isPrimeNumber(j)) {
                System.out.print(j + " ");
            }
        }
    }

    public static void question5a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String str = sc.nextLine();
        System.out.println("Chuỗi đã nhập là: \"" + str + "\"");

        str = str.trim().toLowerCase(Locale.ROOT);// Cắt khoảng trắng 2 đầu + thu nhỏ chữ
        str = str.replaceAll("\\s+", " ");// Xóa khoảng trắng nhiều
        char[] temp = str.toCharArray();// tạo mảng char
        boolean space = true;

        for (int i = 0; i < temp.length; i++) {
            if (Character.isLetter(temp[i])) {
                if (space) {
                    temp[i] = Character.toUpperCase(temp[i]);// tìm kí tự khoảng trắng
                    space = false;
                }
            } else {
                space = true;
            }
        }
        str = String.valueOf(temp);
        System.out.println("Chuỗi sau khi chuẩn hóa là: " + str);
    }

    public static int[][] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        System.out.println("Mảng đã tạo là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void printDuongCheo(int[][] arr) {
        System.out.print("Đường chéo chính là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void question5b() {
        String str = " ";
        char kyTu = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            kyTu = str.charAt(str.length() - i - 1);
            if (str.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là Panlyndrome");
                break;
            } else {
                System.out.println("Chuỗi này không phải là Panlyndrome");
                break;
            }
        }

    }
}
