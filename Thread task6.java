package org.javatrain.is;


public class Main {

    public static void main(String[]args){
        SharedResource sharedResource = new SharedResource();

        // Создаем потоки
        Thread t1 = new Worker(sharedResource, "Поток 1");
        Thread t2 = new Worker(sharedResource, "Поток 2");
        Thread t3 = new Worker(sharedResource, "Поток 3");
        Thread t4 = new Worker(sharedResource, "Поток 4");

        // Запускаем потоки
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
        }
