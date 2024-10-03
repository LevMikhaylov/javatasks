import java.util.Scanner;

public class Main {
    public static <T extends Number> void getPow(T a,T b) throws IllegalArgumentException{
        if(a.doubleValue()==0.0 && b.doubleValue() < 0.0){
            throw new IllegalArgumentException("Ноль нельзя возвести в отрицательную степень");
        }
        else{
            System.out.println(Math.pow(a.doubleValue(),b.doubleValue())); //На самом деле a^(-b)=1/a^b
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор возведения в степень");
        try {
            System.out.println("Введите основание");
            double a = sc.nextDouble();
            System.out.println("Введите показатель");
            double b = sc.nextDouble();
            getPow(a, b);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
