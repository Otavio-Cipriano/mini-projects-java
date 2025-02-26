package EmployeeManagementSystem;

public class EmployeeController {
    public static void create(EmployeeModel employee){
        EmployeeRepository.create(employee);
        System.out.println("""
                ============================================
                | Employee added with Success               |
                ============================================
                |   id  |   name    |   role    |   salary  |
                --------------------------------------------""");
        System.out.println("|   " + employee.id + " |   " +"|   " + employee.name + " |   " +
                "|   " + employee.role  + "|   " + employee.salary + " |");
    }
}
