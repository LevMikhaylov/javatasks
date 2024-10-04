package ru.ithub.javatrain;
class Counter {
    private static int count = 0;
    public Counter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}
public class Main {
    public static void main(String[]args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
