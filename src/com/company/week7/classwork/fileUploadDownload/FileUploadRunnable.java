package com.company.week7.classwork.fileUploadDownload;

import java.io.File;

public class FileUploadRunnable implements FileOperationRunnable{

    final File file;
    final String url;

    public FileUploadRunnable(File file, String url) {
        this.file = file;
        this.url = url;
    }

    @Override
    public void run() {
        System.out.println(String.format("Starting to upload the file - %s to %s in thread %s", file.getAbsolutePath(), url, Thread.currentThread().getName()));
        AppUtils.sleep(2);
        System.out.println(String.format("Successfully uploaded the file - %s to %s", file.getAbsolutePath(), url));
    }
}
