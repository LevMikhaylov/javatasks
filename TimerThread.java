package org.javatrain.is;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerThread extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while (running) {
            System.out.println("Текущее время: " + sdf.format(new Date()));
            try {
                Thread.sleep(1000); // Пауза на 1 секунду
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Восстановление прерывания
            }
        }
    }

    public void stopTimer() {
        running = false; // Устанавливаем флаг в false для остановки потока
    }
}
