package com.company.week7.classwork.files;

import com.company.week6.classwork.task2.Buffer;

import java.io.*;

public class MainSettings {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Settings settings = new Settings();
        settings.setProjectName("dfadfdf");
        settings.setWidth(10);
        settings.setHeight(10);

//        Testing ObjectOutputStream
//        ObjectOutputStream stream = new ObjectOutputStream(
//                new FileOutputStream("C:\\Users\\Ruzanna\\Desktop\\file4.txt"));
//
//        stream.writeObject(settings);
//        stream.close();
//
//        ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("C:\\Users\\Ruzanna\\Desktop\\file4.txt"));
//
//        Object content = inputStream.readObject();
//        System.out.println(content.toString());
//
//        inputStream.close();

//        Testing PrintWriter
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("C:\\Users\\Ruzanna\\Desktop\\file5.txt"));
        printWriter.println("line1");
        printWriter.println("line2");
        printWriter.println("line3");

        printWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Ruzanna\\Desktop\\file5.txt"));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }

        bufferedReader.close();



    }
}
