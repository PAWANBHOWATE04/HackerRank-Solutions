import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     * The findDay function calculates the day of the week for a specific date.
     * month: 1 to 12
     * day: 1 to 31
     * year: 2000 to 3000
     */
    public static String findDay(int month, int day, int year) {
        // Step 1: Initialize the Calendar object. 
        // Calendar is an abstract class, so we use getInstance() to get a locale-specific calendar.
        Calendar cal = Calendar.getInstance();

        /* * Step 2: Set the specific date.
         * IMPORTANT: In the Calendar class, months are 0-indexed (January is 0, February is 1).
         * Since input month is 1-indexed (January is 1), we must subtract 1.
         */
        cal.set(year, month - 1, day);

        /* * Step 3: Extract the String representation of the Day of the Week.
         * - Calendar.DAY_OF_WEEK: Tells the getter we want the day name, not the number.
         * - Calendar.LONG: Requests the full name (e.g., "Monday") instead of "Mon".
         * - Locale.US: Ensures the output is in English regardless of the server's region.
         */
        String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);

        /* * Step 4: Final Formatting.
         * Convert "Monday" to "MONDAY" to match standard competitive programming output formats.
         */
        return dayName.toUpperCase();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input reading from the console/system input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Set up output writing to the destination defined by the environment
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read the first line of input and split it into an array of strings [month, day, year]
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Convert string inputs into integers for processing
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Call our logic function
        String res = Result.findDay(month, day, year);

        // Write the result string to the output buffer
        bufferedWriter.write(res);
        bufferedWriter.newLine();

        // Close streams to prevent memory leaks
        bufferedReader.close();
        bufferedWriter.close();
    }
}