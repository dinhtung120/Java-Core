public class Main {
    public static void main(String[] args) {
        
        System.out.println("Danh sách nhân viên: ");
        Employee[] employees = EmployeeService.getAllEmployee();
        EmployeeService.printEmployee(employees);

    }
}
