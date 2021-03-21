package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(ternary(5, 4));
    }

    public static long ternary(long start, long end) {
        return (start < end) ? end = start : -1;

    }

    public static int sumTwoValue(int number) {
        int firstPart = number % 10;
        int secondPart = number / 10;
        return firstPart + secondPart;
    }

    public static int sumThirdValue(int num) {
        int first = num / 100;
        int s = num % 100;
        int second = s / 10;
        int third = s % 10;
        return first + second + third;
    }
}
