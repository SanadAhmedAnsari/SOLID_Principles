package OCP.notification_service.good;

import OCP.notification_service.Notification;
import lombok.NonNull;

public class NotificationService {
    private NotificationProviderFactory notificationProviderFactory;

    public void sendNotification(@NonNull final Notification notification) {
        notificationProviderFactory.getNotificationProvider(notification.getNotificationType()).send(notification);
    }
}
