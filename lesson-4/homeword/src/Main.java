public class Main {
    public static void main(String[] args) {
        System.out.println("\tTạo mảng:");
        String[] arr = Array.creatArray();
        System.out.println();

        System.out.println("\tMảng đã tạo là: ");
        Array.printArray(arr);
        System.out.println();

        System.out.println("\tĐếm số lần \"Java\" xuất hiện:");
        Array.countJava(arr);
        System.out.println();

        System.out.println("\t Tìm chuỗi trong mảng:");
        Array.searchString(arr);
    }
}
