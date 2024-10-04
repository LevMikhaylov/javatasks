import java.util.Scanner;
public class Main
{
    public static <T extends Number> void mod(T a, T b) throws IllegalArgumentException{
        if(b.doubleValue()==0){
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        else{
            System.out.println(a.doubleValue()%b.doubleValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нахождение остатака от деления");
        try{
            System.out.println("Введите первое число");
            Double a = sc.nextDouble();
            System.out.println("Введите второе число");
            Double b = sc.nextDouble();
            mod(a,b);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
