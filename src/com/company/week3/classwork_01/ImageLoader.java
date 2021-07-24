package com.company.week3.classwork_01;

public class ImageLoader extends LineProgressAware {
    private String url;
    private boolean isLoaded = false;

    public ImageLoader(int lineLength) {
        super(lineLength);
    }

    public void showLoadStatus() {
        if (isLoaded) {
            System.out.println("Image loaded!!!");
        } else {
            System.out.println("Image doesn't loaded!!!");
        }
    }

    public void load() {
        if (!isLoaded) {
            showProgress(5);
            isLoaded = true;
            showLoadStatus();
        }
    }

    public static void sleep(int seconds) {
        long startMillis = System.currentTimeMillis();
        while (true) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= seconds) {
                break;
            }
        }
    }
}
