package org.javatrain.is;




public class Main {
    private static int count = 0;
    public static synchronized void inc(){
        ++count;
    }
    public static void main(String[]args) throws InterruptedException {
        int incrementsThread = 1000;
        Thread[]threads = new Thread[5];
        for(int i = 0; i < 5;++i) {
            threads[i]=new Thread(()->{
                for(int j = 0; j < incrementsThread; ++j){
                    inc();
                }
            });
            threads[i].start();
            System.out.println("Поток: "+i+"значение счётчика: "+count);
        }
        for(Thread thread:threads){
            thread.join();
        }
    }
}
