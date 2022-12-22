package OCP.pub_sub.good;

import OCP.pub_sub.Event;
import lombok.NonNull;

import java.util.List;

public class EventHandler {

    private List<Subscriber> subscribers;

    public void handleEvent(@NonNull final Event event) {
        for(Subscriber subscriber : subscribers) {
            subscriber.handleEvent(event);
        }
    }

    public void registerSubscriber(@NonNull final Subscriber subscriber){
        subscribers.add(subscriber);
    }


    public void unRegisterSubscriber(@NonNull final Subscriber subscriber){
        subscribers.remove(subscriber);
    }
}
