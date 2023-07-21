package com.julio.app.collections.threads;

public class ExampleExtendsThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new NameThread("Jhon Doe");
        /**
         * get state
         */
        System.out.println("thread.getState() = " + thread.getState());
        thread.start();
        Thread thread2 = new NameThread("Maria");
        thread2.start();
        Thread thread3 = new NameThread("Pepe");
        thread3.start();
        //Thread.sleep(0,1);
        System.out.println("thread.getState() = " + thread.getState());
        System.out.println("thread2.getState() = " + thread2.getState());
        System.out.println("thread2.getState() = " + thread3.getState());
    }
}
