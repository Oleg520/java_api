package org.example.sem5.hw.ex1;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
 *
 * add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
 * Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
 * Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
 *
 * find(String name): Поиск номеров телефона по имени в телефонной книге.
 * Если запись с именем name существует, ВОЗВРАЩАЕТ список номеров телефона для этой записи.
 * Если запись с именем name не существует, ВОЗВРАЩАЕТ пустой список.
 *
 * getPhoneBook(): ВОЗВРАЩАЕТ всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
 *
 * - Sample Input:
 * add("Alice", 123456);
 * add("Alice", 789012);
 * add("Bob", 789012);
 *
 * find("Alice")
 * getPhoneBook()
 * find("Me")
 *
 * - Sample Output:
 * [123456, 789012].
 * {Bob=[789012], Alice=[123456, 789012]}
 * []
 */
public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }else {
            ArrayList<Integer> phoneNums = new ArrayList<>();
            phoneNums.add(phoneNum);
            phoneBook.put(name, phoneNums);
        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> findList = new ArrayList<>();
        if (phoneBook.containsKey(name)){
            findList.addAll(phoneBook.get(name));
        }
        return findList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
