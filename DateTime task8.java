package org.example;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
public class Main{
    public static String convertUTCtoTimeZone(String utcDateTime, String targetTimeZone) {
        ZonedDateTime utcZonedDateTime = ZonedDateTime.parse(utcDateTime);
        ZonedDateTime targetZonedDateTime = utcZonedDateTime.withZoneSameInstant(ZoneId.of(targetTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        return targetZonedDateTime.format(formatter);
    }
    public static void main(String[] args) {
        String utcDateTime = "2024-10-28T12:00:00Z";
        String targetTimeZone = "Europe/Moscow";
        String convertedDateTime = convertUTCtoTimeZone(utcDateTime, targetTimeZone);
        System.out.println("Время в " + targetTimeZone + ": " + convertedDateTime);
    }
}
