package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter a operation: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        String operation = input.nextLine();
        System.out.println("Enter a second Number: ");
        int num2 = Integer.parseInt(input.nextLine());
        int result;
        String finaResult = " ";
        switch (operation){
            case "1":
                result = num1  + num2;
                finaResult = "Addition is " + result;
                break;
            case "2":
                result = num1 - num2;
                finaResult = "Subtraction is " + result;
                break;
            case "3":
                result = num1 * num2;
                finaResult = "Multiplication is " + result;
                break;
            case "4":
                result = num1 / num2;
                finaResult = "Division is " + result;
                break;
        }

        System.out.println("The result of your " + finaResult);
    }
}

