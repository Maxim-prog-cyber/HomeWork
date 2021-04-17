package com.info.jjd.lesson13;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        int countLow = 0;
        int countHigh = 0;
        int countMedium = 0;
        int countUrgent = 0;
        for (Message c : messageList) {
            if (c.getPriority().equals(Message.MessagePriority.HIGH)) countHigh++;
            if (c.getPriority().equals(Message.MessagePriority.LOW)) countLow++;
            if (c.getPriority().equals(Message.MessagePriority.MEDIUM)) countMedium++;
            if (c.getPriority().equals(Message.MessagePriority.URGENT)) countUrgent++;
        }
        System.out.println(" MessagePriority.HIGH: " + countHigh + "; MessagePriority.LOW: " + countLow + "; MessagePriority.MEDIUM: " + countMedium + "; MessagePriority.URGENT: " + countUrgent);
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
//        int [] counts = new int[Message.MessagePriority.values().length];
//        for (Message message: messageList) {
//            counts[message.getPriority().ordinal()]++;
//        }
//        System.out.println(counts);
    }

    public static void countEachCode(List<Message> messageList) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (Message s : messageList) {
//            hashMap.put(s.getCode(),hashMap.getOrDefault(s.getCode(),0) + 1);
            if (hashMap.containsKey(s.getCode())) {
                hashMap.put(s.getCode(), hashMap.get(s.getCode()) + 1);
            } else {
                hashMap.put(s.getCode(), 1);
            }
        }
        System.out.println(hashMap);
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        System.out.println(new HashSet<>(messageList).size());
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        LinkedList<Message> list = new LinkedList<>();
        for (Message s : messageList)
            if (s.getPriority() == priority) list.add(s);
        return list;
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        LinkedList<Message> messageLinkedList = new LinkedList<>();
        for (Message s : messageList)
            if (s.getPriority() != priority) messageLinkedList.add(s);
        return messageLinkedList;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);

        // вызов методов
        System.out.println(messages);

        System.out.println(MessageTask.copyEach(messages, Message.MessagePriority.LOW));

        System.out.println( MessageTask.copyOther(messages,Message.MessagePriority.LOW));



    }
}