package com.julio.app.collections.threads;

public class NameThread extends  Thread {

    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("It has been started the thread: " + this.getName());

        for(int i = 0 ; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(this.getName()+(i+1));
        }

        System.out.println("End thread: " + this.getName());

    }
}
