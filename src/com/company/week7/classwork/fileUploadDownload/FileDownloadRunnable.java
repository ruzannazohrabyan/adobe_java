package com.company.week7.classwork.fileUploadDownload;

import java.io.File;

public class FileDownloadRunnable implements FileOperationRunnable{
    final File file;
    final String url;


    public FileDownloadRunnable(File file, String url) {
        this.file = file;
        this.url = url;
    }

    @Override
    public void run() {
        System.out.println(String.format("Starting to download of the file from %s", url));
    }
}
