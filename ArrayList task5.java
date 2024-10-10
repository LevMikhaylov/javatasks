package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
public class lol {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        List<String>l2 = new ArrayList<>();
        l.add("abc");
        l.add("def");
        l.add("ghi");
        l1.add("klm");
        l1.add("nop");
        l1.add("qrs");
        l2.addAll(l);
        l2.addAll(l1);
        for(String s:l2){
            System.out.println(s);
        }
    }
}
