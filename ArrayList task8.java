package ru.ithub.javatrainj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lol {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Яблоко");
        stringList.add("Груша");
        stringList.add("Вишня");
        stringList.add("Яблоко");
        stringList.add("Банан");
        stringList.add("Груша");
        Set<String> uniqueStrings = new HashSet<>(stringList);
        stringList.clear(); 
        stringList.addAll(uniqueStrings);
        System.out.println("Список без дубликатов:");
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
