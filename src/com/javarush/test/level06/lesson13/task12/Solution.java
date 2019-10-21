package com.javarush.test.level06.lesson13.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Solution.Thread1());
        threads.add(new Solution.Thread2());
        threads.add(new Solution.Thread3());
        threads.add(new Solution.Thread4());
        threads.add(new Solution.Thread5());
    }

    public static void main(String[] args) {
        Thread thread4 = new Thread4();
        thread4.start();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (Exception e) {
            }
        }
    }

public interface Message {
    void showWarning();
}

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) ;
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        @Override
        public void run() {
            while (true) {
                try {
                    String s = reader.readLine();
                    if (s.equals("N")) break;
                    n = n + Integer.parseInt(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(n);
        }
