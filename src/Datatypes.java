/**
 * Created by atharva on 29-06-2017.
 */
import java.util.*;
import java.io.*;



class Datatypes{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x= 56;
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                if(x>=-32768 && x<=32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-2147483647 && x<=2147483646){
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-(Math.pow(2,63)) && x<=(Math.pow(2,63))-1){
                    System.out.println("* long");
                }

                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

