package org.example;
public class Main{
    public static long measureExecutionTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void exampleMethod() {
        for (int i = 0; i < 1000000; i++) {
            // Пустое тело цикла
        }
    }
    public static void main(String[] args) {
        long executionTime = measureExecutionTime(Main::exampleMethod);
        System.out.println("Время выполнения: " + executionTime + " наносекунд");
    }
}
