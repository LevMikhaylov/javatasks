package org.example;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
public class Main{
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023, 10, 23, 9, 0); // 23 октября 2023, 09:00
        LocalDateTime end = LocalDateTime.of(2023, 10, 27, 17, 0); // 27 октября 2023, 17:00
        try {
            long workingHours = calculateWorkingHours(start, end);
            System.out.printf("Количество рабочих часов: %d часов.%n", workingHours);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для вычисления количества рабочих часов
    public static long calculateWorkingHours(LocalDateTime start, LocalDateTime end) throws IllegalArgumentException{
        // Проверяем, что начало меньше конца
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Начало рабочего дня должно быть раньше конца рабочего дня.");
        }

        long totalWorkingHours = 0;

        // Переменная для текущего времени, начинаем с начала рабочего дня
        LocalDateTime current = start;

        // Проходим по всем дням от начала до конца
        while (current.isBefore(end)) {
            if (isWorkingDay(current)) {
                LocalDateTime workEnd = current.withHour(17).withMinute(0).withSecond(0).withNano(0);
                LocalDateTime validEnd = end.isBefore(workEnd) ? end : workEnd;
                if (current.isBefore(validEnd)) {
                    Duration duration = Duration.between(current, validEnd);
                    totalWorkingHours += duration.toHours();
                }
            }
            current = current.plusDays(1).withHour(9).withMinute(0).withSecond(0).withNano(0); // Начало следующего рабочего дня
        }

        return totalWorkingHours;
    }
    public static boolean isWorkingDay(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY; // Рабочие дни: Пн-Пт
    }
}
