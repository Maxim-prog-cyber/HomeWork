package com.info.jjd.lesson5.task1;

import java.util.Arrays;
import java.util.Objects;

public class Book {
   private String nameBook;
   private Writer[] writers;
   private int countPages;
   private int yearPublishing;

    public Book(String nameBook,int countPages,int yearPublishing,Writer[] writer) {
        setNameBook(nameBook);
        setCountPages(countPages);
        setYearPublishing(yearPublishing);
        setWriters(writer);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        Objects.requireNonNull(nameBook,"nameBook не может быть null");
        this.nameBook = nameBook;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        Objects.requireNonNull(writers,"writers не может быть null");
        this.writers = writers;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages <= 0 ) throw new IllegalArgumentException("колличсевто старниц не может быть меньше нуля");
        this.countPages = countPages;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        if (yearPublishing > 2021) throw new IllegalArgumentException("такого года публикации не может быть");
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", writers=" + Arrays.toString(writers) +
                ", countPages=" + countPages +
                ", yearPublishing=" + yearPublishing +
                '}';
    }
}
