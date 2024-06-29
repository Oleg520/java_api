package org.example.sem1.hw;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("N-ое треугольное число = " + countNTriangle(n));
    }

    /**
     * @apiNote Находим N-ое треугольное число
     * @param n порядковый номер
     * @return результат
     */
    public static int countNTriangle(int n){
        // Введите свое решение ниже
        if (n < 1) return -1;
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }
}
