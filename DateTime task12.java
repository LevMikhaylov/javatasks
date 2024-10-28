package org.example;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String[] args) {
        String eventDateTimeString = "2023-12-30T23:58:58";
        LocalDateTime eventDateTime = LocalDateTime.parse(eventDateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        calculateTimeUntilEvent(eventDateTime);
    }
    public static void calculateTimeUntilEvent(LocalDateTime eventDateTime) {
        LocalDateTime now = LocalDateTime.now(); // Текущая дата и время
        if (eventDateTime.isBefore(now)) {
            System.out.println("Событие уже наступило!");
            return;
        }
        Duration duration = Duration.between(now, eventDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        System.out.printf("Осталось до события: %d часов, %d минут, %d секунд.%n", hours, minutes, seconds);
    }
}
