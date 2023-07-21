package com.julio.app.collections.threads;

public class ExampleInterfaceRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();

        /**
         * Lambda method for java 8
         */
        Runnable travel = ()-> {

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) Math.random() * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("I will to travel to: " + Thread.currentThread().getName());
                    System.out.println("main  state = " + main.getState());
                }
        };


       Thread t1 = new Thread(travel,"Margarita");
        Thread t2 = new Thread(travel,"Chichiriviche");
        Thread t3 = new Thread(travel,"Los roques");
        Thread t4 = new Thread(travel,"Merida");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        //Thread.sleep(1000);
        System.out.println("continue with method main");
        System.out.println(" thread main= " + main.getName());
    }
}
