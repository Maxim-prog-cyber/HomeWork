package lesson4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson4 {
    public static void main(String[] args) {
        task1();


    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        System.out.println(Arrays.toString(array));
        int size = 0;
        int index = 0;
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println(Arrays.toString(array));
                break;
            }
            for (String element : array) {
                if (str.equals(element)) {
                    System.out.println("Tакой элемент уже есть");
                    index--;
                    size--;
                    break;
                }
            }
            array[index] = str;
            index++;
            size++;
            System.out.println(Arrays.toString(array));
            if (array.length == size) {
                System.out.println("Массив переполнен,пока");
                break;
            }
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(str1);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("строка " + "'" + str + "'" + " встречается в строке " + "'" + str1 + "'" + " " + count + "раза");
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String str1 = sb.reverse().toString();
        if (str.equals(str1)){
            System.out.println("Cтрока является полиндромом");
        }
        else System.out.println("Строка не явялется полиндромом");

    }

    public static void task4() {
        String str = "HeLLO";
        String str1 = str.substring(1).toLowerCase();
        String str2 = str.substring(0,1).toUpperCase().concat(str1);
        System.out.println(str2);
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrays = new String[n];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arrays));

        String b = "a";
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].startsWith(b)){
                count++;
            }
        }
        System.out.println(count + " слова начинаются на букву " + b);
    }

}
