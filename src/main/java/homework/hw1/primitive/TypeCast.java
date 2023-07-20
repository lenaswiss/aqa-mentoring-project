package homework.hw1.primitive;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TypeCast {
    /**
     * Написать класс в котором будут примеры приведения типов:
     * char->byte
     * float->char
     * float->char->int
     */
    public static void main(String[] args) {
        System.out.println(" Select option: 1 - to cast char->byte || 2 - to cast float->char  || 3 - to cast float->char->int || 4 - exit.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("Enter char to cast into byte.");
                    String str = scanner.nextLine();
                    if (!str.equals("")) {
                        char ch = str.charAt(0);
                        System.out.println(String.format("Char \'%s\' can be represented as \"%s\" byte. ", ch, (byte) ch));
                    }
                    System.out.println(" Select option: 1 - to cast char->byte || 2 - to cast float->char  || 3 - to cast float->char->int || 4 - exit.");
                }
                case "2" -> {
                    System.out.println("Enter float to cast into char.");
                    String str = scanner.nextLine();
                    if (!checkIfCanBeCastToFloat(str)) {
                        System.out.println(String.format("ERROR TYPE: Entered value \'%s\' can not be cast to float type. Expected: contains decimal point and digits. ", str));
                    } else {
                        System.out.println(String.format("Float \"%s\" equal to \"%s\" char.", str, getCharFromFloat(str)));
                    }
                    System.out.println(" Select option: 1 - to cast char->byte || 2 - to cast float->char  || 3 - to cast float->char->int || 4 - exit.");
                }
                case "3" -> {
                    System.out.println("Enter float to get its char and int value presentation.");
                    String str = scanner.nextLine();
                    if (!checkIfCanBeCastToFloat(str)) {
                        System.out.println((String.format("ERROR TYPE: Entered value \'%s\' can not be cast to float type. Expected: contains decimal point and digits. ", str)));
                    } else {
                        System.out.println(String.format("Float \"%s\" equal to \"%s\" char.", str, getCharFromFloat(str)));
                        System.out.println(String.format("Float \"%s\" equal to \"%s\" int.", str, getIntFromFloat(str)));
                    }
                    System.out.println(" Select option: 1 - to cast char->byte || 2 - to cast float->char  || 3 - to cast float->char->int || 4 - exit.");
                }
                case "4" -> {
                    return;
                }
            }
        }
    }

    private static int getIntFromFloat(String str) {
        float f = Float.valueOf(str);
        int i = (int) f;
        return i;
    }

    private static boolean checkIfCanBeCastToFloat(String str) {
        boolean isFloat = false;
        if (str.contains(".")) {
            String[] array = str.split(Pattern.quote("."));
            if ((array.length == 2) && (array[0].matches("^\\d+$") && array[1].matches("^\\d+$"))) {
                isFloat = true;
            }
        }
        return isFloat;
    }

    private static char getCharFromFloat(String str) {
        float f = Float.valueOf(str);
        int i = (int) f;
        return (char) i;
    }

    private static byte getByteValue(String str) {
        char[] array = str.toCharArray();
        byte i = (byte) array[0];
        return i;
    }
}
