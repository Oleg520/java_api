package org.example.sem2.hw;

public class Ex1 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";
        QUERY = "select * from students where ";
        PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        System.out.println(answer(QUERY, PARAMS));
    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY);
        String newStr = PARAMS.replace('{', ' ')
                .replace('}', ' ')
                .replace('"', ' ')
                .replaceAll("\\s", "");
        String[] arr = newStr.split(",");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("null")) {
                continue;
            }
            String[] temp = arr[i].split(":");
            sb.append(temp[0]).append("=").append("'").append(temp[1]).append("'");
            if (i + 1 < arr.length && !arr[i + 1].contains("null")) {
                sb.append(" and ");
            }
        }
        return sb;
    }
}
