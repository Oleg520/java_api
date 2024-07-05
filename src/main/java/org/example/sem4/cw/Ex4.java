package org.example.sem4.cw;

public class Ex4 {
    /**
     * Реализовать стэк с помощью массива.
     * Нужно реализовать методы:
     * size(), empty(), push(), peek(), pop().
     */
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        System.out.println("arrayStack.size() = " + arrayStack.size());
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        System.out.println("arrayStack.peek() = " + arrayStack.peek());
        System.out.println("arrayStack.pop() = " + arrayStack.pop());
        System.out.println("arrayStack.peek() = " + arrayStack.peek());
        System.out.println("arrayStack.empty() = " + arrayStack.empty());
        System.out.println("arrayStack.size() = " + arrayStack.size());
    }
}
