package org.example.sem2.cw;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (isPalyndrome(s)){
            System.out.println("Введенная строка является палиндромом");
        }else {
            System.out.println("Введенная строка не палиндром");
        }
    }
    private static boolean isPalyndrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
