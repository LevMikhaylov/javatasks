import java.util.Scanner;

public class Main {
    public static <T extends Number> boolean checkDivisibility(T a,T b) throws ArithmeticException{
        if(b.doubleValue()==0.0){
            throw new ArithmeticException("Второе число не равно нулю");
        }
        else{
            return a.doubleValue() % b.doubleValue()==0.0?true:false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Проверка делимости двух целых чисел");
        try {

            System.out.println("Введите первое число");
            Integer a = sc.nextInt();
            System.out.println("Введите второе число");
            Integer b = sc.nextInt();
            System.out.println(checkDivisibility(a,b));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Проверка делимости двух вещественных чисел");
        try {

            System.out.println("Введите первое число");
            Double a = sc.nextDouble();
            System.out.println("Введите второе число");
            Double b = sc.nextDouble();
            System.out.println(checkDivisibility(a,b));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
