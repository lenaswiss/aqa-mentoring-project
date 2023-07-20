package homework.hw2.wrappers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LoopsTask5 {

    public static void main(String[] args) {
//        printRectangle(4);
//        printTriangleLeft(5);
//        printTriangleRight(5);
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
        int counter = 1;
        for (int i = 0; i < height; i++) {

            for (int j = 1; j <= height; j++) {
                if (j >= height - i) {
                    int temp = counter;
                    for (int k = height; k <= height; k++) {
                        System.out.print(temp);
                        temp--;
                    }
                    for (int k = height; k <= height; k++) {
                        System.out.print(temp);
                        temp++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            counter++;
        }
    }

    public int[] makeMiddle(int[] nums) {
        int[] array = new int[] {nums[nums.length/2], nums[nums.length/2+1]};
        return array;
    }
}
