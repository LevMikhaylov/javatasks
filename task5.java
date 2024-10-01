import java.util.Scanner;

public class Main {
    static void getSQRT(double a) throws IllegalArgumentException{
        if(a < 0){
            throw new IllegalArgumentException("Невозможно извлечь корень из отрицательного числа!!!!!!");
        }
        System.out.println(Math.sqrt(a));
    }
    public static void main(String[] args) {
        System.out.println("Извлечение корня из числа");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double a = sc.nextDouble();
        getSQRT(a);
    }
}
