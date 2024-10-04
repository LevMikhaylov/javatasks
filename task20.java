import java.util.Scanner;
public class Main
{
    public static void isEmpty(String s) throws Exception{
        if(s == "" || s == null){
            throw new Exception("Строка пустая");
        }
        else{
            System.out.println("Программа заверешена успешно!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try {
            isEmpty(str);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
