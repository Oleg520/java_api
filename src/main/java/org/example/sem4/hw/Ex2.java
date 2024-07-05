package org.example.sem4.hw;

public class Ex2 {
    public static void main(String[] args) {
        MyQueueInt queue = new MyQueueInt();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}
