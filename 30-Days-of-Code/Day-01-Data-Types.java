import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Initial variables provided by the challenge
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* 1. Declare second integer, double, and String variables. */
        /* 2. Read and save an integer, double, and String to your variables. */
        int a = scan.nextInt();
        double b = scan.nextDouble();
        
        // Consume the leftover newline character after nextDouble() 
        // to ensure the next nextLine() reads the actual string input.
        scan.nextLine(); 
        String c = scan.nextLine();

        /* 3. Print the sum of both integer variables on a new line. */
        System.out.println(i + a);

        /* 4. Print the sum of the double variables on a new line. */
        System.out.println(d + b);

        /* 5. Concatenate and print the String variables on a new line. */
        System.out.println(s + c);

        scan.close();
    }
}