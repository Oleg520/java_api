package org.example.sem2.cw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class Ex4 {
    private static final Logger logger = Logger.getLogger(Ex4.class.getName());
    public static void main(String[] args)  {
//        Напишите метод, который составит строку, состоящую из 100
//        повторений слова TEST и метод, который запишет эту строку в
//        простой текстовый файл, обработайте исключения.
        String file = "myText.txt";
        String str = "TEST\n".repeat(100);
        writeFile(str, file);
    }

    private static void writeFile(String str, String fileName)  {
        try(FileWriter fw = new FileWriter(fileName)){
            fw.write(str);
            System.out.println("File written to " + fileName);
            throw new IOException();
        }catch (IOException e){
            FileHandler fh = null;
            try {
                fh = new FileHandler("error.log", true);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.warning("Ошибка записи");
        }
    }
}
