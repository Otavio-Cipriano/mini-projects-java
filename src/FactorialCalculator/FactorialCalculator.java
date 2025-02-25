package FactorialCalculator;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int num = 0;
        int factorial = 1;
        String toPrint = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Which number do you want the factorial?");
        if(input.hasNextInt()){
            num = (int) input.nextInt();
        }else{
            System.out.println("Error: Enter a valid integer number.");
            System.exit(0);
        }

        if(num <= 2){
            System.out.println(num);
            System.exit(0);
        }
        for (int i = 0; i < num; i++) {
            factorial += i * factorial;
            if(i == 0){
                toPrint +=  (i + 1);
            }else {
                toPrint =   (i + 1) + " + " + toPrint;
            }
        }


        System.out.println("Factorial");
        System.out.println(num+"!"+" = "+ toPrint + " = " + factorial);
    }
}
