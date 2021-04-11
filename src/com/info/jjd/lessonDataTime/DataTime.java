package com.info.jjd.lessonDataTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTime {
    public static void main(String[] args) {

        //task 1
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH:mm");

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime syd = localDateTime.atZone(ZoneId.of("Australia/Sydney"));
        System.out.println("в Cиднеи сейчас " + formatter.format(syd));
        System.out.println();

        ZonedDateTime houston = syd.withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println("в Хьюстоне сейчас " + formatter.format(houston));
        System.out.println("Время вылета! из аэропорта Хьюстона (время местное для Хьюстона) " + formatter.format(houston.plusHours(16).plusMinutes(35)));
        System.out.println();

        ZonedDateTime washington = houston.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("в Вашингтоне сейчас " + formatter.format(washington));
        System.out.println("Время вылета! из аэропорта Вашингтона (время местное для Вашингтона) " + formatter.format(washington.plusHours(20).plusMinutes(34)));

        System.out.println();
        ZonedDateTime ottawa = washington.withZoneSameInstant(ZoneId.of("America/Toronto"));
        System.out.println("в Оттаве сейчас " + formatter.format(ottawa));
        System.out.println("Время прибытия! в аэропорт Оттавы (время местное для Оттавы) " + formatter.format(ottawa.plusHours(22).plusMinutes(14)));

        //task2

        LocalTime localTime1 = LocalTime.now();

        LocalTime morning1 = LocalTime.of(7,0);
        LocalTime morning2 = LocalTime.of(15,0);
        LocalTime day1 = LocalTime.of(15,0);
        LocalTime day2 = LocalTime.of(23,0);
        LocalTime evening1 = LocalTime.of(23,0);
        LocalTime evening2 = LocalTime.of(7,0);
        if (localTime1.isAfter(morning1) && localTime1.isBefore(morning2)) System.out.println("Утреняя смена ");
        if (localTime1.isAfter(day1) && localTime1.isBefore(day2)) System.out.println("Дневная");
        if (localTime1.isAfter(evening1) && localTime1.isBefore(evening2)) System.out.println("Ночная ");

        //task3

        LocalDate finishLesson = LocalDate.of(2021,6,16);
        LocalDate currentDate = LocalDate.now();

        long between = ChronoUnit.WEEKS.between(currentDate,finishLesson);
        System.out.println("кол-во занятий " + between * 3);

        System.out.println("защита диплома " + finishLesson.plusWeeks(2));

















    }
}
