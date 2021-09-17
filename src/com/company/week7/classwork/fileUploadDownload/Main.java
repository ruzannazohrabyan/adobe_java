package com.company.week7.classwork.fileUploadDownload;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Thread thread;
        final List<FileOperationRunnable> fileOperationRunnableList = getAllFileList();
        runAll(fileOperationRunnableList);
        runAllRunnable(fileOperationRunnableList);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                long num = 0;
                while (true) {
//                    AppUtils.sleep(1);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                    System.err.printf("Print %d\n", num++);
                }
            }
        });
        thread1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                thread1.interrupt();
            }
        }).start();
    }


    public static void runAll(List<FileOperationRunnable> list) {
        for (final FileOperationRunnable runnable : list) {
            run(runnable);
        }
    }

    // qani vor List<FileOperationRunnable> is NOT a List<Runnable>, dra hamar grum enq ayspes List<? extends Runnable>
    // ays greladzevov chenq karox baci null-ic urish ban avelacnenq
    public static void runAllRunnable(List<? extends Runnable> list) {
        for (final Runnable runnable : list) {
            run(runnable);
        }
    }

    public static void run(Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
    }

    public static List<FileOperationRunnable> getAllFileList() {
        List<FileOperationRunnable> fileOperationRunnableList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            final File file = new File("C:\\Users\\Ruzanna\\Desktop\\certificateError" + i + ".png");
            FileOperationRunnable runnable = new FileUploadRunnable(file, "http://upload.com");
            fileOperationRunnableList.add(runnable);
        }
        return fileOperationRunnableList;
    }

}
