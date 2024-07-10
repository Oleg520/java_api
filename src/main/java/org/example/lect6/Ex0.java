package org.example.lect6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex0 {
    public static void fillArray(int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(25);
        }
    }
    public static float getUniquePercent(int[] arr){
        Set<Integer> nums = new HashSet<>();
        for (int i : arr) {
            nums.add(i);
        }
        return nums.size()/100f;
    }

    public static void main(String[] args) {
        int[] massiv = new int[100];
        fillArray(massiv);
        System.out.println(Arrays.toString(massiv));
        double percent = getUniquePercent(massiv);
        System.out.println("percent = " + percent);
    }
}
