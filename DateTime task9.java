package org.example;
import java.time.LocalDate;
import java.time.Period;
public class Main{
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2006, 12, 12); // 12 декабря 2006 года
        int age = calculateAge(birthDate);
        System.out.println("Текущий возраст: " + age + " лет");
    }
    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }
}
