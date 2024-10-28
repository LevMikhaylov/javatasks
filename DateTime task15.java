package org.example;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Main{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 10, 28); // Пример даты
        String dayName = getWeekdayNameInRussian(date);
        System.out.println("День недели: " + dayName);
    }
    public static String getWeekdayNameInRussian(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String[] daysInRussian = new String[]{
                "Воскресенье",
                "Понедельник",
                "Вторник",
                "Среда",
                "Четверг",
                "Пятница",
                "Суббота"
        };
        return daysInRussian[dayOfWeek.getValue() % 7];
    }
}
