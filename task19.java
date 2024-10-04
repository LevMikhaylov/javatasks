import java.util.Scanner;
public class Main
{
    public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentException{
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15°C)");
        }

        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        try {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C =" + fahrenheit + "°F");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
