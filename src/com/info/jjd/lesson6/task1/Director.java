package com.info.jjd.lesson6.task1;

public class Director extends Teacher {

     public Director(String name, int age) {
         super(name, age);
     }

     void startLesson() {
        System.out.println("Star lesson");
    }
    void finishLesson() {
        System.out.println("Finish lesson");
    }


}
