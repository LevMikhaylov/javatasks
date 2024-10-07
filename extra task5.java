import java.util.Scanner;
public class lol {
    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt();
        for(int i = 1;i<=n;++i){
            System.out.print(f(i)+" ");
        }
    }
}
