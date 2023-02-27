package com.julio.basicconcepts;

public enum TypeAutomovil {
    SEDAN("Sedan", 4, "Middle automovil"),
    STATION_WAGON("Station wagon", 4, "Big automovil"),
    HATCHBACK("Hatchback", 4, "Compact automovil"),
    PICKUP("Pickup", 2, "Truck"),
    FURGON("Furgon", 2, "Util automovil");

    private final String name;
    private final int doorNumber;
    private final String description;

    TypeAutomovil(String name, int doorNumber, String description) {
        this.name = name;
        this.doorNumber = doorNumber;
        this.description = description;


    }

    public String getName() {
        return name;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getDescription() {
        return description;
    }
}
