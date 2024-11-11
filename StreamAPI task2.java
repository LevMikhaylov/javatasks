package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String>carsbrands = new ArrayList<>();
        carsbrands.add("Opel");
        carsbrands.add("Mazda");
        carsbrands.add("Audi");
        carsbrands.add("Mercedes-benz");
        carsbrands.add("Chery");
        carsbrands.add("Haval");
        carsbrands.add("Geely");
        carsbrands.add("Honda");
        carsbrands.add("Nissan");
        carsbrands.add("Exeed");
        List<String>processedlist = carsbrands.stream().filter(carsbrand->carsbrand.length()>5).map(String::toLowerCase).toList();
        processedlist.forEach(System.out::println);
    }
}
