import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        ArrayList<Employee> employees = service.getAllEmployee();

        service.sortByAge(employees);
        System.out.println();
        service.top3Age(employees);
    }
}
