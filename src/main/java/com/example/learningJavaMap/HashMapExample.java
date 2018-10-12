package com.example.learningJavaMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void exec(){
        System.out.println("-----hashmap-----");
		Map<String, Integer> vehicles = new HashMap<String, Integer>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		vehicles.put("Nissan", null); // allow null
		vehicles.put(null, 6); // allow null
        System.out.println("Total vehicles: " + vehicles.size());

		vehicles.keySet().forEach(k -> {
			System.out.println(k + " - " + vehicles.get(k));
		});
		System.out.println();
		
        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");

        vehicles.clear();

        System.out.println("After clear operation, size: " + vehicles.size());
    }
}