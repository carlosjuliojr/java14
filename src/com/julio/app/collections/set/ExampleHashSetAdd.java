package com.julio.app.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * The type Example hash set add.
 */
public class ExampleHashSetAdd {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("1");
        hs.add("5");
        hs.add("3");
        hs.add("2");
        hs.add("4");

        /**
         * print hashSet
         */
        System.out.println("hs = " + hs);
        if(Boolean.FALSE.equals(hs.add("three"))){
            System.out.println("HashSet collection does not allow duplicate values");
        }

        /**
         * order hashSet
         */

        System.out.println("hs = " + hs.stream().sorted().collect(Collectors.toList()));


    }
}
