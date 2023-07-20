package homework.hw2.wrappers;

import java.time.Duration;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number.");
        getYearsAndDays(scanner.nextLong());

        System.out.println();
        System.out.println("Input the time zone offset to GMT: ");
        printGMTCurrentTime(scanner.nextInt());

        System.out.println();
        System.out.println("Input first int: ");
        int firstInt = scanner.nextInt();
        System.out.println("Input second int: ");
        int secondInt = scanner.nextInt();
        compareInts(firstInt, secondInt);
    }

    /**
     * 1**.Write a Java program to convert minutes into a number of years and days.
     */
    public static void getYearsAndDays(Long minutes) {

        int years = (int) (minutes / (60 * 24) / 365);
        int days = (int) (minutes / (60 * 24) % 365);
        System.out.printf("%s  minutes is approximately %s years and %s days", minutes, years, days);
    }

    /**
     * 2. Write a Java program that prints the current time in GMT.
     * Для получения текущего времени в мс необходимо использовать `System.*currentTimeMillis()*`
     */
    public static void printGMTCurrentTime(int offsetToGMT) {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = currentTimeMillis / 1000;
        long currentSeconds = seconds % 60;
        long minutes = seconds / 60;
        long currentMinutes = minutes % 60;
        long hours = minutes / 60;
        long currentHours = ((hours + offsetToGMT) % 24);

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }

    /**
     * 3**.Write a Java program that accepts two integers from the user and then prints
     * the sum,
     * the difference,
     * the product,
     * the average,
     * the distance (the difference between integer),
     * the maximum (the larger of the two integers),
     * the minimum (smaller of the two integers).
     */

    public static void compareInts(int firstInt, int secondInt) {
        int sum = firstInt + secondInt;
        int diff = firstInt - secondInt;
        int product = firstInt * secondInt;
        float avg = sum / 2;
        int distance = (firstInt > secondInt) ? firstInt - secondInt : (firstInt - secondInt) * -1;
        int max = (firstInt > secondInt) ? firstInt : secondInt;
        int min = (firstInt < secondInt) ? firstInt : secondInt;
        System.out.println(
                "Sum of two integers: " + sum + " \n"
                        + "Difference of two integers: " + diff + " \n"
                        + "Product of two integers: " + product + " \n"
                        + "Average of two integers: " + avg + " \n"
                        + "Distance of two integers: " + distance + "\n"
                        + "Max integer: " + max + "\n"
                        + "Min integer: " + min + "\n"
        );
    }
}
