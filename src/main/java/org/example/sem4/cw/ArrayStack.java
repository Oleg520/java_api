package org.example.sem4.cw;

public class ArrayStack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("Стек переполнен, невозможно добавить!");
        }
    }

    public String peek() {
        if (!empty()) {
            return stackArray[top];
        } else {
            System.out.println("Список пуст");
            return null;
        }
    }

    public String pop() {
        if (!empty()) {
            String value = stackArray[top];
            top--;
            stackArray[top] = null;
            return value;
        } else {
            System.out.println("Список пуст");
            return null;
        }
    }
}