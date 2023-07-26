package com.julio.app.datetime;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {

        System.out.println("****************LocalDate.now()*********************");
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.of()*********************");
        currentDate = LocalDate.of(2002,1,20);
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.parse()*********************");
        currentDate = LocalDate.parse("1998-12-24");
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.now().plusDay()*********************");
        currentDate = LocalDate.now().plusDays(1);
        System.out.println("currentDate = " + currentDate);

        System.out.println("****************Biciesto*********************");
        boolean isBiciesto = LocalDate.now().isLeapYear();
        System.out.println("isBiciesto = " + isBiciesto);

    }
}
