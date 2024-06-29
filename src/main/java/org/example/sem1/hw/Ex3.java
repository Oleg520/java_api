package org.example.sem1.hw;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите знак операции: ");
        String str = scanner.next();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        char op = str.charAt(0);
        scanner.close();
        double result = calculate(op, a, b);
        System.out.println("result = " + result);
    }

    /**
     * @param op арифметический оператор
     * @param a  первое число
     * @param b  второе число
     * @return результат операции
     * @apiNote Выполняет арифметические операции над числами a и b
     */
    public static double calculate(char op, double a, double b) {
        // Введите свое решение ниже
        double result = -1;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Ошибка при делении на 0");
                    break;
                }
                result = a / b;
                break;
            default:
                System.out.printf("Некорректный оператор: %s\n", op);
                return 0;
        }
        return result;
    }
}
