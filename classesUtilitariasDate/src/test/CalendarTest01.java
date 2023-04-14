package test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        if (cal.getFirstDayOfWeek() == Calendar.SUNDAY){
            {
                System.out.println("Domingo");
            }
        }

        Date date = cal.getTime();
        System.out.println(date);
    }
}
