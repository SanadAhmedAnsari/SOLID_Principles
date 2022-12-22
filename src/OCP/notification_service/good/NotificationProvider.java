package OCP.notification_service.good;

import OCP.notification_service.Notification;

public interface NotificationProvider {
    void send(Notification notification);
}
