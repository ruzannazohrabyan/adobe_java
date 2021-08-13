package com.company.week4.homework.task4LookAndSay;

public class Main {
    public static void main(String[] args) {
        System.out.println(lookAndSay(6));
        System.out.println(lookAndSay(7));
        System.out.println(lookAndSay(8));
    }

    public static String lookAndSay(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";

        String result = "1";
        StringBuilder temp = new StringBuilder();
        while (n != 1) {
            char currentChar = result.charAt(0);
            int count = 1;
            int i = 1;
            for (; i < result.length(); i++) {
                if (currentChar != result.charAt(i)) {
                    temp.append(count).append(currentChar);
                    currentChar = result.charAt(i);
                    count = 1;
                } else {
                    count++;
                }
            }
            temp.append(count).append(currentChar);
            n--;
            result = temp.toString();
            temp.setLength(0);
        }
        return result;
    }
}