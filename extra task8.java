import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите A");
        int a = sc.nextInt();
        System.out.println("Введите B");
        int b = sc.nextInt();
        int sum = 0;
        for(int i= a; i <= b;++i){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        System.out.println("Сумма чётных чисел от "+a+" до "+b+" = "+sum);
    }
}
