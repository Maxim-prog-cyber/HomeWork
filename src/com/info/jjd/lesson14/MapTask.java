package com.info.jjd.lesson14;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // TODO:: написать статический метод, который принимает на вход мапу (например, firstTaskMap) и город (например, city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";
//        System.out.println(returnLogin(firstTaskMap, city));


        // TODO:: дан список слов (например, words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов с списке
        //  в виде Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");
//        System.out.println(amountWords(words));


        // TODO:: дана мапа (например, customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));
//        System.out.println(customerHashMap(15, 50, customerMap));


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту
        //  встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы
        //  по количеству букв:
        //  например, в одну группу попадут слова:
        //  3 - [the, war, jar, get, met...],
        //  в другую 2 - [on, up, no, of...] и тд
        //  результат сохранить в Map<Integer, ArrayList>
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. вывести частоту встречаемости букв английского алфавита в данном тексте. Вывести в процентах для каждой буквы

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
//        frequencyWord("use", text);
        topTenWords(text);


    }

    public static List<String> returnLogin(HashMap<String, String> mapa, String city) {
        LinkedList<String> loginString = new LinkedList<>();
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            if (s.getValue().equals(city)) {
                loginString.add(s.getKey());
            }
        }
        return loginString;
    }

    public static HashMap<String, Integer> amountWords(List<String> words) {
        HashMap<String, Integer> sameWords = new HashMap<>();
        for (String s : words) {
            if (sameWords.containsKey(s)) {
                sameWords.put(s, sameWords.get(s) + 1);
            } else sameWords.put(s, 1);
        }
        return sameWords;
    }

    public static HashMap<String, Customer> customerHashMap(int from, int to, HashMap<String, Customer> hashMap) {
        HashMap<String, Customer> stringCustomerHashMap = new HashMap<>();
        for (Map.Entry<String, Customer> s : hashMap.entrySet()) {
            if (s.getValue().getAge() >= from && s.getValue().getAge() < to) {
                stringCustomerHashMap.put(s.getKey(), s.getValue());
            }
        }
        return stringCustomerHashMap;
    }


    public static void frequencyWord(String word, String text) {
        String[] array = text.split(" ");
        String temp = "";
        for (int j = 0; j < array.length; j++) {
            if (word.equals(array[j])) {
                temp = array[j];
                break;
            }
        }
        if (!temp.equals(word)) {
            System.out.println("Такого слова в тексте нет");
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                int count = hashMap.get(array[i]);
                hashMap.put(array[i], count + 1);

            } else hashMap.put(array[i], 1);
        }
        int result = 0;
        for (Map.Entry<String, Integer> s : hashMap.entrySet()) {
            if (s.getKey().equals(temp)) {
                result = s.getValue();
            }
        }
        System.out.println("слово " + temp + "встречается в тексте с частотой: " + result);
    }

    //    public static void groupWord(String text) {
//        String[] array = text.split(" ");
//
//        HashMap<Integer, ArrayList<String>> listHashMap = new HashMap<>();
//
//    }
//
//    public static class lengthStr implements Comparator<String> {
//        @Override
//        public int compare(String o1, String o2) {
//            return o1.length() - o2.length();
//        }
//    }
//
//
    public static void topTenWords(String text) {
        String[] arr = text.split(" ");

        TreeMap<String, Integer> hashMap = new TreeMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count + 1);
            } else hashMap.put(arr[i], 1);
        }


        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new MapTask.sortValue());

        String[] array = new String[10];
        int index = 0;
        for (Map.Entry<String, Integer> s : list) {
            array[index] = s.getKey();
            index++;
            if (index == 10) break;
            System.out.println(s);
        }
        System.out.println("самые часто встречаемые слова: " + Arrays.toString(array));


    }

    //
    public static class sortValue implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return Integer.compare(o2.getValue(), o1.getValue());
        }
    }


}



