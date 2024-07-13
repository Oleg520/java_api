package org.example.sem6.cw;

import java.util.*;

/**
 * Задание №1
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
 * цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с
 * помощью Set вычислите процент уникальных значений в данном массиве и
 * верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее
 * количество чисел в массиве.
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = fillArray(1000, 25);
        System.out.println("array = " + array);
        System.out.println(getUniquePercent(array) + "%");
    }

    public static ArrayList<Integer> fillArray(int size, int bound) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(rnd.nextInt(bound));
        }
        return arr;
    }

    public static float getUniquePercent(List<Integer> arr) {
        Set<Integer> uniqueValue = new HashSet<>(arr);
        return  uniqueValue.size() * 100f / arr.size();
    }
}
