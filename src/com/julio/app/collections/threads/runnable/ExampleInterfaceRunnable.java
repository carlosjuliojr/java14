package com.julio.app.collections.threads.runnable;

import com.julio.app.collections.threads.TravelTask;

public class ExampleInterfaceRunnable {

    public static void main(String[] args) {
        new Thread(new TravelTask("Isla de pascua")).start();
        new Thread(new TravelTask("Robinson crisol")).start();
        new Thread(new TravelTask("San fernando")).start();
        new Thread(new TravelTask("chilloe")).start();


    }
}
