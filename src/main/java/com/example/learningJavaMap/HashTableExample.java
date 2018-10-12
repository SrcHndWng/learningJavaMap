package com.example.learningJavaMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void exec(){
        System.out.println("-----hashTable-----");

		Map<String, Integer> vehicles = new Hashtable<String, Integer>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);
		try{
            // not allowed to put null.
			vehicles.put("Nissan", null);
			vehicles.put(null, 6);	
		}catch(java.lang.NullPointerException e){
			System.out.println("null is not allowed!.");
		}
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