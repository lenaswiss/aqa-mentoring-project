package homework.hw4;

public class Task2 {

    /**
     * 2. Написать программу которая демонстрирует затемнение полей. Иерархия классов должна состоять минимум из трех
     * классов. Программа выводи на печать из дочернего класса затемняющего и все затемненные поля родителей
     */
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.printName();

    }

}

class ParentClass {

    String name = "ParentClass";

    public void printName() {
        System.out.println(name);
    }
}

class FirstClass extends ParentClass {

    String name = "FirstClass";

    @Override
    public void printName() {
        System.out.println(name);
        super.printName();

    }
}

class SecondClass extends FirstClass {
    String name = "SecondClass";

    @Override
    public void printName() {
        System.out.println(name);
        super.printName();

    }
}
