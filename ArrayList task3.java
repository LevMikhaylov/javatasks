package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        l.add("abc");
        l.add("def");
        l.add("ghi");
        System.out.println("Введите строку для поиска");
        String s = sc.next();
        System.out.println(l.contains(s)?l.indexOf(s):"Такой строки нет");
    }
}
