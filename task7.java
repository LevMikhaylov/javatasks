import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Проверка на наличие нулей в массиве с целыми числами");
        try {
            System.out.println("Сколько целых чисел вы хотите ввести?");
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            System.out.println("Введите массив целых чисел");
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }
            hasZeroes(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Проверка на наличие нулей в массиве с вещественными числами");
        try {
            System.out.println("Сколько вещественных чисел вы хотите ввести?");
            int n1 = sc.nextInt();
            Double[] a1 = new Double[n1];
            System.out.println("Введите массив вещественных чисел");
            for (int i = 0; i < n1; ++i) {
                a1[i] = sc.nextDouble();
            }
            hasZeroes(a1);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    public static <T extends Number> void hasZeroes(T[]arr) throws Exception{
        if(getArrayType(arr).equals("Object")){
            throw new Exception("Массив должен быть однотипным");
        }
        else{
            int counter = 0;
            for(T elem:arr){
                if(elem.doubleValue()==0.0){
                    ++counter;
                }
            }
            if(counter!=0){
                throw new Exception("В массиве есть нули!");
            }
        }
    }
    public static <T> String getArrayType(T[] array) {
        if (array.length == 0) {
            System.out.println("Массив пустой.");
        }

        Class<?> elementType = array[0].getClass();
        String arrayType = elementType.getSimpleName().toString();

        // Проверка на неоднородный массив
        boolean isHeterogeneous = false;
        for (T element : array) {
            if (element.getClass() != elementType) {
                isHeterogeneous = true;
                break;
            }
        }

        if (!isHeterogeneous) {
            return arrayType;
        }
        return "";
    }
}
