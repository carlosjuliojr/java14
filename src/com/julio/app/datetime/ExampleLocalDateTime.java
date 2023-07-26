package com.julio.app.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {

        System.out.println("****************LocalDate.now()*********************");
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.of()*********************");
        currentDate = LocalDateTime.of(2002,1,20,19,53,20);
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.parse()*********************");
        currentDate = LocalDateTime.parse("2020-01-14T13:55:16.919568300");
        System.out.println("currentDate = " + currentDate);
        System.out.println("****************LocalDate.now().plusDay()*********************");
        currentDate = LocalDateTime.now().plusDays(1);
        System.out.println("currentDate = " + currentDate);

        System.out.println("****************Biciesto*********************");
        boolean isBiciesto = LocalDate.now().isLeapYear();
        System.out.println("isBiciesto = " + isBiciesto);

    }
}
