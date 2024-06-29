package org.example.sem2.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            bubbleSort(mas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
    private static int[] bubbleSort(int[] mas){
        boolean isSorted = false;
        int buffer;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]){
                    isSorted = false;
                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            logSteps(Arrays.toString(mas));
        }
        return mas;
    }

    public static void logSteps(String strArray){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String dateTime = dateFormat.format(new Date());
        try {
            fileWriter.write(dateTime + " " + strArray + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
