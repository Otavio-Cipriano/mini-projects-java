package EmployeeManagementSystem;

import java.util.Scanner;



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO EMPLOYER MANAGEMENT SYSTEM");
        System.out.println("What do you want to do ?");
        System.out.print("""
                1 - Add Employee
                2 - List Employees
                3 - Employee Information
                4 - Edit Employee info
                >""");
        String action = input.nextLine();
        System.out.println(action);
        switch (action){
            case "1":
                System.out.println("Enter Employee name:");
                String name = input.nextLine();
                System.out.println("Enter Employee role:");
                String role = input.nextLine();
                System.out.println("Enter Employee salary:");
                double salary = Double.parseDouble(input.nextLine());
                EmployeeModel employee = new EmployeeModel(name, role, salary);
                EmployeeController.create(employee);
                break;
            default:
                System.out.println("buuu");
                break;
        }
    }
}
