package org.example.sem5.hw.ex2;

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        name1 = "Elena";
        name2 = "Elena";
        name3 = "Elena";
        name4 = "Ivan";
        name5 = "Ivan";

        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);
        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}
