package org.example.sem6.cw;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
 * 6, 3}. Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 */
public class Ex0 {
    public static void main(String[] args) {
        hashSet();
        linkedHashSet();
        treeSet();
    }

    private static void hashSet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(4);
        set1.add(2);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(3);
        System.out.println("HashSet: " + set1);
    }

    private static void linkedHashSet() {
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(6);
        set2.add(4);
        set2.add(2);
        set2.add(3);
        set2.add(2);
        set2.add(5);
        set2.add(3);
        System.out.println("LinkedHashSet: " + set2);
    }

    private static void treeSet() {
        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(6);
        set3.add(4);
        set3.add(2);
        set3.add(3);
        set3.add(2);
        set3.add(5);
        set3.add(3);
        System.out.println("TreeSet: " + set3);
    }
}
