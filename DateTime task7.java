package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Main{
    public static LocalDate convertStringToLocalDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(dateStr, formatter);
    }
    public static String formatLocalDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }
    public static void main(String[] args) {
        String inputDate = "15-10-2023";
        try {
            LocalDate date = convertStringToLocalDate(inputDate);
            LocalDate newDate = date.plusDays(10);
            String formattedDate = formatLocalDate(newDate);
            System.out.println("Новая дата: " + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты: " + e.getMessage());
        }
    }
}
