package com.company.week2.homework_01;

public class Sentence {
    private String[] words = new String[5];
    private int wordsCount = 0;

    public void append(String word) {
        if (wordsCount < words.length) {
            words[wordsCount] = word;
            wordsCount++;
        }
    }

    public String getValue() {
        String sentence = "";
        for (int i = 0; i < wordsCount; i++) {
            sentence = sentence + words[i] + " ";
        }
        return sentence;
    }

    public int getWordsCount() {
        return wordsCount;
    }
}
