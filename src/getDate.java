/**
 * Created by atharva on 29-06-2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class getDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int dd = Integer.parseInt(day);
        int mm = Integer.parseInt(month);
        int yy = Integer.parseInt(year);
        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());
    }
}
