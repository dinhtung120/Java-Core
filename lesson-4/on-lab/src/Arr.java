public class Arr {
    public static void arrInt() {
        int[] intArr = new int[5]; //khởi tạo

        intArr[0] = 9; // Gán giá trị
        intArr[1] = 5;
        intArr[2] = 70;
        intArr[3] = 2;
        intArr[4] = 6;

        int min = intArr[0];
        int max = intArr[0];

        System.out.println("\nMảng vừa tạo");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }

        System.out.println("\nIn số chẵn");

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                System.out.print(intArr[i] + "\t");
            }

        }

        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];

            }
            if (max< intArr[i]){
                max = intArr[i];
            }

            }
        System.out.println("\nSố nhỏ nhất là " + min);
        System.out.println("Số lớn nhất là " + max);

        System.out.println("Sắp xếp tăng dần");
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j<intArr.length; j++){
                if(intArr[i]>intArr[j]){
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }


        String[] strArr = new String[5];
        strArr[0] = "Không";
        strArr[1] = "Một";
        strArr[2] = "Hai";
        strArr[3] = "Ba";
        strArr[4] = "Bốn";

        System.out.println("\nMảng vừa tạo");

        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + "\t");
        }
    }

}

