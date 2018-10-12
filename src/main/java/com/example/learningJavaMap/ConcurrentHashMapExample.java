package com.example.learningJavaMap;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void exec(){
        System.out.println("-----ConcurrentHcshMap-----");
        ConcurrentHashMap<String, Integer> vehicles = new ConcurrentHashMap<String, Integer>();

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

        for(String key: vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");

        Enumeration<Integer> elems = vehicles.elements();
        while(elems.hasMoreElements())
            System.out.println(elems.nextElement());
        System.out.println();

        
        Integer val = vehicles.putIfAbsent("Audi", 9);
        if(val != null)
            System.out.println("Audi was found in the map!");


        val = vehicles.putIfAbsent("Nissan", 9);
        if(val == null)
            System.out.println("Nissan wasn't found in map, thus a new pair was created!");
        System.out.println();

        for(String key: vehicles.keySet())
        System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}