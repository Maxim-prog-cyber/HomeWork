package com.info.jjd.lesson6.task1;

public class Pupil extends Human implements ToStudy {

    private String standingSubject;
    private int knowledgeLevel;

    public Pupil(String name, int age, String standingSubject) {
        super(name,age);
        this.standingSubject = standingSubject;
    }

    public String getStandingSubject() {
        return standingSubject;
    }

    @Override
    public void toStudy() {
        knowledgeLevel++;
    }
}