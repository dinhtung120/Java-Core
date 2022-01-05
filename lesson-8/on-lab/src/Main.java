import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//    Student s = new Student(1,"Tùng", LocalDate.of(1994,11,3),"Java 08",8.5);
//
//        System.out.println(s);
//
//    Teacher t = new Teacher(2,"Ngọc",LocalDate.of(1996,8,19),"Java Core",80000000);
//
//        System.out.println(t);

        Developer d = new Developer(1, "Tùng", LocalDate.of(1994, 11, 3), 5000000, 20);
        System.out.println(d);

        Tester t = new Tester(2,"Lucifer",LocalDate.of(1993,1,9),30000000,10);
        System.out.println(t);


    }
}
