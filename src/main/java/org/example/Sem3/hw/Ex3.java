package org.example.Sem3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {
    /**
     * Реализуйте метод, который принимает на вход целочисленный массив arr:
     * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
     * - Сортирует список по возрастанию и выводит на экран.
     * - Находит минимальное значение в списке и выводит на экран - Minimum is {число}
     * - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
     * - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
     */
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
        int min = getMinValue(arr);
        int max = getMaxValue(arr);
        double avg = getAvgValue(arr);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + avg);
    }
    private static double getAvgValue(Integer[] arr){
        double sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum/arr.length;
    }

    private static int getMinValue(Integer[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return  minValue;
    }
    private static int getMaxValue(Integer[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return  maxValue;
    }
    public static void main(String[] args) {
        Integer[] array = {9,8,7,6,5,4,3,2,1};
        analyzeNumbers(array);
    }
}
