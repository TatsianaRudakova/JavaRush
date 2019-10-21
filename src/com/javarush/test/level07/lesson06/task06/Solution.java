package com.javarush.test.level07.lesson06.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создать список строк и добавь в него 10 строк с клавиатуры.
2. Найти, какая строка в списке встретится раньше: самая короткая или самая длинная. Если таких строк несколько, то должны быть учтены самые первые из них.
3. Выведи на экран строку из п.2. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            strings.add(s);
        }
        
        int min = strings.get(0).length();
        int max = strings.get(0).length();
        int i = 0;

        while (i < strings.size()){
            if (min >= strings.get(i).length()){
                min = strings.get(i).length();
            }
            else if (max <= strings.get(i).length()){
                max = strings.get(i).length();
            }
            i++;
        }
        
        for (int j = 0; j < strings.size(); j++){
            if (min == strings.get(j).length()){
                System.out.println(strings.get(j));
                break;
            }
            if (max == strings.get(j).length()) {
                System.out.println(strings.get(j));
                break;
            }
        }
    }
}
