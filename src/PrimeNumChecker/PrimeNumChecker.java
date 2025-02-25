package PrimeNumChecker;

import java.util.Scanner;

public class PrimeNumChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it's par");
        int num = 0;
        if(input.hasNextInt()){
            num = (int) input.nextInt();
        }else{
            System.out.println("Error: Enter a valid integer number.");
            System.exit(0);
        }
        input.close();

        if(num <= 1){
            System.out.println("It's not Prime");
            System.exit(0);
        }

        if(num == 2){
            System.out.println("It's a Prime Number");
            System.exit(0);
        }

        if(num % 2 == 0){
            System.out.println("It's a Prime Number");
            System.exit(0);
        }

        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0){
                System.out.println("It's not a Prime Number");
                System.exit(0);
            }
        }

        System.out.println("It's a Prime Number");
    }
}
