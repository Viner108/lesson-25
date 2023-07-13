package com.dmdev.lesson25.counter;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            counter.increment();
        }
    }
}
