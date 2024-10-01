import java.util.Scanner;

public class Main {
    static int max(int a, int b) throws Exception{
        if (a==b){
            throw new Exception("Числа не должны быть равными");
        }
        return a>b?a:b;
    }
    static double max(double a, double b) throws Exception{
        if (a==b){
            throw new Exception("Числа не должны быть равными");
        }
        return a>b?a:b;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Поиск максимума из двух целых чисел");
        try {
            System.out.println("Введите a");
            int a = s.nextInt();
            System.out.println("Введите b");
            int b = s.nextInt();
            System.out.println("Максимум - " + max(a, b));
        } catch (Exception e) {
            System.out.println("ОШИБКА! Числа не должны быть равными");;
        }
        System.out.println("Поиск максимума из двух вещественных чисел");
        try {
            System.out.println("Введите a");
            double a = s.nextDouble();
            System.out.println("Введите b");
            double b = s.nextDouble();
            System.out.println("Максимум - " + max(a, b));
        } catch (Exception e) {
            System.out.println("ОШИБКА! Числа не должны быть равными");;
        }
    }
    }
