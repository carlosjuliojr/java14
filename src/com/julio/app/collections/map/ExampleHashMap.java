package com.julio.app.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleHashMap {

    public static void main(String[] args) {

        /**
         * Declaration
         */
        Map<String, String> map = new HashMap<>();
        
        map.put("name", "julio");
        map.put("lastName", "jaimes");
        map.put("email", "julio@gmail.com");
        map.put("age", "30");
        map.put("secondName", "carlos");
        System.out.println("***********************************");
        System.out.println("map = " + map);
        /**
         * key are unique in this case overwrite the value with key repeated
         */
        System.out.println("***********************************");
        map.put("lastName", "jaimes1");
        System.out.println("overwrite key lastName = " + map);

        /**
         * get value given key
         */
        System.out.println("****************map.ge*******************");
        System.out.println("map.get(\"name\") = " + map.get("name"));
        /**
         * check if map is empty
          */
        System.out.println("*********map.isEmpty**************************");
        System.out.println("map.isEmpty() = " + map.isEmpty());
        /**
         * remove
         */
        System.out.println("*************map.remove**********************");
        System.out.println("value deleted: " + map.remove("secondName"));
        /**
         * contains
         */
        System.out.println("*******containsKey****containsValue************************");
        System.out.println("map.containsKey(\"name\") = " + map.containsKey("name"));
        System.out.println("map.containsValue(\"julio\") = " + map.containsValue("julio"));
        /**
         * values
         */
        System.out.println("*********map.values**************************");
        System.out.println("map.values() = " + map.values());
        /**
         * key set
         */
        System.out.println("************forEach***********************");
        Set<String> keys =  map.keySet();
        keys.stream().forEach(System.out::println);
        /**
         * iterate map
         */
        System.out.println("*****************Map.Entry******************");
        for(Map.Entry<String,String> m : map.entrySet())
            System.out.println("m = " + m);

    }
}
