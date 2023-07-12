package com.julio.app.collections.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchDuplicateValuesInAList {

    public static void main(String[] args) {
        String[] fishes = {"Corvina", "Lenguado", "Pejerry", "Atun", "Lenguado"};

        Set<String> unics = new HashSet<>();

        for (String fish :fishes
             ) {
            if(Boolean.FALSE.equals(unics.add(fish))){
                System.out.println("value : " + fish + " is duplicated");
            }

        }


    }


}
