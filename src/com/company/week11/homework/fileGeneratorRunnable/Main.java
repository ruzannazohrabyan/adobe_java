package com.company.week11.homework.fileGeneratorRunnable;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Runnable fileGenerator = new FileGenerator("src\\com\\company\\week11\\homework\\fileGeneratorRunnable\\files\\file" + i + ".txt");
            fileGenerator.run();
        }

    }
}
