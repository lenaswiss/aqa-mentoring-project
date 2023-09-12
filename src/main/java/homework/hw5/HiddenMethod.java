package homework.hw5;

public class HiddenMethod {
    /**
     * Привести пример программы в которой используются hidden методы
     */

    public static void hiddenTest() {
        System.out.println("Parent static method.");
    }
}

class Child extends HiddenMethod {

    public static void hiddenTest() {
        System.out.println("Child static method.");
    }

    public static void main(String[] args) {
        Child.hiddenTest();
        HiddenMethod.hiddenTest();
        hiddenTest();
    }
}
