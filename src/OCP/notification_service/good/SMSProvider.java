package OCP.notification_service.good;

import OCP.notification_service.Notification;
import OCP.notification_service.SMSThirdParty;

public class SMSProvider implements NotificationProvider{

    private SMSThirdParty smsThirdParty;
    @Override
    public void send(Notification notification) {
        smsThirdParty.sendSMS();
    }
}
