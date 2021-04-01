package com.info.jjd.lesson6.task1;

import com.info.jjd.lesson6.task1.Human;
import com.info.jjd.lesson6.task1.Pupil;
import com.info.jjd.lesson6.task1.Teach;

public class Teacher extends Human implements Teach {
    private String taughtSubject;

    public Teacher(String name, int age) {
        super(name, age);
    }


    public String getTaughtSubject() {
        return taughtSubject;
    }

    @Override
    public void teach(Pupil pupil) {
        pupil.toStudy();
    }
}

