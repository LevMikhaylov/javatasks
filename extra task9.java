import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.next();
        StringBuilder reversed = new StringBuilder(s).reverse();
        System.out.println("Reversed string: " + reversed.toString());
    }
}
