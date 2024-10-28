package org.example;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class Main{
    public static void main(String[] args) {
        printMonthlyCalendar(10, 2024);
    }
    public static void printMonthlyCalendar(int month, int year) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int daysInMonth = firstDayOfMonth.lengthOfMonth();
        System.out.println("Календарь на " + Month.of(month) + " " + year + ":");
        System.out.println("---------------------------------");
        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            boolean isWeekend = (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);
            String dayType = isWeekend ? "Выходной" : "Рабочий день";

            // Выводим дату и тип дня
            System.out.printf("%02d.%02d.%d - %s\n", day, month, year, dayType);
        }
    }
}
