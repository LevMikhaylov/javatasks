package org.javatrain.is;

public class MultiplyRowThread extends Thread{
    private final int[][] matrixA;
    private final int[][] matrixB;
    private final int[][] resultMatrix;
    private final int row;    public MultiplyRowThread(int[][] matrixA, int[][] matrixB, int[][] resultMatrix, int row) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.resultMatrix = resultMatrix;
        this.row = row;
    }    @Override
    public void run() {
        for (int j = 0; j < matrixB[0].length; j++) {
            for (int k = 0; k < matrixB.length; k++) {
                resultMatrix[row][j] += matrixA[row][k] * matrixB[k][j];
            }
        }
    }
}
