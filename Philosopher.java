package org.javatrain.is;

class Philosopher extends Thread{
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        super(name);
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                think();
                takeForks();
                eat();
                putForks();
                ++i;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void think() throws InterruptedException {
        System.out.println(getName() + " is thinling...");
        Thread.sleep((long) (Math.random()), 1000);;
    }

    private void takeForks() {
        if (leftFork.getNumber() < rightFork.getNumber()) {
            takeFork(leftFork);
            takeFork(rightFork);
        } else {
            takeFork(rightFork);
            takeFork(leftFork);
        }
    }

    private void takeFork(Fork fork) {
        System.out.println(getName() + " take fork: " + fork.getNumber());
    }

    private void eat() throws InterruptedException {
        System.out.println(getName() + " is eating...");
        Thread.sleep((long) (Math.random()),1000);
    }

    private void putForks() {
        System.out.println(getName() + " put forks...");
    }
}
