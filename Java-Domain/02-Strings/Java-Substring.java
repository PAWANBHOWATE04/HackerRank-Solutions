import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        // Use the substring method and print the result
        System.out.println(S.substring(start, end));
        
        in.close(); // Good practice to close the scanner
    }
}