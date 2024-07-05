package org.example.sem4.hw;

import java.util.LinkedList;

/**
 * В классе MyQueueInt реализуйте очередь для типа данных Integer
 * с помощью LinkedList со следующими методами:
 */
public class MyQueueInt {
    private LinkedList<Integer> elements = new LinkedList<>();

//  помещает элемент в конец очереди
    public void enqueue(int element) {
        elements.add(element);
    }

    //  возвращает первый элемент из очереди и удаляет его
    public int dequeue() {
        return elements.removeFirst();
    }

    //  возвращает первый элемент из очереди, не удаляя
    public int first() {
        return elements.getFirst();
    }

    //  возвращает все элементы в очереди
    public LinkedList<Integer> getElements() {
        return elements;
    }
}
