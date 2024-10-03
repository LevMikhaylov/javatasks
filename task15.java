import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class Main {
    private static final String DATE_PATTERN = "^\\d{2}\\.\\d{2}\\.\\d{4}$";
    private static final Pattern pattern = Pattern.compile(DATE_PATTERN);
    public static LocalDate validateDate(String date) throws DateTimeParseException {
        if (!pattern.matcher(date).matches()) {
            throw new DateTimeParseException("Invalid date format", date, 0);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        return parsedDate;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(validateDate("29.02.2020"));
            System.out.println(validateDate("29.02.2019"));
            System.out.println(validateDate("31.04.2021"));
            System.out.println(validateDate("01.01.2021"));
            System.out.println(validateDate("00009.09.09"));
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
