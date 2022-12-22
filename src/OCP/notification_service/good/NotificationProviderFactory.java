package OCP.notification_service.good;

import OCP.notification_service.NotificationType;
import lombok.NonNull;

import java.util.Map;

public class NotificationProviderFactory {
    Map<NotificationType, NotificationProvider> providers;

    public NotificationProvider getNotificationProvider(@NonNull final NotificationType notificationType) {
        return providers.get(notificationType);
    }
}
