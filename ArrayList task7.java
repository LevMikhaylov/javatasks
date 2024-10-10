package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
public class lol {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(3);
        l.add(2);
        l.add(1);
        int max = Integer.MIN_VALUE;
        for(Integer a:l){
            if(a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
}
