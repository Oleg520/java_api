package org.example.Sem3.cw;

public class Ex0 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println("Cравнение строки 1");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s1 == s2 -> " + notStrictEquality(s1, s2) + "  |" + " s1.equals(s2) -> " + equalsMethod(s1, s2) + "|");
        System.out.println("|s1 == s3 -> " + notStrictEquality(s1, s3) + "  |" + " s1.equals(s3) -> " + equalsMethod(s1, s3) + "|");
        System.out.println("|s1 == s4 -> " + notStrictEquality(s1, s4) + "  |" + " s1.equals(s4) -> " + equalsMethod(s1, s4) + "|");
        System.out.println("|s1 == s5 -> " + notStrictEquality(s1, s5) + " |" + " s1.equals(s5) -> " + equalsMethod(s1, s5) + "|");
        System.out.println("|s1 == s6 -> " + notStrictEquality(s1, s6) + " |" + " s1.equals(s6) -> " + equalsMethod(s1, s6) + "|");
        System.out.println("+------------------+----------------------+");
        System.out.println("Cравнение строки 2");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s2 == s1 -> " + notStrictEquality(s2, s1) + "  |" + " s2.equals(s1) -> " + equalsMethod(s2, s1) + "|");
        System.out.println("|s2 == s3 -> " + notStrictEquality(s2, s3) + "  |" + " s2.equals(s3) -> " + equalsMethod(s2, s3) + "|");
        System.out.println("|s2 == s4 -> " + notStrictEquality(s2, s4) + "  |" + " s2.equals(s4) -> " + equalsMethod(s2, s4) + "|");
        System.out.println("|s2 == s5 -> " + notStrictEquality(s2, s5) + " |" + " s2.equals(s5) -> " + equalsMethod(s2, s5) + "|");
        System.out.println("|s2 == s6 -> " + notStrictEquality(s2, s6) + " |" + " s2.equals(s6) -> " + equalsMethod(s2, s6) + "|");
        System.out.println("+------------------+----------------------+");
        System.out.println("Cравнение строки 3");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s3 == s1 -> " + notStrictEquality(s3, s1) + "  |" + " s3.equals(s1) -> " + equalsMethod(s3, s1) + "|");
        System.out.println("|s3 == s2 -> " + notStrictEquality(s3, s2) + "  |" + " s3.equals(s2) -> " + equalsMethod(s3, s2) + "|");
        System.out.println("|s3 == s4 -> " + notStrictEquality(s3, s4) + "  |" + " s3.equals(s4) -> " + equalsMethod(s3, s4) + "|");
        System.out.println("|s3 == s5 -> " + notStrictEquality(s3, s5) + " |" + " s3.equals(s5) -> " + equalsMethod(s3, s5) + "|");
        System.out.println("|s3 == s6 -> " + notStrictEquality(s3, s6) + " |" + " s3.equals(s6) -> " + equalsMethod(s3, s6) + "|");
        System.out.println("+------------------+----------------------+");
        System.out.println("Cравнение строки 4");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s4 == s1 -> " + notStrictEquality(s4, s1) + "  |" + " s4.equals(s1) -> " + equalsMethod(s4, s1) + "|");
        System.out.println("|s4 == s2 -> " + notStrictEquality(s4, s2) + "  |" + " s4.equals(s2) -> " + equalsMethod(s4, s2) + "|");
        System.out.println("|s4 == s3 -> " + notStrictEquality(s4, s3) + "  |" + " s4.equals(s3) -> " + equalsMethod(s4, s3) + "|");
        System.out.println("|s4 == s5 -> " + notStrictEquality(s4, s5) + " |" + " s4.equals(s5) -> " + equalsMethod(s4, s5) + "|");
        System.out.println("|s4 == s6 -> " + notStrictEquality(s4, s6) + " |" + " s4.equals(s6) -> " + equalsMethod(s4, s6) + "|");
        System.out.println("+------------------+----------------------+");
        System.out.println("Cравнение строки 5");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s5 == s1 -> " + notStrictEquality(s5, s1) + " |" + " s5.equals(s1) -> " + equalsMethod(s5, s1) + "|");
        System.out.println("|s5 == s2 -> " + notStrictEquality(s5, s2) + " |" + " s5.equals(s2) -> " + equalsMethod(s5, s2) + "|");
        System.out.println("|s5 == s3 -> " + notStrictEquality(s5, s3) + " |" + " s5.equals(s3) -> " + equalsMethod(s5, s3) + "|");
        System.out.println("|s5 == s4 -> " + notStrictEquality(s5, s4) + " |" + " s5.equals(s4) -> " + equalsMethod(s5, s4) + "|");
        System.out.println("|s5 == s6 -> " + notStrictEquality(s5, s6) + " |" + " s5.equals(s6) -> " + equalsMethod(s5, s6) + "|");
        System.out.println("+------------------+----------------------+");
        System.out.println("Cравнение строки 6");
        System.out.println("+------------------+----------------------+");
        System.out.println("|s6 == s1 -> " + notStrictEquality(s6, s1) + " |" + " s6.equals(s1) -> " + equalsMethod(s6, s1) + "|");
        System.out.println("|s6 == s2 -> " + notStrictEquality(s6, s2) + " |" + " s6.equals(s2) -> " + equalsMethod(s6, s2) + "|");
        System.out.println("|s6 == s3 -> " + notStrictEquality(s6, s3) + " |" + " s6.equals(s3) -> " + equalsMethod(s6, s3) + "|");
        System.out.println("|s6 == s4 -> " + notStrictEquality(s6, s4) + " |" + " s6.equals(s4) -> " + equalsMethod(s6, s4) + "|");
        System.out.println("|s6 == s5 -> " + notStrictEquality(s6, s5) + " |" + " s6.equals(s5) -> " + equalsMethod(s6, s5) + "|");
        System.out.println("+------------------+----------------------+");
    }

    public static boolean notStrictEquality(String line1, String line2) {
        if (line1 == line2) return true;
        return false;
    }

    public static boolean equalsMethod(String line1, String line2) {
        if (line1.equals(line2)) return true;
        return false;
    }
}
