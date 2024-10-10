package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
public class lol {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 10; ++i){
            l.add(i);
        }
        l.remove(3);
        for(Integer a:l){
            System.out.println(a);
        }
    }
}
