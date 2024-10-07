import java.util.Scanner;
public class lol {
    public static boolean isPrime(int n,int i) throws IllegalArgumentException{
        if(i<2){
            throw new IllegalArgumentException("Делитель i должен быть больше или равен 2");
        }
        else {
            // Base cases
            if (n <= 2)
                return (n == 2) ? true : false;
            if (n % i == 0)
                return false;
            if (i * i > n)
                return true;


            // Check for next divisor
            return isPrime(n, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Введите N");
            int n = sc.nextInt();
            System.out.println(isPrime(n, 2) ? "Простое" : "Непростое");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }
    }
}
