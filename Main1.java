import java.util.Scanner;

public class Main {
    static <T extends Number> void div(T a, T b) throws ArithmeticException{
        if(b.equals(0) || b.equals(0.0)){
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        System.out.println(a.doubleValue()/b.doubleValue());
    }
    public static void main(String[] args) throws ArithmeticException {
        Scanner s = new Scanner(System.in);
        System.out.println("Калькулятор деления целых чисел");
        try {
            System.out.println("Введите a");
            int a = s.nextInt();
            System.out.println("Введите b");
            int b = s.nextInt();
            div(a,b);
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА! Деления на ноль нельзя!");
            ;
        }
        System.out.println("Калькулятор деление вещественных чисел");
        try {
            System.out.println("Введите a");
            double a = s.nextDouble();
            System.out.println("Введите b");
           double b = s.nextDouble();
            div(a,b);
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА! Деление на ноль нельзя!");
            ;
        }

    }}
