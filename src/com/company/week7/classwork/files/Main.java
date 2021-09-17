package com.company.week7.classwork.files;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Settings st = new Settings();
        st.setHeight(10);
        st.setWidth(20);
        Main ob= new Main();
        ob.saveAsTextFile(st);
        ob.readFromTextFile();


//        ############################
        File file2 = new File("C:\\Users\\Ruzanna\\Desktop\\file2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bytes = {(byte)'(', (byte)'0', (byte)')'};
        fileOutputStream.write(bytes);


//        ########################
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Ruzanna\\Desktop\\file3.txt")));
//        objectOutputStream.writeInt(54354);
        objectOutputStream.writeInt(03326);
        objectOutputStream.writeInt(54354);
        objectOutputStream.writeInt(2455);
        objectOutputStream.writeInt(54354);
        objectOutputStream.writeInt(0);
        objectOutputStream.close();
    }

//    public void save




    public void saveAsTextFile(Settings s) throws FileNotFoundException {
        Formatter formatter = new Formatter("C:\\Users\\Ruzanna\\Desktop\\file.txt");
        formatter.format("%d %d %s", s.getHeight(), s.getWidth(), s.getProjectName());
        formatter.flush();
        formatter.close();
    }

    public Settings readFromTextFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Ruzanna\\Desktop\\file.txt");
        Scanner scanner = new Scanner(file);
        Settings st = new Settings();
        st.setHeight(scanner.nextInt());
        st.setWidth(scanner.nextInt());
        st.setProjectName(scanner.next());
        scanner.close();
        return st;
    }
}
