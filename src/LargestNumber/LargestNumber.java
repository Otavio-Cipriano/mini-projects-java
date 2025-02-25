package LargestNumber;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numbers list - ex: 1,2,3 or 24, 34 60");
        System.out.print(">");
        String nums = input.next();
        String[] numsList = nums.split(",");
        int largerNum =  Integer.parseInt(numsList[0]);
        for (String num : numsList){
            int currentNum = Integer.parseInt(num);
            if(largerNum < currentNum){
                largerNum = currentNum;
            }
        }
        System.out.println(largerNum);
    }

}
