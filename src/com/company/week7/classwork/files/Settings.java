package com.company.week7.classwork.files;

import java.io.Serializable;

public class Settings implements Serializable {
    private int width;
    private int height;
    private String projectName;

    public Settings() {
        super();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public String toString() {
        return "Settings{" +
                "width=" + width +
                ", height=" + height +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
