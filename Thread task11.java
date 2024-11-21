package org.javatrain.is;



public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[][] matrixA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };        int[][] matrixB = {
                {7, 8, 9},
                {10, 11, 12}
        };
        int rowsA = matrixA.length;
        int colsB = matrixB[0].length;
        int[][] resultMatrix = new int[rowsA][colsB];
        MultiplyRowThread[] threads = new MultiplyRowThread[rowsA];
        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MultiplyRowThread(matrixA, matrixB, resultMatrix, i);
            threads[i].start();
        }
        for (MultiplyRowThread thread : threads) {
            thread.join(); // Ждем, пока все потоки завершат работу
        }        // Вывод результирующей матрицы
        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
