package OCP.notification_service.bad;

import OCP.notification_service.EmailThirdParty;
import OCP.notification_service.Notification;
import OCP.notification_service.NotificationType;
import OCP.notification_service.SMSThirdParty;
import lombok.NonNull;

public class NotificationService {
    private SMSThirdParty smsThirdParty;
    private EmailThirdParty emailThirdParty;

    public void SendNotification(@NonNull final Notification notification) {
        if(notification.getNotificationType() == NotificationType.SMS){
            smsThirdParty.sendSMS();
        } else if( notification.getNotificationType() == NotificationType.EMAIL) {
            emailThirdParty.sendEmail();
        }
    }
}
