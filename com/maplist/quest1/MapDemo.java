package com.maplist.quest1;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, List<String>> maps = new HashMap<>();
        maps.put("California", Arrays.asList("Los Angeles","San Francisco","San Diego"));
        maps.put("Texas", Arrays.asList("Houston", "Austin", "Dallas"));
        maps.put("New York", Arrays.asList("New York City", "Buffalo", "Rochester"));
        for(String map : maps.keySet()){
            System.out.println("State: " +map +" \nCities - "+ maps.get(map)+"\n" );
        }
    }
}
