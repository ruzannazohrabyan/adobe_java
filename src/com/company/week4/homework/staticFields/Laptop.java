package com.company.week4.homework.staticFields;

public class Laptop {
    private String vendor;
    private String model;

    private static int countPublic;
    private static int countProtected;

    public Laptop(String vendor, String model) {
        countPublic++;
    }

    protected Laptop(String vendor) {
        countProtected++;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public static int getCountPublic() {
        return countPublic;
    }

    public static int getCountProtected() {
        return countProtected;
    }
}
