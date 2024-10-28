package org.example;
import java.time.LocalDate;
public class Main {
    public static String compareDates(LocalDate date1, LocalDate date2) {
        return date1.isBefore(date2)?date1 + " меньше чем " + date2:date1.isAfter(date2)?date1 + " больше чем " + date2:date1 + " равна " + date2;
    }
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 10, 10);
        String result = compareDates(date1, date2);
        System.out.println(result);
    }
}
