package homework.hw2.wrappers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LoopsTask5 {

    public static void main(String[] args) {
        printRectangle(4);
        printTriangleLeft(5);
        printTriangleRight(5);
        printAsterisksTriangle(5);
        printNumbersTriangle(5);
        printNumbersTriangle2(5);
    }

    public static void printRectangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangleLeft(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangleRight(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printAsterisksTriangle(int height) {
        int counter = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= height + i; j++) {
                if (j == height || j >= height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            counter++;
        }
    }
    public static void printNumbersTriangle(int height) {
        int counter = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 1; j <= height + i; j++) {
                if (j == height || j >= height - i) {
                    System.out.print(counter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            counter++;
        }
    }

    public static void printNumbersTriangle2(int height) {
        for (int i = 0; i < height; i++) {
            int num = 1 + i;
            for (int j = 0; j < height * 2; j++) {
                if (j >= (height - i) && j <= (height + i)) {
                    System.out.print(num);
                    if (j < height) {
                        num--;
                    } else {
                        num++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
