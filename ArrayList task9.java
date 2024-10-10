package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class lol {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Яблоко");
        stringList.add("Груша");
        stringList.add("Вишня");
        stringList.add("Яблоко");
        stringList.add("Банан");
        stringList.add("Груша");
        Collections.sort(stringList);
        // Выводим отсортированный список
        System.out.println("Отсортированный список:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
