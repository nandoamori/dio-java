package test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000L); // long de ms
        System.out.println(date);
    }
}
