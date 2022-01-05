public class EmployeeService {
    public static Employee[] getAllEmployee(){
        Employee[] employees = new Employee[3];
        employees[0] = new Waiter(1,"Tuấn",26,10000000,2000000);
        employees[1] = new Kitchen(2,"Tùng",28,12000000,5000000);
        employees[2] = new Kitchen(3,"Hoàng",28,12000000,3000000);
        return employees;
    }

    public static void printEmployee(Employee[] employees){
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}
