package com.julio.app.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExampleLocalTime {
    public static void main(String[] args) {

        System.out.println("****************LocalDate.now()*********************");
        LocalTime currentDate = LocalTime.now();
        System.out.println("LocalTime = " + currentDate);
        System.out.println("hora = " + currentDate.getHour());
        System.out.println("currentDate.getMinute() = " + currentDate.getMinute());
        System.out.println("currentDate.getSecond() = " + currentDate.getSecond());
        System.out.println("****************LocalTime 6 30*********************");
        LocalTime sixThirty = LocalTime.of(6,30);
        System.out.println("sixThirty = " + sixThirty);
        System.out.println("*****************DateTimeFormatter");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("df.format(sixThirty) = " + df.format(sixThirty));
      /*  currentDate = LocalDate.of(2002,1,20);
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.parse()*********************");
        currentDate = LocalDate.parse("1998-12-24");
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.now().plusDay()*********************");
        currentDate = LocalDate.now().plusDays(1);
        System.out.println("currentDate = " + currentDate);

        System.out.println("****************Biciesto*********************");
        boolean isBiciesto = LocalDate.now().isLeapYear();
        System.out.println("isBiciesto = " + isBiciesto);*/

    }
}
