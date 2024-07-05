package org.example.sem4.hw;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        revertLL(ll);
        System.out.println(ll);
    }

    public static void revertLL(LinkedList<Object> ll) {
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - i - 1));
            ll.set(size - i - 1, temp);
        }
    }
}
