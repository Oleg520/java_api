package org.example.sem5.cw;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать структуру для хранения Номеров паспортов и Фамилий
 * сотрудников организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов
 */
public class Ex0 {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(123456, "Иванов");
        users.put(321456, "Васильев");
        users.put(234561, "Петрова");
        users.put(234432, "Иванов");
        users.put(654321, "Петрова");
        users.put(345678, "Иванов");

        System.out.println("Сотрудники с фамилией Иванов: ");
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            if ("Иванов".equals(entry.getValue())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
