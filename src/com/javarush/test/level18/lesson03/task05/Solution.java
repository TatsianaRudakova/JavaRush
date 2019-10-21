package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
1. Ввести с консоли имя файла.
2. Считать все байты из файла.
3. Вывести на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            long[] listByte = new long[256];

            while (inputStream.available() > 0) {
                listByte[inputStream.read()]++;
            }
            inputStream.close();

            for (int i = 0; i < listByte.length; i++) {
                if ((listByte[i] > 0)) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) { }
    }
}
