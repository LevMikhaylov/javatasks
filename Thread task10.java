package org.javatrain.is;



public class Main {

    public static void main(String[] args) throws InterruptedException {
        Fork[] forks = new Fork[5];
        Philosopher[] philosophers = new Philosopher[5];

        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher("Philosopher " + (i + 1), forks[i], forks[(i + 1) % 5]);
            philosophers[i].start();
        }
    }
}
