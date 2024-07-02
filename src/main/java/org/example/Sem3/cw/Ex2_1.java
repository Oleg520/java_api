package org.example.Sem3.cw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex2_1 {
    /**
     * Заполнить список названиями планет Солнечной
     * системы в произвольном порядке с повторениями.
     * Вывести название каждой планеты и количество его
     * повторений в списке
     */
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        Random rnd = new Random();
        int n = rnd.nextInt(20);

        List<String> randPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randPlanets.add(planets.get(rnd.nextInt(planets.size())));
        }
        Collections.sort(randPlanets);
        int count = 1;
        for (int i = 0; i < randPlanets.size() - 1; i++) {
            if (randPlanets.get(i).equals(randPlanets.get(i + 1))) {
                count++;
            }else {
                System.out.printf("%s встретилась %d раз\n",randPlanets.get(i), count);
                count = 1;
            }
        }
        System.out.printf("%s встретилась %d раз\n",randPlanets.get(randPlanets.size()-1), count);
        System.out.println(randPlanets + "\nКоличество планет в списке = " +  randPlanets.size());


        /**
         * Пройти по списку из предыдущего задания и удалить
         * повторяющиеся элементы.
         */
        List<String> uniqPlanets = new ArrayList<>();
        for (int i = 0; i < randPlanets.size()-1; i++) {
            if (!randPlanets.get(i).equals(randPlanets.get(i+1))){
                uniqPlanets.add(randPlanets.get(i));
            }
        }
        System.out.println(uniqPlanets);
    }
}
