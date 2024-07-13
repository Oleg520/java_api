package org.example.sem6.cw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Задание №4
 * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
 * Поместите в него некоторое количество объектов.
 * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
 * Убедитесь, что все они сохранились во множество.
 * 3. Создайте метод public boolean equals(Object o)
 * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
 * должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
 * 4. Создайте метод public int hashCode()
 * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
 * Objects.hash(...))
 * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
 */
public class Ex3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Pokemon";
        cat1.color = "Black";
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Bamble";
        cat2.color = "Yellow";
        cat2.age = 5;

        System.out.println(Arrays.asList(cat1, cat2));

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat1));
        System.out.println("cats = " + cats);
        System.out.println(cat1.equals(cat2));
        
        Set<Cat> cats2 = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            cats2.add(new Cat());
        }
        long end = System.currentTimeMillis();
        System.out.println("Время создания множества: "+ (end - start));
        
        start = System.currentTimeMillis();
        for (int i = 0; i < cats2.size(); i++) {
            cats2.contains(cat1);
        }
        end = System.currentTimeMillis();
        System.out.println("Время перебора: " + (end - start));
    }
}
