package education.decorator;

public class Main {
    /**
     *Декоратор - позволяет динамично добавлять объектам
     * новую функциональность, оборачивая их в полезные "обертки"
     */

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification(emailNotification);
        Notification messengerNotification = new MessengerNotification(smsNotification);
        sendNotification(messengerNotification);
    }

    private static void sendNotification(Notification notification){
        notification.send();
    }
    /*Класс-декоратор должен быть того же типа, что и декорируемый классб
    реализовывать тот же интерфейс или наследовать тот же базовый классю */

    /* Декоратор реализует поведение исходного класса; при этом не изменяя его,
    а добавляя свое до или после вызова базового поведения. */

    /* Это достигается за счет того, что декоратор содержит в себе объект базового класса
     и вызывает его методы там, где требуеться доболнительное поведение. */
}
