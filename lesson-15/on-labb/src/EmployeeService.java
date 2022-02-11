import java.util.ArrayList;

public class EmployeeService {
    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Robert",35));
        employees.add(new Employee("John",25));
        employees.add(new Employee("Emma",20));
        employees.add(new Employee("Chris",27));

        return employees;

    }

    public void sortByAge(ArrayList<Employee> employees){
        employees.stream().filter(employee -> employee.getAge() >25 )
                .forEach(employee -> System.out.println(employee));
    }

    public void top3Age(ArrayList<Employee> employees){
        employees.stream().sorted((o1, o2) -> o2.getAge()-o1.getAge())
                .limit(3)
                .forEach(employee -> System.out.println(employee));
    }
}
