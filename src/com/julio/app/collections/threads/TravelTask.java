package com.julio.app.collections.threads;

public class TravelTask implements Runnable{

    private String name;

    public String getName() {
        return name;
    }

    public TravelTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + name);
            try {
                Thread.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I will to travel to: "+ name);
        }

    }
}
