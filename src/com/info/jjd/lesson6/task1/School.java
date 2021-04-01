package com.info.jjd.lesson6.task1;

public class School  {
    private String name;
    private Director director;
    private Pupil[] pupils;
    private Teacher[] teachers;

    public School(String name, Director director) {
        setName(name);
        this.director = director;

    }

    private void setName(String name) {
        this.name = name;
    }

    void daySchool() {
        director.startLesson();
        for (int i = 0; i < teachers.length; i++) {
            for (int j = 0; j < pupils.length; j++) {
                if (teachers[i].getTaughtSubject().equals(pupils[j].getStandingSubject())){
                    teachers[i].teach(pupils[j]);
                }
            }
        }
        director.finishLesson();
    }


}
