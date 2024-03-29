package com.javarush.test.level09.lesson11.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Если пользователь ввёл текст, вместо числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа.
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                list.add(number); // заполняем массив с клавиатуры
            }
        }
        catch (Exception e){
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
