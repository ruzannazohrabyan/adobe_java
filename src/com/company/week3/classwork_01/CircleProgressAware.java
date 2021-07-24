package com.company.week3.classwork_01;

public class CircleProgressAware extends ProgressAware {

    @Override
    public void showProgress(int timeline) {
        int currentSecond = 0;
        showProgress();
        while (currentSecond != timeline) {
            currentSecond++;
            ImageLoader.sleep(50);
            System.out.println("Progress: " + (currentSecond * 360) / timeline + "\u00B0" + "/360\u00B0");
        }
        System.out.println("Progress: Completed");
    }
}
