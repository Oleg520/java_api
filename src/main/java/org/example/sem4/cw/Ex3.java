package org.example.sem4.cw;

import java.util.*;

public class Ex3 {
    /**
     * 1) Написать метод, который принимает массив элементов, помещает их в стэк
     * и выводит на консоль содержимое стэка.
     * 2) Написать метод, который принимает массив элементов, помещает их в
     * очередь и выводит на консоль содержимое очереди.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы через запятую: ");
        String str = scanner.next();
        String[] array = str.split(",");
        System.out.println("Массив " + Arrays.toString(array));

        System.out.println("Стек");
        Stack<String> stack = new Stack<>();
        fillPrintStack(array, stack);

        System.out.println();

        System.out.println("Очередь");
        ArrayDeque<String> arrDeq = new ArrayDeque<>();
        fillPrintArrDeq(array, arrDeq);
    }

    private static void fillPrintArrDeq(String[] array, ArrayDeque<String> arrDeq) {
        for (String s : array) {
            arrDeq.offer(s);
        }
        while (!arrDeq.isEmpty()){
            System.out.println(arrDeq.poll());
        }
    }

    private static void fillPrintStack(String[] array, Stack<String> stack) {
        for (String s : array) {
            stack.push(s);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
