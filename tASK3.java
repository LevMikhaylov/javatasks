import java.util.Scanner;

public class Main {
    static void convertToInt(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Невозможно преобразовать строку в целое число");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.next();
        convertToInt(str);
    }
}
