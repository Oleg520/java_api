package org.example.sem2.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BubbleSort {
    private static File log = new File("log.txt");
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        String res = "";
        String last = "";
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }

            LocalDateTime dateTime = LocalDateTime.now();
            int year = dateTime.getYear();
            int month = dateTime.getMonthValue();
            int day = dateTime.getDayOfMonth();
            int hour = dateTime.getHour();
            int min = dateTime.getMinute();
            String date = String.format("%d-0%d-%d %d:%d ", year, month, day, hour, min);
            String state = "[";
            for (int j = 0; j < mas.length - 1; j++) {
                state += String.valueOf(mas[j] + ", ");
            }
            state += String.valueOf(mas[mas.length - 1]) + "]\n";
            res += date + state;
            if (last.equals(state)){
                break;
            }else{
                last = state;
            }
        }
        try (FileWriter fw = new FileWriter(log)) {
            fw.write(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        sort(arr);
    }
}
