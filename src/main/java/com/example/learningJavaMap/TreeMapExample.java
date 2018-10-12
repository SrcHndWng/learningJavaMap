package com.example.learningJavaMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void exec(){
        System.out.println("-----treeMap-----");
        TreeMap<String, Integer> vehicles = new TreeMap<String, Integer>();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
        System.out.println("Total vehicles: " + vehicles.size());

        vehicles.keySet().forEach(k -> {
            System.out.println(k + " - " + vehicles.get(k));
        });
        System.out.println();
        System.out.println("Highest key: " + vehicles.lastKey());
        System.out.println("Lowest key: " + vehicles.firstKey());
        System.out.println("\nPrinting all values:");
        vehicles.values().forEach(v -> {
            System.out.println(v);
        });
        System.out.println();
        vehicles.clear();

        System.out.println("After clear operation, size: " + vehicles.size());
    }
}