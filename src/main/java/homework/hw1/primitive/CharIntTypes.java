package homework.hw1.primitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIntTypes {

    public static void main(String[] args) throws IOException {
        System.out.println(" Select option: 1 - to get int of char || 2 - to get char from int  || STOP - to stop the program");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            switch (reader.readLine().toLowerCase()) {
                case "1" -> {
                    System.out.println(" Enter the symbol to get its int representation.");
                    String st = reader.readLine();
                    if (!st.equals("")) {
                        char firstChar = st.charAt(0);
                        if (charIsDigit(firstChar)) {
                            System.out.println(String.format("The number \'%s\' has \"%s\" int value of char.", firstChar, (int) firstChar));
                        } else if (charIsUpperCaseLetter(firstChar)) {
                            System.out.println(String.format("The letter \'%s\' in upper case  has \"%s\" int value of char.", firstChar, (int) firstChar));
                        } else if (charIsLowerCaseLetter(firstChar)) {
                            System.out.println(String.format("The letter \'%s\' in lower case  has \"%s\" int value of char.", firstChar, (int) firstChar));
                        } else {
                            System.out.println(String.format("The symbol \"%s\"  has \"%s\" int value of char.", firstChar, (int) firstChar));
                        }
                        System.out.println("Exception: empty line was entered. ");
                        System.out.println(" Select option: INT - to get int of char || CHAR - to get char from int  || STOP - to stop the program");
                    }
                }
                case "2" -> {
                    System.out.println(" Enter digit to get its char representation.");
                    String st = reader.readLine();
                    if (st.matches("^\\d+$")) {
                        System.out.println(String.format("The digit \"%s\" can be represented as char \"%s\". ", st, getCharFromInt(st)));
                    } else {
                        System.out.println("Exception: only digit can be replaced.");
                    }
                    System.out.println(" Select option: INT - to get int of char || CHAR - to get char from int  || STOP - to stop the program");
                }
                case "exit" -> {
                    return;
                }
            }
        }
    }

    private static boolean charIsDigit(char ch) {
        boolean flag = (ch >= '0' && ch <= '9') ? true : false;
        return flag;
    }

    private static boolean charIsUpperCaseLetter(char ch) {
        boolean flag = (ch >= 'A' && ch <= 'Z') ? true : false;
        return flag;
    }

    private static boolean charIsLowerCaseLetter(char ch) {
        boolean flag = (ch >= 'a' && ch <= 'z') ? true : false;
        return flag;
    }

    private static char getCharFromInt(String str) {
        char c = (char) Integer.parseInt(str);
        return c;
    }
}