package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("Ruzanna", "ruzanna83@gmail.com");

        System.out.println(hashMap.get("Ruzanna"));

    }
}