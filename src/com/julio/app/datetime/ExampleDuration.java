package com.julio.app.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExampleDuration {

    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().plusDays(5).plusHours(5);

        Duration lapsus = Duration.between(date1, date2);
        System.out.println("lapsus.toDays() = " + lapsus.toDays());
        System.out.println("lapsus.houurs = " + lapsus.toHours());

    }
}
