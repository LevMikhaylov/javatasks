import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
        int numThreads = 4;
        int length = array.length;
        int partSize = length / numThreads;

        CountDownLatch latch = new CountDownLatch(numThreads);
        SortThread[] threads = new SortThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * partSize;
            int end = (i + 1 == numThreads) ? length : (i + 1) * partSize;
            threads[i] = new SortThread(array, start, end, latch);
            threads[i].start();
        }

        latch.await(); // Ждем завершения всех потоков

        // Объединение отсортированных частей
        int[] sortedArray = new int[length];
        int index = 0;

        for (SortThread thread : threads) {
            int[] sortedPart = thread.getSortedArray();
            System.arraycopy(sortedPart, 0, sortedArray, index, sortedPart.length);
            index += sortedPart.length;
        }

        // Сортируем объединенный массив
        Arrays.sort(sortedArray);

        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}
