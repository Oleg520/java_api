package org.example.sem5.hw.ex2;

import java.util.HashMap;

/**
 * Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
 * Программа должна использовать HashMap для хранения имен и их количества вхождений.
 * По завершении, программа выводит результат в виде пар "имя - количество".
 * <p>
 * Sample Input:
 * 'Elena'
 * 'Elena'
 * 'Elena'
 * 'Ivan'
 * 'Ivan'
 * <p>
 * Sample Output:
 * {Ivan=2, Elena=3}
 */
class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        }else {
            names.put(name,1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
    }
}
