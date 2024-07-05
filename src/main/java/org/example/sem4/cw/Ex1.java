package org.example.sem4.cw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя строку вида
     * text~num
     * 2. Нужно рассплитить строку по ~, сохранить text в связный список на
     * позицию num.
     * 3. Если введено print~num, выводит строку из позиции num в связном
     * списке и удаляет её из списка.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку типа 'text~num' для сохранения текста на позицию num");
        System.out.println("Введите строку типа 'print~num' для поллучения текста из списка по позиции num");

        String input = scanner.next();
        List<String> list = new LinkedList<>();
        String[] arr = new String[2];
        while (!input.equals("exit")) {
            arr = input.split("~");
            int num = Integer.parseInt(arr[1]);
            if (arr[0].equals("print")) {
                if (num > list.size()) {
                    System.out.println("Такого элемента не существует.");
                }else {
                    System.out.println(list.remove(num));
                }
            } else {
                if (num > list.size()) {
                    System.out.println("Указанной позиции не существует. Элемент добавлен в конец списка");
                    list.add(arr[0]);
                } else {
                    list.add(num, arr[0]);
                }
            }
            System.out.println(list);

            input = scanner.next();
        }
        System.out.println("Завершение работы");
    }
}
