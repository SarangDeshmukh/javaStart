package com.sarangjava;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");
        System.out.println(cars);
        System.out.println(cars.contains("Audi"));
    }
}