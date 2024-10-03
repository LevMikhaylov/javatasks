import java.util.Scanner;

public class Main {
    public static String slice(String s,int n) throws IllegalArgumentException{
        if(n>s.length()){
            throw new IllegalArgumentException("Число символов не должно быть больше длины строки!");
        }
        else{
            return s.substring(0,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Обрезка строки");
        try {
            System.out.println("Введите строку");
            String str = sc.next();
            System.out.println("До какого количества символов вы хотите обрезать строку?");
            int n = sc.nextInt();
            System.out.println(slice(str,n));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
