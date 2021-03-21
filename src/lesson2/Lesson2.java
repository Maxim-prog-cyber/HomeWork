package lesson2;

import java.util.Scanner;

/*
1. Задача на if
Дана целочисленная переменная count - количество верных ответов.
В зависимости от значения этой переменной вывести в консоль оценку:
100 - 90 правильных ответов - отлично
89 - 60 правильных ответов - хорошо
59 - 40 правильных ответов - удовлетворительно
39 - 0 правильных ответов - попробуйте в следующий раз

2. Задача на switch
Пользователь вводит 3 числа:
1е - первый операнд
2e - второй операнд
3е - оператор
В зависимости от третьего введенного числа нужно вывести в консоль:
сумму, разность, умножение, деления чисел, которые ввел пользователь.
Если 3е введенное число 3, нужно найти сумму,
если 5 - разность,
если 7 - результат умножения,
если 9 - результат деления.

3. Задача на цикл while
Считать с консоли количество тарелок и количество моющего средства
Моющее средство расходуется из расчета 0.5 на 1 тарелку
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
В конце вывести сколько тарелок осталось, когда моющее средство закончилось или
наоборот.

4. Программа загадывает число в диапазоне [1;9]
Пользователь вводит число с клавиатуры
Программа в зависимости от введенного числа выводит в консоль следующее:
"загаданное число больше"
"загаданное число меньше"
"Вы угадали" (программа завершает работу)
если введен 0, выводит "выход из программы" (программа завершает работу)

5. Задача на Math.random() и if
Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
в интервал (25;200) и выводить результат в консоль.
Примеры работы программы:
Число 345 не содержится в интервале (25;200)
Число 110 содержится в интервале (25;200)

6. Пользователь!!! загадывает число в диапазоне от [1 до 100]
Программа пытается его угадать (используйте метод !!!бинарного поиска - деление отрезка на 2).
Программа может задавать пользователю вопросы:
Число равно ...? / Число больше ...? / Число меньше ...?
и в зависимости от ответа пользователя принимать решения.
!!! Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
 */
public class Lesson2 {
    public static void main(String[] args) {
        guessValue();
    }

    public static void taskIf(int count) {
        if (count <= 100 && count >= 90) System.out.println("отлично");
        if (count <= 89 && count >= 60) System.out.println("хорошо");
        if (count <= 59 && count >= 40) System.out.println("удовлетворительно");
        if (count <= 39 && count >= 0) System.out.println("попробуйте в следующий раз");
    }

    public static void taskSwitch() {
        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        switch (c) {
            case 3:
                System.out.println(a + b);
                break;
            case 5:
                System.out.println(a - b);
                break;
            case 7:
                System.out.println(a * b);
                break;
            case 9:
                System.out.println(a / b);
                break;
            default:
                System.out.println("введен неправльный оператор");
        }
    }

    public static void taskWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во моющего средства: ");
        double cleaner = scanner.nextDouble();

        System.out.print("Введите кол-во тарелок: ");
        int dish = scanner.nextInt();

        while (cleaner > 0 && dish > 0) {
            dish--;
            cleaner = cleaner - 0.5;

            System.out.print(" Осталось средства: ");
            System.out.println(cleaner);
        }
        System.out.print("Осталось непомытых тарелок: ");
        System.out.println(dish);
    }

    public static void taskFour() {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * (9 - 1) + 1);
        while (true) {
            int n = scanner.nextInt();
            if (number > n) System.out.println("Загаданное число больше");
            if (number < n) System.out.println("Загаданное чилосло меньше");
            else if (n == number) {
                System.out.println("Winner");
                break;
            } else {
                System.out.println("bye");
                break;
            }
        }
    }

    public static void randomIf() {
        int random = (int) (Math.random() * (500 - 10) + 10);
        if (random >= 25 && random <= 100) System.out.print("Число содержится в интервале (25;200): ");
        else System.out.print("Число не содержится в интервале (25;200): ");
        System.out.println(random);
    }

    public static void guessValue() {
        Scanner scanner = new Scanner(System.in);
        int guessValue = 50;
        int interval = 50;
        while (true) {
            System.out.println(guessValue + " правильное число ?");
            String result = scanner.nextLine();
            if (result.equals("Yes")) {
                System.out.println("Win");
                break;
            } else {
                System.out.println("Является ли число " + guessValue + " меньше загаданного?");
                result = scanner.nextLine();
                interval = interval / 2;
                if (interval == 0) interval = 1;
                if (result.equals("No")) guessValue = guessValue - interval;
                else guessValue = guessValue + interval;
            }
        }
    }
}