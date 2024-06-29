package org.example.sem2.cw;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = getShortString(s);
        System.out.println(result);
    }
    private static String getShortString(String str){
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for (char el: str.toCharArray()){
            if (el != c){
                c = el;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
