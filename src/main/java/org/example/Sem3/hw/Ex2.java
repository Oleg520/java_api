package org.example.Sem3.hw;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    /**
     * Дан произвольный массив целых чисел.
     * Создайте список ArrayList, заполненный данными из этого массива.
     * Необходимо удалить из списка четные числа и вернуть результирующий.
     */
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            if (i%2!=0){
                list.add(i);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> onlyOddNumbers = removeEvenNumbers(arr);
        System.out.println(onlyOddNumbers);
    }
}
