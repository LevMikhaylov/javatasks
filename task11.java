import java.util.Scanner;

public class Main {
    public static String bin(int a) throws IllegalArgumentException{
        if(a < 0){
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        else {
            return Integer.toBinaryString(a);
        }
    }
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Перевод числа из 10 сс в 2 сс");
        try{
            System.out.println("Введите число для первода в 2 сс");
            int a = sc.nextInt();
            System.out.println(bin(a));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
