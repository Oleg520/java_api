package org.example.sem6.cw;

/**
 * 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
 * использовать не все придуманные поля и методы. Создайте несколько
 * экземпляров этого класса, выведите их в консоль.
 * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
 * его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
 */
public class Cat {
    int id;
    String name;
    int age;
    String sex;
    String owner;
    String color;

    @Override
    public String toString() {

        return String.format("name: %s; color: %s; age: %d", name,color,age);
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id;
    }
}