package EmployeeManagementSystem;

public class EmployeeModel {
    private static int counter = 0;
    int id;
    String name;
    String role;

    double salary;

    public EmployeeModel(String name, String role, Double salary){
        this.id = ++counter;
        this.name = name;
        this.role = role;
        this.salary= salary;
    }
}
