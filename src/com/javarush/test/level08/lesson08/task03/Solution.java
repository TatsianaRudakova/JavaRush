package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* 
1. Создать словарь и занести в него десять записей по принципу "Фамилия" - "Имя".
2. Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Андрей");
        map.put("Петров", "Михаил");
        map.put("Зюзиков", "Игорь");
        map.put("Авдеева", "Анна");
        map.put("Хорошко", "Дмитрий");
        map.put("Сиплая", "Виолетта");
        map.put("Бык", "Екатерина");
        map.put("Суздаль", "Рафаэль");
        map.put("Хориков", "Дмитрий");
        map.put("Сымина", "Виолетта");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int num = 0;
        for (String s: map.values()) {
            if (s.equals(name))
                num++;
        }
    return num;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int num = 0;
        for (String s: map.keySet()) {
        if (s.equals(lastName))
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
    }
}
