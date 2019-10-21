package com.javarush.test.level05.lesson12.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Вводим с клавиатуры числа и считаем их сумму, пока пользователь не введет слово "сумма".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String s = reader.readLine();
            if (s.equals("сумма")){
                break;
            }
            int num = Integer.parseInt(s);
            sum += num;
        }
        System.out.println(sum);
    }
}
