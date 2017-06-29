/**
 * Created by athar on 29-06-2017.
 * As they have already defined a flag below, we only have this method to use
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Initializer {

    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
