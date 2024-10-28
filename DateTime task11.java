package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
public class Main{
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1); // 1 января 2023 года
        LocalDate endDate = LocalDate.of(2023, 12, 31); // 31 декабря 2023 года
try {
    LocalDate randomDate = generateRandomDate(startDate, endDate);
    System.out.println("Случайная дата в диапазоне: " + randomDate);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
    }
    public static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("Начальная дата должна быть раньше конечной даты.");
        }
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        Random random = new Random();
        long randomDays = random.nextInt((int) daysBetween);
        return startDate.plusDays(randomDays);
    }
}
