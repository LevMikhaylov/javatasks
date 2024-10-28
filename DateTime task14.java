package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 10, 23); // Пример даты
        String formattedDateRu = formatDateWithLocale(date, "ru");
        String formattedDateEn = formatDateWithLocale(date, "en");
        System.out.println("Форматированная дата (RU): " + formattedDateRu);
        System.out.println("Форматированная дата (EN): " + formattedDateEn);
    }
    public static String formatDateWithLocale(LocalDate date, String localeCode) {
        Locale locale = new Locale(localeCode);
        DateTimeFormatter formatter;
        if (locale.getLanguage().equals("ru")) {
            formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        } else {
            formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", locale);
        }
        return date.format(formatter);
    }
}
