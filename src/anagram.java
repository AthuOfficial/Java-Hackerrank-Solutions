/**
 * Created by atharva on 30-06-2017.
 */

import java.io.*;
import java.util.*;
public class anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] array1 = a.toCharArray();
        Arrays.sort(array1);
        String newString1 = new String(array1);
        char[] array2 = b.toCharArray();
        Arrays.sort(array2);
        String newString2 = new String(array2);
        if(newString1.compareTo(newString2) == 0)
            return true;
        else
            return false;
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }

    }
}
