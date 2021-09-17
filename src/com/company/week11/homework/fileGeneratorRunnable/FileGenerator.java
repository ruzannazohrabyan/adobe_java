package com.company.week11.homework.fileGeneratorRunnable;

import com.company.week11.homework.runnable.PrintLinesIntoFile;

public class FileGenerator implements Runnable{
    private final int count;

    public FileGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (int i = 0; i < count; i++) {
            String path = "src\\com\\company\\week11\\homework\\fileGeneratorRunnable\\files\\file" + i + ".txt";
            PrintLinesIntoFile file = new PrintLinesIntoFile(path);
            file.run();
        }
    }
}
