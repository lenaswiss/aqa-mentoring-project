package homework.hw5;

import java.util.Locale;

public class OverloadVararg {

    /**
     * Написать программу в которой показан пример перезагрузки методов с vararg (минимум 3 метода).
     * В методах помимо vararg должны присутствовать другие переменные метода и меняться их количество
     */
    public static void main(String[] args) {
        OverloadVararg o = new OverloadVararg();
        o.printVarargString("Test", "Test2", "str");
        o.printVarargString('l', "Test", "Test2", "str");
        o.printVarargString("#", Integer.valueOf(112), Boolean.valueOf(3>5), "str");
    }

    public void printVarargString(String... values) {
        for (String v : values)
            System.out.print(v + ", ");
    }

    public void printVarargString(char c, String... values) {
        switch (c) {
            case 'u':
                for (String v : values)
                    System.out.print(v.toUpperCase() + ", ");
                break;
            case 'l':
                for (String v : values)
                    System.out.print(v.toLowerCase() + ", ");
                break;
            default:
                System.out.print("Incorrect case.");
        }
        System.out.println();
    }

    public void printVarargString(String prefix, Object... values) {
        for (Object v : values)
            System.out.print(prefix + v.toString() + ", ");
    }
}
