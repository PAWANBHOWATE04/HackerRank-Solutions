import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                // Using bitwise left shift (1 << j) is 
                // more efficient for calculating 2^j
                sum += (1 << j) * b;

                // print() keeps the series on a single line
                System.out.print(sum + " ");
            }
            // println() moves to a new line for the next query result
            System.out.println();
        }
        in.close();
    }
}
