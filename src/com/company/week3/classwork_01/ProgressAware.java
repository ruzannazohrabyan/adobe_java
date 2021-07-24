package com.company.week3.classwork_01;

public class ProgressAware {
    private boolean isVisible = false;


    public void showProgress() {
        isVisible = true;
        System.out.println("Progress is Visible");
    }

    public void hideProgress() {
        isVisible = false;
        System.out.println("Progress is Invisible");
    }

    public boolean isProgressVisible() {
        return isVisible;
    }

    public void showProgress(int timeline) {
        int currentSecond = 0;
        showProgress();
        while (currentSecond != timeline) {
            ImageLoader.sleep(50);
            currentSecond++;
            calculateProgress(timeline, currentSecond);
        }
        System.out.println("Progress: Completed");
    }

    private void calculateProgress(int timeline, int seconds) {
        System.out.println("Progress: " + (seconds * 100) / timeline + "%");
    }
}
