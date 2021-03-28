package com.info.jjd.lesson5.task1;

import com.info.jjd.lesson5.task1.Book;

import java.util.Arrays;
import java.util.Objects;

public class Repository {
    private Book[] books;
    private int numberRepository;

    public Repository() {
        this.books = new Book[20];
        numberRepository++;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "books=" + Arrays.toString(books) +
                ", numberRepository=" + numberRepository +
                '}';
    }


    public void addBook(Book book) {
        Objects.requireNonNull(book,"book нее может быть null");
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                System.out.println("такой элемент уже есть и он добавлен не будет");
                return;
            }
        }
//        for (Book element:books) {
//            if (book.equals(element)){
//                throw new IllegalArgumentException("Такой элемент уже есть");
//            }
//        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                books[i] = book;
                return;
            }

        }
        System.out.println("Места больеше нет");
    }
}
