package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(-7);
        nums.add(12);
        nums.add(11);
        nums.add(-8);
        System.out.println("Nums: ");
        nums.forEach(System.out::println);
        System.out.println("Sum of sorted even numbers: " + nums.stream().filter(n->n%2==0).sorted().reduce(0,(a,b)->a+b));
    }
}
