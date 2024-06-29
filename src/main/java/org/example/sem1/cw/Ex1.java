package org.example.sem1.cw;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = GetSumMinusPr(n);
        System.out.println("result= " + result);
        scanner.close();
    }

    /**
     * @apiNote доп описание
     * @param n начальное значение
     * @return произведение минут сумму
     */
    private static int GetSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;

        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}
