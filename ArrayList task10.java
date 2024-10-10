package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lol {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Яблоко");
        stringList.add("Груша");
        stringList.add("Вишня");
        stringList.add("Яблоко");
        stringList.add("Банан");
        stringList.add("Груша");
        Collections.reverse(stringList);
        System.out.println("Список в обратном порядке:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
