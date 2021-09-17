package com.company.week7.classwork.fileUploadDownload;

public final class AppUtils {

    private AppUtils(){

    }

    public static void sleep(long sec) {
        long millis = System.currentTimeMillis();
        while (System.currentTimeMillis() - millis < sec * 1000) {
        }
    }
}
