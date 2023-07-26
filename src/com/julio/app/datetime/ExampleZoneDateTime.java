package com.julio.app.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZoneDateTime {

    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zoneNY = ZonedDateTime.of(localDate,newYork);
        System.out.println("Horario de partida zoneNY = " + zoneNY);

        ZoneId newMadrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = ZonedDateTime.of(localDate,newMadrid).plusHours(8);
        System.out.println("Horario de Llegada zoneMadrid = " + zoneMadrid);
    }
}
