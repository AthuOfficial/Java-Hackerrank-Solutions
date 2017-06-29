import java.util.Scanner;

/**
 * Created by atharva on 29-06-2017.
 */
public class EndOfLine {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; sc.hasNext()==true; i++){
            System.out.println(i + " " +sc.nextLine());
        }
    }
}
