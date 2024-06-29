package org.example.sem1.hw;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.print("Укажите диапазон поиска простых чисел: ");
        printPrimeNums(n);
    }

    /**
     * @apiNote Поиск простых чисел
     * @param n верхняя граница
     */
    public static void printPrimeNums(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2 + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
