package com.javarush.test.level16.lesson10.task04;

/* 
В методе ourInterruptMethod необходимо сделать так, чтобы нить TestThread завершилась сама (без использования interrupt).
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }
    public static boolean interraptMethod = true;

    public static void ourInterruptMethod() {
        interraptMethod = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (interraptMethod) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
