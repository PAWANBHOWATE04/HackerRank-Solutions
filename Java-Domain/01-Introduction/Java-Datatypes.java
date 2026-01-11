import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                // 8-bit signed integer range
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                // 16-bit signed integer range
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }

                // 32-bit signed integer range
                if (x >= -2147483648L && x <= 2147483647L) {
                    System.out.println("* int");
                }

                // 64-bit signed integer range
                // If it passes sc.nextLong(), it automatically fits in a long
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } 
            catch (Exception e) {
                // If the number is too big for a long, catch the error and print this
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
