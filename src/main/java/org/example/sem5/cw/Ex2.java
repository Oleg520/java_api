package org.example.sem5.cw;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class Ex2 {
    public static Map<Character, Character> pair = new HashMap<>();
    public static void main(String[] args) {
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');
        pair.put('<', '>');

        String srs = "{a+]}{(d*3)}";
        System.out.println(conditionPairs(srs));
    }

    private static boolean conditionPairs(String srs) {
        Stack<Character> lifo = new Stack<>();
        for (char c : srs.toCharArray()) {
            if (pair.containsKey(c)) {
                lifo.push(c);
            } else if (pair.containsValue(c)) {
                if (lifo.isEmpty() || pair.get(lifo.pop()) != c) {
                    return false;
                }
            }
        }
        return lifo.isEmpty();
    }
}