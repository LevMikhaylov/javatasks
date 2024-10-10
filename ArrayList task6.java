package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
public class lol {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Abc");
        l.add("def");
        l.add("ghi");
        l.add("Aaaaa");
        l.add("Ag");
        l.removeIf(s -> s.startsWith("A"));
        for(String s:l){
            System.out.println(s);
        }
    }
}
