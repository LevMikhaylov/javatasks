package org.javatrain.is;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class SortThread extends Thread{
    private int[] array;
    private int[] sortedArray;
    private int start;
    private int end;
    private CountDownLatch latch;

    public SortThread(int[] array, int start, int end, CountDownLatch latch) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.latch = latch;
    }

    @Override
    public void run() {
        sortedArray = Arrays.copyOfRange(array, start, end);
        Arrays.sort(sortedArray);
        latch.countDown();
    }

    public int[] getSortedArray() {
        return sortedArray;
    }
}
