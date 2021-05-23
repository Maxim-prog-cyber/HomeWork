package com.info.jjd.lesson2122;

import java.util.ArrayList;

public class Sensor {
    private int temp;



    private ArrayList<Subscriber> subscribers;

    public Sensor() {
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void changeTemperatures(){
        for (int i = 0; i <= 600; i++) {
            temp = i;
            notifySubscriber();
        }

    }

    private void notifySubscriber(){
        for (Subscriber s:subscribers) {
            s.tempChanged(temp);
        }

    }


}
