import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n = sc.nextInt();
        for(int i = n; i >= 1; --i){
            System.out.print(i + " ");
        }

    }
}
