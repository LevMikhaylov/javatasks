public class Main {
    static void checkage(int age) throws IllegalArgumentException{
        if(age < 0 || age >150){
            throw new IllegalArgumentException("ОШИБКА!! Взраст должен быть положительным или равным нулю или меньше 150");
        }
        else {
            System.out.println("Программа завершена успешно!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        checkage(age);
    }
}
