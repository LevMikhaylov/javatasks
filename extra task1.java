import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки чётности");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a%2==0?"Чётное":"Нечётное");
    }
}
