package org.example.lect2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Ex3");
        logger.info("Введите значения драгоценностей");
        String jewels = scanner.next();
        logger.info("Введите строку, содержащую обычные камни");
        String stones = scanner.next();
        if (jewels.isEmpty()){
            throw  new Exception("Не введен ни один символ, соответствующий драгоценностям");
        }
        if (stones.isEmpty()){
            throw  new Exception("Не введен ни один символ, соответствующий обычным камням");
        }
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(char c1: jewels.toCharArray()){

            for (char c2:jewels.toCharArray()){
                if (c1 == c2){
                    counter++;
                }
            }
            sb.append(c1).append(counter);
        }
        logger.info(sb.toString());
    }
}
