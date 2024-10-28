package org.example;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main{
    public static int countWeekends(int year, int month) {
        int weekendCount = 0;
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                weekendCount++;
            }
        }
        return weekendCount;
    }

    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int weekends = countWeekends(year, month);
        System.out.println("Количество выходных в " + Month.of(month) + " " + year + ": " + weekends);
    }
}
