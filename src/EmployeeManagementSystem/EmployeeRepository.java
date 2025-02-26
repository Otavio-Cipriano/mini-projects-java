package EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeRepository {
    static ArrayList<EmployeeModel> employees = new ArrayList<>();

    public static void create(EmployeeModel employee){
        employees.add(employee);
    }
}
