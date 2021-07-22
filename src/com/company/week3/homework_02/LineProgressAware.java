package com.company.week3.homework_02;

public class LineProgressAware extends ProgressAware {
    private int lineLength;

    public LineProgressAware(int lineLength) {
        if (lineLength < 0) {
            throw new RuntimeException();
        }
        this.lineLength = lineLength;
    }

    @Override
    public void showProgress(int timeline) {
        int currentSecond = 0;
        showProgress();
        while (currentSecond != timeline) {
            ImageLoader.sleep(100);
            currentSecond++;
            System.out.println("Line length is: " + lineLength + ", Progress length is: " + (currentSecond * lineLength) / timeline);
        }
        System.out.println("Progress: Completed");
    }
}
