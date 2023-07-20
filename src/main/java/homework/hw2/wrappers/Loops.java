package homework.hw2.wrappers;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите положительное целое число, таблицу умножения до 12 которого нужно выведена в коонсоль.  ");
//        printMultiplicationTable(scanner.nextInt());
//
//        System.out.println("Ведите чилсо фактариал которого нужно вычислить.");
//        numberFactorial(scanner.nextInt());
//
//        System.out.println(" Введите положительное целое число. ");
//        int num = scanner.nextInt();
//        System.out.println(" Введите степень в которую нобходимо возвести число. ");
//        exponentiationOfNum(num, scanner.nextInt());
//
//        System.out.println(" Введите положительное целое число для вычисления последовательности Фибоначчи. ");
//        fibonacciSequence(scanner.nextInt());
//
//        System.out.println();
//        System.out.println(" Введите положительное целое число для вычисления последовательности Фибоначчи. ");
//        fibonacciSequence2(scanner.nextInt());
    }

    /**
     * Напишите программу, которая предлагает пользователю ввести положительное целое число.
     * Затем он должен напечатать таблицу умножения этого числа.
     */
    public static void printMultiplicationTable(int num) {
        if (num <= 0) {
            System.out.println("Invalid int, expected value positive grated than 0.");
        } else {
            for (int j = 1; j <= 12; j++) {
                System.out.println(num + " * " + j + " = " + (num * j));
            }
        }
    }

    /**
     * Напишите программу для нахождения факториала любого числа, введенного с клавиатуры.
     */
    public static void numberFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        if (number == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        System.out.println("факториала " + number + " равен " + result);
    }

    /**
     * Два числа вводятся с клавиатуры. Напишите программу, которая находит значение одного числа,
     * возведенного в степень другого. (Не используйте встроенный метод Java)
     */
    public static void exponentiationOfNum(int num, int pow) {
        int result = 1;
        for (; pow > 0; pow--) {
            result = result * num;
        }
        System.out.println(result);
    }

    /**
     * Напишите программу для печати последовательности Фибоначчи из n членов, где n вводится пользователем
     */
    public static void fibonacciSequence(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void fibonacciSequence2(int n) {

        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                .limit(n)
                .map(y -> y[0])
                .forEach(x -> System.out.print(x + ", "));
    }
    /**
     * Напишите программу для печати следующего, высоту пирамиды задает пользователь
     */
}
