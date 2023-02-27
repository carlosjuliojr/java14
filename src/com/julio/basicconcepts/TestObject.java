package com.julio.basicconcepts;

import java.util.Arrays;

/**
 * The type Test object.
 */
public class TestObject {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        
        //Declaration class
        Automovil mazda = new Automovil();
        mazda.setTypeAutomovil(TypeAutomovil.FURGON);
        Automovil aveo = new Automovil();
        aveo.setTypeAutomovil(TypeAutomovil.SEDAN);
        Automovil quinientos = new Automovil();
        quinientos.setTypeAutomovil(TypeAutomovil.PICKUP);
        

        /**
         * Access to static final variables
         */
        //dictly with instance
        System.out.println("mazda.MAX_SPEED_ROAD = " + mazda.MAX_SPEED_ROAD);
        System.out.println("mazda.MIN_SPEED_ROAD = " + mazda.MIN_SPEED_ROAD);
        //Dicrectly with Class that contains the static final variables
        System.out.println("Automovil.MAX_SPEED_ROAD = " + Automovil.MAX_SPEED_ROAD);
        System.out.println("Automovil.MIN_SPEED_ROAD = " + Automovil.MIN_SPEED_ROAD);

        //change color
        mazda.setColour(Colour.BLUE);
        mazda.toString();
        //System.out.println("mazda = " + mazda.toString());
        /**
         * Switch with enum since version java 13 you can use arrow and dont use breack
         */

        switch (mazda.getTypeAutomovil()){
            case FURGON ->
                System.out.println("Automovil is sprots and confortable");
            case SEDAN ->
                System.out.println("This a beatiful sedan with a lot of thing to enjoy");

            case PICKUP ->
                System.out.println("With this pickkup ur car is more potent");
            case STATION_WAGON ->
                System.out.println("I dont know what say here for this station wagon");
            case HATCHBACK ->
                System.out.println("you can handdle all");
        }

        /**
         * get all values of enum and print for console
         */
        TypeAutomovil[]  types = TypeAutomovil.values();
        Arrays.stream(types).forEach(x -> System.out.println("x = " + x));

        /**
         * how to use compateTo
         */
        String[] cadena = {"julio", "total", "Armando", "Carlos"};
        Arrays.stream(cadena).sorted().forEach(System.out::println);
        System.out.println("not using compare to");
        Automovil[] automovils = {mazda,aveo,quinientos};
        Arrays.stream(automovils).forEach( x -> System.out.println(x.getTypeAutomovil()));
        System.out.println("using compare to");
        Arrays.sort(automovils);
        Arrays.stream(automovils).forEach( x -> System.out.println(x.getTypeAutomovil()));

    }
}
