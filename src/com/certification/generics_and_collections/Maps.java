package com.certification.generics_and_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "grass");

        String food = map.get(" koala");

        for (String key: map.keySet()){
            System.out.print(key + ","); // koala, giraffe, lion
        }

        System.out.println("");

        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "grass");

        for (String key: map2.keySet()){
            System.out.print(key + ","); // koala,lion, giraffe
        }
    }
}
