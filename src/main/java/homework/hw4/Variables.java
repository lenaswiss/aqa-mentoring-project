package homework.hw4;

import java.util.ArrayList;

public class Variables {

    /**
     * 1. Написать программу которая обьявляет поля примитивных типов и основных ссылочных типов (Object, String, Integer, List)
     * без инициализации и выводит на печать значения этих полей
     */
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.printf(task1.toString());
    }
}

class Task1 {
    byte b;
    short s;
    int num;
    char ch;
    long l;
    float f;
    double d;
    boolean bool;

    String str;
    Object o;
    Integer integer;
    ArrayList list;

    @Override
    public String toString() {
        return "Task1{" +
                "b=" + b +
                ", s=" + s +
                ", num=" + num +
                ", ch as int =" + (int) ch +
                ", ch=" + ch +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", bool=" + bool +
                ", str='" + str + '\'' +
                ", o=" + o +
                ", integer=" + integer +
                ", list=" + list +
                '}';
    }
}
