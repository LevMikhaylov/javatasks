import java.util.Scanner;

public class Main {
    public static int fac(int a) throws IllegalArgumentException{
        if(a <0){
            throw new IllegalArgumentException("Невозможно вычислить факториал отрицательного числа");
        }
        else if (a == 0) {
            return 1;
        }
        return a * fac(a - 1);
    }
    public static void main(String[] args) {
        System.out.println("Вычисление факториала числа");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println(a+"!"+"="+fac(a));
    }
}
