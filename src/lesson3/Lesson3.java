package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        guessArray();

    }

    public static void replaceElement() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 497) + 3);
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        System.out.println("Массив до перестановки ");
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {

            if (array[j] == max) array[j] = min;
            else if (array[j] == min) array[j] = max;
        }
        System.out.println("Массив после перестановки");
        System.out.println(Arrays.toString(array));
    }

    public static void cortArray() {
        int[] arr = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        } // сортировка пузырьковым методом


        int countUneven = 0;
        int countEven = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) countEven++;
            if (arr[j] % 2 != 0) countUneven++;
        }
        System.out.println(countUneven);
        System.out.println(countEven);

        int[] arrE = new int[countEven];
        int[] arrUnE = new int[countUneven];

        int index1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) continue;
            if (arr[j] % 2 == 0) arrE[index1] = arr[j];
            index1++;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) continue;
            if (arr[i] % 2 != 0) arrUnE[index] = arr[i];
            index++;

        }


        System.out.println("Исходны массив " + Arrays.toString(arr));
        System.out.println("Массив нечетных числе:" + Arrays.toString(arrUnE));
        System.out.println("Массив четных числе:" + Arrays.toString(arrE));
    }

    public static void negativeArray() {
        int[] array = {-321, 894, -45, 782, -29, 12, -88};
        int counterNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) counterNegative++;
        }
        int[] arrayNegative = new int[counterNegative];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) continue;
            if (array[i] < 0) arrayNegative[index] = array[i];
            index++;
        }
        System.out.println(Arrays.toString(arrayNegative));

    }

    public static void unevenArray() {
        int[] array = new int[10];

        int index = 0;
        for (int i = 1; i < 22; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

    public static void guessArray() {
        double[] array = new double[11];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {  // не понял ка кзадать интервал [-1;1]
            array[i] = random.nextDouble();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

        }
    }
}

