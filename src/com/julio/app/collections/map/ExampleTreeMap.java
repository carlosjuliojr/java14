package com.julio.app.collections.map;

import java.util.*;

public class ExampleTreeMap {

    public static void main(String[] args) {

        /**
         * Declaration
         */
        Map<String, String> map = new TreeMap<>((a,b) -> b.compareTo(a));
        
        map.put("name", "julio");
        map.put("lastName", "jaimes");
        map.put("email", "julio@gmail.com");
        map.put("age", "30");
        map.put("secondName", "carlos");
        System.out.println("*************** Order by key ********************");
        System.out.println("map = " + map);
        /**
         * insert repeat element
         */
        map.put("email", "julio@gmail.com2");

    }
}
