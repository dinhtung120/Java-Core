public class CountChar {
    public static void countChar() {
        String chuoi = "You only live once, but if you do it right, once is enough";
        int count = 0;
        char kyTu = 'o';

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Ký tự " + kyTu + " ở vị trí: " + i);
                count++;
            }
        }
        System.out.println("--> Số kí tự " + kyTu + " trong chuỗi là: " + count);
    }
}
