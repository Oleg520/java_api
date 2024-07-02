package org.example.sem2.cw;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ex1 {
    public static void main(String[] args)  {
//        String pathProject = System.getProperty("user.dir");
//        System.out.println("pathProject = " + pathProject);
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Ex1");
        String c1;
        String c2;
        int n;
        logger.info("Введите значение c1:");
        c1 = scanner.next();
        logger.info("Введите значение c2:");
        c2 = scanner.next();
        logger.info("Введите значение N:");
        n = scanner.nextInt();

        String s = null;
        try {
            s = getStrOfChars(n, c1, c2);
            System.out.println("s = " + s);
            System.out.println("s.length = " + s.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param n string length
     * @param c1 char 1
     * @param c2 char 2
     * @return String N-length with c1 and c2 alternating chars
     */
    private static String getStrOfChars(int n, String c1, String c2) throws Exception {
        if (n <= 0 || n % 2 == 1) {
            throw new Exception("Не валидное значение N");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
