import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[]args){
        // Создаем потокобезопасный список
        List<Integer> numbersList = new CopyOnWriteArrayList<>();

        // Создаем 10 потоков
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new NumberAdder(numbersList, i));
            threads[i].start();  // Запускаем поток
        }

        for (Thread thread : threads) {
            try {
                thread.join();  // Ждем завершения потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Выводим все числа из списка
        System.out.println("Содержимое списка: " + numbersList);
    }
}
