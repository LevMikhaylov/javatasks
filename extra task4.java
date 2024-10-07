import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt(),sum=0;
        for (int i = 1;i<=n;++i){
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до "+n+"="+sum);
    }
}
