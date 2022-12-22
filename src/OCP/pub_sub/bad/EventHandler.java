package OCP.pub_sub.bad;

import OCP.pub_sub.Event;
import lombok.NonNull;

public class EventHandler {
    private AnalyticalSubscriber analyticalSubscriber;
    private LogsSubscriber logsSubscriber;

    public void handleEvent(@NonNull Event event){
        analyticalSubscriber.analyseEvent(event);
        logsSubscriber.logEvent(event);
        //NotificationSubscriber.sendNotification(event);
    }
}
