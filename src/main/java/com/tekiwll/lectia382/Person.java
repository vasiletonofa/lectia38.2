package com.tekiwll.lectia382;

public class Person {

    String name;
    String Surname;

    int varsta;


    public Person(String name, String surname, int varsta) {
        this.name = name;
        Surname = surname;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
