import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // 1. Basic length check: if lengths differ, they can't be anagrams
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        // 2. Convert to lowercase to satisfy case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // 3. Use an array of size 26 (for 'a' through 'z') to track frequencies
        int[] frequencies = new int[26];

        // 4. Fill the frequency array
        for (int i = 0; i < a.length(); i++) {
            // Increment for character in string a
            frequencies[a.charAt(i) - 'a']++;
            // Decrement for character in string b
            frequencies[b.charAt(i) - 'a']--;
        }

        // 5. If it's an anagram, every index should be 0
        for (int count : frequencies) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}