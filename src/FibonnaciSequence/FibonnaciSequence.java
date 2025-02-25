package FibonnaciSequence;

import java.util.Scanner;

public class FibonnaciSequence {

    public static void main(String[] args) {
        int numOfFibo, back, front, sum = 0;
        front = 1;
        back = numOfFibo = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many number of Fibonnaci Sequence ?");
        if(input.hasNextInt()){
            numOfFibo = (int) input.nextInt();
            System.out.println(numOfFibo);
        }else{
            System.out.println("Error: Enter a valid integer number.");
            System.exit(0);
        }
        input.close();

        for (int i = 0; i <= numOfFibo; i++) {
            System.out.print( back + " ");
            sum = back + front;
            back = front;
            front = sum;
        }

    }
}
