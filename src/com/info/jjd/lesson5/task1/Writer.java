package com.info.jjd.lesson5.task1;

import java.util.Objects;

public class Writer {
   private String name;
   private String surname;

    public Writer(String name, String surname) {
        setSurname(surname);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name,"name не может быть null");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        Objects.requireNonNull(surname,"surname не может быть null");
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}