package com.javarush.test.level12.lesson02.task01;

/* 
Переопределить метод getName в классе Whale
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }

    }
}
