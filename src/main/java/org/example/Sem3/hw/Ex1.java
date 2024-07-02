package org.example.Sem3.hw;

import java.util.Arrays;

public class Ex1 {
    public static int[] mergeSort(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a; // возврат в рекурсию в строки ниже см комменты.
        }
        int [] arrayL = new int[a.length / 2];
        System.arraycopy(a, 0, arrayL, 0, a.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int [] arrayR = new int[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, arrayR, 0, a.length - a.length / 2);

        arrayL = mergeSort(arrayL); // левая часть возврат из рекурсии строкой return arrayA;
        arrayR = mergeSort(arrayR); // правая часть возврат из рекурсии строкой return arrayA;

        return merge(arrayL, arrayR);
    }

    public static int[] merge(int[] arrayL, int[] arrayR) {
        int[] sortedArr = new int[arrayL.length + arrayR.length];
        int posL = 0, posR = 0;
        for (int i = 0; i < sortedArr.length; i++) {
            if(posL == arrayL.length){
                sortedArr[i] = arrayR[posR];
                posR++;
            } else if (posR == arrayR.length) {
                sortedArr[i] = arrayL[posL];
                posL++;
            } else if (arrayL[posL] < arrayR[posR]) {
                sortedArr[i] = arrayL[posL];
                posL++;
            } else {
                sortedArr[i] = arrayR[posR];
                posR++;
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 6, 2, 3, 4};
        String result = Arrays.toString(mergeSort(a));
        System.out.println(result);
    }
}
