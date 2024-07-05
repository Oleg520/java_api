package org.example.sem4.cw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex2 {
    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная
     * была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные команды: 'print', 'revert', 'exit'");
        String input = scanner.next();
        Deque<String> list = new ArrayDeque<>();
        while (!input.equals("exit")) {
            if (input.equalsIgnoreCase("print")){
                if (list.isEmpty()){
                    System.out.println("Список пуст.");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        String el = list.pollFirst();
                        System.out.println(el);
                        list.addLast(el);
                    }
                }
            } else if (input.equalsIgnoreCase("revert")) {
                if (list.isEmpty()){
                    System.out.println("Список пуст.");
                } else {
                    String reverted = list.pop();
                    System.out.println("reverted element = " + reverted);
                }
            }else {
                list.addFirst(input);
            }


            input = scanner.next();
        }
        System.out.println("Завершение работы");
    }
}
