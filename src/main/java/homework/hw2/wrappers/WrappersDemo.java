package homework.hw2.wrappers;

public class WrappersDemo {
    /**
     * Напишите программу которая демонстрирует автоматическую упаковку примитивных типов
     * Автоупаковка применяется компилятором  Java в следующих условиях:
     * 1. Когда значение примитивного типа передается в метод в качестве параметра метода,
     * который ожидает объект соответствующего класса-оболочки.
     * 2. Когда значение примитивного типа присваивается переменной,
     * соответствующего класса оболочки.
     *
     */

    static void methodWide(int i) {
        System.out.println("int");
    }

    static void methodWide( Integer i ) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        short shVal = 25; //short will be automatically cast to int type
        methodWide(shVal);;
    }

    class AutoboxingCheck{

    }

}
