package com.julio.app.collections.threads;

import com.julio.app.collections.threads.runnable.PrintPhrasesRunnable;

public class ExampleSyncThread {

    public static void main(String[] args) {

        new Thread(new PrintPhrasesRunnable("Hello", "how about u?")).start();
        new Thread(new PrintPhrasesRunnable("Who are ", "u?")).start();
        new Thread(new PrintPhrasesRunnable("Very ", "Thanks")).start();

    }

    public synchronized static void printPhrase(String phrase1, String phrase2){
        System.out.print(phrase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(phrase2);
    }
}
