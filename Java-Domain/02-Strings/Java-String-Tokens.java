import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // We use trim() to remove leading/trailing whitespace which can cause empty tokens
        String s = scan.nextLine().trim();
        
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            // Split by any character that is NOT an English letter
            // The '+' ensures we treat multiple consecutive special characters as one delimiter
            String[] tokens = s.split("[^A-Za-z]+");
            
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}