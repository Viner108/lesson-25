package com.dmdev.lesson25.counter;

public class Counter {
    private static String description;
    private int count;
    public static void intit(){
        synchronized (Counter.class) {
            if (description == null) {
                description = "Test description";
            }
        }
    }
    public  void increment(){
        synchronized (this){
            count++;
        }
    }
    public synchronized void decrement(){
        count--;
    }
    public int getCount(){
        return count;
    }
}
