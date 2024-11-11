package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("avocado");
        words.add("grape");
        words.add("orange");

        words.forEach(word -> {
            long count = word.chars().filter(ch -> ch == 'a').count();
            System.out.println("Слово: " + word + ", количество 'a': " + count);
        });
    }
}
