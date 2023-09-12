package education.rxjava;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();

        clients.add(new Client("Tomas Tj", 3, true));
        clients.add(new Client("Jams D've", 3, false));
        clients.add(new Client("Olive Fox", 4, false));
        clients.add(new Client("Allan Po", 2, true));
        clients.add(new Client("Tmx Os", 5, true));

        clients.stream()
                .filter(Client::isActive)
                .map(Client::getName)
                .forEach(System.out::println);

        System.out.println("*****  End.  *****");

        Flowable<Client> flowable = Flowable.create(new FlowableOnSubscribe<Client>() {
            @Override
            public void subscribe(FlowableEmitter<Client> flowableEmitter) throws Exception {
                for (Client c : clients) {
                    flowableEmitter.onNext(c);
                }
                flowableEmitter.onComplete();
            }
        }, BackpressureStrategy.BUFFER);

        flowable
                .filter(Client :: isActive)
                .map(Client::getName)
                .forEach(System.out::println);

        System.out.println("*****  SECOND END.  *****");
    }
}
