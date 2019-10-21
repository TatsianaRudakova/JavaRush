package com.javarush.test.level07.lesson12.task09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Программа сортирует массив в убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; i < j; j--) {
                if (array[i] < array[j]) {
                    int n = array[i];
                    array[i] = array[j];
                    array[j] = n;
                }
            }
        }
    }
}
