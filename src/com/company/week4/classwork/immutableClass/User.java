package com.company.week4.classwork.immutableClass;

import java.util.Date;

public final class User {
    //If we want the class to be immutable
    //Class have to be final
    //Petq e chunena setterner
    //constructori mej new referenceType enq stexcum ete reference e
    //ev get aneluc eli obyekti reference type-y new -ov enq veradardznum
    //Ete drsic enq talis constructorin reference apa dranq el petq e aynpes anenq vor drsic chkaroxanan classi state poxi


    private final String name;
    private final Date birthDate;

    public User(final String name, final Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBirthDate: " + birthDate;
    }

    public static void main(String[] args) {
        Date date = new Date();
        final User a = new User("A", date);
        System.out.println(a);

        final Date birthDate = a.getBirthDate();
        birthDate.setTime(birthDate.getTime() - 500000);
        System.out.println(a);

        date.setTime(date.getTime() - 50000000);
        System.out.println(a);

    }
}
