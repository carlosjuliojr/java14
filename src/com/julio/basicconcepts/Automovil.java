package com.julio.basicconcepts;

/**
 * The type Automovil.
 */
public class Automovil implements Comparable<Automovil> {

    /**
     * Attibutes
     */

    private static Colour colour;
    private TypeAutomovil typeAutomovil;

    /**
     * static final variables
     */
    public static final int MAX_SPEED_ROAD = 120;
    /**
     * The constant MIN_SPEED_ROAD.
     */
    public static final int MIN_SPEED_ROAD = 60;

    /**
     * Gets colour.
     *
     * @return the colour
     */
    public static Colour getColour() {
        return colour;
    }

    /**
     * Sets colour.
     *
     * @param colour the colour
     */
    public static void setColour(Colour colour) {
        Automovil.colour = colour;
    }


    /**
     * Gets type automovil.
     *
     * @return the type automovil
     */
    public TypeAutomovil getTypeAutomovil() {
        return this.typeAutomovil;
    }

    /**
     * Sets type automovil.
     *
     * @param typeAutomovil the type automovil
     */
    public void setTypeAutomovil(TypeAutomovil typeAutomovil) {
        this.typeAutomovil = typeAutomovil;
    }

    @Override
    public String toString() {
        System.out.println(
                "Colour: " + getColour() +
                        "\nType: " + getTypeAutomovil().name() +
                        "\nName: " + getTypeAutomovil().getName() +
                        "\nDoor numbers: " + getTypeAutomovil().getDoorNumber() +
                        "\nDescription: " + getTypeAutomovil().getDescription()

        );
        return null;
    }

    @Override
    public int compareTo(Automovil o) {
        return this.typeAutomovil.compareTo(o.typeAutomovil);
    }
}
