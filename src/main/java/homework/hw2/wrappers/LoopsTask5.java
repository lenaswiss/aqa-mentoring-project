package homework.hw2.wrappers;

public class LoopsTask5 {

    public static void main(String[] args) {
//        printRectangle(4);
//        printTriangleLeft(5);
//        printTriangleRight(5);
        
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
}
