package com.info.jjd.lesson5.task1;

public class Application {
    public static void main(String[] args) {
        Writer writer1 = new Writer("Михаил","Лермонтов");
        Writer writer2 = new Writer("Михаил","Булгагов");

        Book book1 = new Book("Герой нашего времени",300,1940,new Writer[]{writer1});
        Book book2 = new Book("Мастер и маршарита",500,1966,new Writer[]{writer2});

        Repository repository1 = new Repository();
        repository1.addBook(book1);
        repository1.addBook(book2);
        repository1.addBook(book2);
        System.out.println(repository1);

    }
}
