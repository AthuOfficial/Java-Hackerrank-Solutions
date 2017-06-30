/**
 * Created by atharva on 30-06-2017.
 */
import java.io.*;
import java.util.*;
public class reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer test = new StringBuffer(A);
        System.out.println(A.compareTo((test.reverse()).toString()) == 0?"Yes":"No");

    }
}
