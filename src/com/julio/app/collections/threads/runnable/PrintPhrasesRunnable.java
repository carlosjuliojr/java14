package com.julio.app.collections.threads.runnable;

import static com.julio.app.collections.threads.ExampleSyncThread.printPhrase;

public class PrintPhrasesRunnable implements  Runnable{

    String phrase1, phrase2;

    public PrintPhrasesRunnable(String phrase1, String phrase2) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    @Override
    public void run() {
        printPhrase(this.phrase1, this.phrase2);
    }
}
