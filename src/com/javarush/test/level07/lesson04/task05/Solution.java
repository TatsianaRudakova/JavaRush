package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 20 чисел и заполнить его значениями с клавиатуры.
2. Разбить большой массив на два: половину чисел в первый, вторую половину во второй массив.
3. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < num.length; i++) {
            String s = reader.readLine();
            num[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < num1.length; i++) {
                num1[i] = num[i];
            }

        for (int i = 0; i < num2.length; i++) {
            num2[i] = num[i + 10];
        }

         for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
                }
        }
}
