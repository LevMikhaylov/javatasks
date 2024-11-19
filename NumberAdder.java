package org.javatrain.is;

import java.util.List;

public class NumberAdder implements Runnable{
    private final List<Integer> list;
    private final int threadId;

    public NumberAdder(List<Integer> list, int threadId) {
        this.list = list;
        this.threadId = threadId;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            list.add(i);  // Добавление числа в список
        }
        System.out.println("Поток " + threadId + " закончил добавление.");
    }
}
