package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
    public static long daysUntilNewYear() {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1);
        return ChronoUnit.DAYS.between(today, newYear);
    }
    public static void main(String[] args) {
        long daysLeft = daysUntilNewYear();
        System.out.println("Количество дней до Нового года: " + daysLeft);
    }
}
