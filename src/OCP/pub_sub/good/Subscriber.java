package OCP.pub_sub.good;

import OCP.pub_sub.Event;

public interface Subscriber {
    void handleEvent(Event event);
}
