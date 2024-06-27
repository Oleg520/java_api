package org.example.sem1.cw4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введи значения массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        if(isSimmetr(arr)){
            System.out.println("Симметричный");
        }else {
            System.out.println("не симметричный");
        }

        System.out.println("Массив выглядит так:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
    }

    /**

     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param arr
     * @return
     */
    private static boolean isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
