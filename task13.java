import java.util.Scanner;

public class Main {
    public static <T extends Number> void at(T[]arr,int i) throws IndexOutOfBoundsException{
        if(i > arr.length-1){
            throw new IndexOutOfBoundsException("Выход за пределы массива!");
        }
        else{
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Чтение элементов из массива целых чисел");
        try {

            System.out.println("Сколько элементов вы хотите ввести?");
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            System.out.println("Введите массив");
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Введите индекс элемента");
            int id = sc.nextInt();
            at(arr, id);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Чтение элементов из массива вещественных чисел");
        try {

            System.out.println("Сколько элементов вы хотите ввести?");
            int n = sc.nextInt();
            Double[] arr = new Double[n];
            System.out.println("Введите массив");
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextDouble();
            }
            System.out.println("Введите индекс элемента");
            int id = sc.nextInt();
            at(arr, id);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
