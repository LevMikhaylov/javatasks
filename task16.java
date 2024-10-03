import java.util.Scanner;


public class Main {
   public static String concat(String a, String b){
       if(a == null || b == null){
           throw new NullPointerException("Одна из строк пустая!");
       }
       else{
           return a+b;
       }
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Конкатенация строк");
        try{
            System.out.println("введите первую строку");
            String a = sc.next();
            System.out.println("введите вторую строку");
            String b = sc.next();
            System.out.println(concat(a,b));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
