package PalindromeChecker;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word to Check, If is a Palindrome: ");
        String word = (String) input.nextLine();

        if (word.isEmpty()){
            System.out.println("No word entered");
            System.exit(0);
        }
        if(word.length() < 3){
            System.out.println("Word Too Short");
            System.exit(0);
        }

        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                System.out.println("Not a Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Is a Palindrome");
    }
}