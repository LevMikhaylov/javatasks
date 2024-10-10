package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
public class lol {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= 10;++i){
            l.add(i);
        }
        for(Integer a:l){
            System.out.println(a);
        }
        System.out.println("\n");
        for(Integer a:l){
            a+=2;
            System.out.println(a);
        }
    }
}
