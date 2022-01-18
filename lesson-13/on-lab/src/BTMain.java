import java.util.ArrayList;

public class BTMain {
    public static void main(String[] args) {
        BTPersonModel<BTStudent> students = new BTPersonModel<>();
        BTPersonModel<BTEmployee> employees = new BTPersonModel<>();


        students.add(new BTStudent(1, "Tùng", 15));
        students.add(new BTStudent(2, "Tùng2", 25));

        employees.add(new BTEmployee(3,"Tung3",1000));
        employees.add(new BTEmployee(4,"Tung4",2000));

        System.out.println("Danh sách học sinh");
        students.display();

        System.out.println("Danh sách giáo viên");
        employees.display();



    }
}
