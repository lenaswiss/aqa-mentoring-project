package education.decorator;

public class MessengerNotification implements Notification{

    private Notification notification;

    public MessengerNotification(){}

    public MessengerNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if(notification != null) notification.send();
        System.out.println("Отправка сообщения в приложение.");
    }
}
