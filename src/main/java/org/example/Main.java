package org.example;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean flag = true;
        for (int i = 0; i < 200; i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != c){
                    flag = false;
                    return result;
                }
            }
            if (flag){
                result+=c;
            }
        }
        return result;
    }
}
