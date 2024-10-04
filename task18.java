import java.util.Scanner;
public class Main
{
    public static <T extends Number> Double getSQRT(T a) throws IllegalArgumentException{
        if(a.doubleValue() < 0){
            throw new IllegalArgumentException("Невозможно извлечь квадратный корень из отрицательного числа!");
        }
        else{
            return Math.sqrt(a.doubleValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Извлечение квадратного корня из числа");
        try{
            System.out.println("Введите число для извлечения квадратного корня");
            Double a = sc.nextDouble();
            System.out.println(getSQRT(a));
            
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
