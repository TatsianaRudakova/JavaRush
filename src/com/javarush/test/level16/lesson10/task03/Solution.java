package com.javarush.test.level16.lesson10.task03;

/* 
Создай экземпляр нити, запусти, а потом прерви ее
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread test = new TestThread();
        test.start();
        test.interrupt();
    }
    
    public static class TestThread extends Thread {
        public void run() {
        }
    }
}
