//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ListInteger {
//    ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(2);
//        numbers.add(9);
//        numbers.add(7);
//
//
//        System.out.println(numbers);
//
//        System.out.println("Sử dụng for");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        System.out.println("\nSử dựng foreach");
//        for (Integer i: numbers){
//        System.out.print(i +"\t");
//    }
//
//        numbers.add(3,5);
//        System.out.println("\nSau khi thêm vào vị trí 3");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        numbers.remove(3);
//        System.out.println("\nSau khi xóa vị trí 3");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        numbers.set(3,100);
//        System.out.println("\nSau khi đổi vị trí 3");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        Collections.sort(numbers);
//        System.out.println("\nSau khi sắp xếp tăng dần");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        Collections.reverse(numbers);
//        System.out.println("\nSau khi sắp xếp giảm dần");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//
//        Collections.swap(numbers,0,numbers.size()-1);
//        System.out.println("\nSau khi đổi vị trí đầu xuống  cuối");
//        for (int i = 0; i< numbers.size(); i++){
//        System.out.print(numbers.get(i) + "\t");
//    }
//}
