import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input string
        String n = bufferedReader.readLine();
        
        // Create a BigInteger object from the string
        BigInteger bigInt = new BigInteger(n);
        
        // Check for primality with a certainty of 10
        // isProbablePrime returns true if it's likely prime, false if definitely composite
        if (bigInt.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}