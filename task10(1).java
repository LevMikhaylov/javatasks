import java.util.Scanner;

public class Main {
    public static void sort(Integer arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    public static void heapify(Integer arr[], Integer n, Integer i) {
        // Find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(Integer arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static <T extends Comparable<T>> int binarySearch(T[] sortedArray, T element) {
        var left = 0;
        var right = sortedArray.length - 1;
        while (left <= right) {
            var middle = (left + right) / 2;
            var current = sortedArray[middle];
            // ключевое отличие
            var compareResult = current.compareTo(element);
            if (compareResult == 0) {
                return middle;
            } else if (compareResult < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) throws Exception{
        Integer arr[] = {1, 12, 9, 5, 6, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Что ищем?");
        Integer a = sc.nextInt();
        sort(arr);
        if(binarySearch(arr,a)==-1){
            throw new Exception("Такого элеиента нету!");
        }
        else{
            System.out.println("Нашли!");
        }
    }
}
