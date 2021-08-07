package com.company.week4.classwork.task3;

public class SchoolBookPagePrinter extends PagePrinter {
    private String schoolName;

    public SchoolBookPagePrinter(String schoolName) {
        if (schoolName == null) {
            throw new RuntimeException("Invalid School Name");
        }
        this.schoolName = schoolName;
    }

    @Override
    void printContent(int pageNumber, String content) {
        System.out.println(content);
        if (pageNumber == 17) {
            System.out.println("           " + schoolName);
        }
    }
}
