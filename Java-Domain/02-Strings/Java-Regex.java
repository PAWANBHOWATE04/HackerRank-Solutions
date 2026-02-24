import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    /*
     * Breakdown of the sub-pattern:
     * ([01]?\\d{1,2}|2[0-4]\\d|25[0-5])
     * * 1. [01]?\\d{1,2} : Matches numbers from 0 to 199. 
     * - [01]? allows for 0 or 1 at the start.
     * - \\d{1,2} allows for one or two digits following.
     * - This handles cases like "0", "00", "000", "1", "12", "199".
     * * 2. 2[0-4]\\d : Matches numbers from 200 to 249.
     * * 3. 25[0-5] : Matches numbers from 250 to 255.
     */
    String subPattern = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    
    // Concatenate the sub-pattern four times, separated by escaped dots
    public String pattern = subPattern + "\\." + subPattern + "\\." + subPattern + "\\." + subPattern;
}