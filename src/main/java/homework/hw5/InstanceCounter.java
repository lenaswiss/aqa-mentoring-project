package homework.hw5;

public class InstanceCounter {

    /**
     * Написать класс который каждый раз при создании его обькта выводит в командную
     * строку сколько его обьектов уже было создано
     */
    private static int counter ;

    public InstanceCounter() {
        counter++;
        System.out.println("The " + counter + " instance of the InstanceCounter class is created.");
    }

    public static void main(String[] args) {
        InstanceCounter i1 = new InstanceCounter();
        InstanceCounter i2 = new InstanceCounter();
        InstanceCounter i3 = new InstanceCounter();
    }
}


