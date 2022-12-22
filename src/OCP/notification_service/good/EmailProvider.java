package OCP.notification_service.good;

import OCP.notification_service.EmailThirdParty;
import OCP.notification_service.Notification;

public class EmailProvider implements NotificationProvider {
    private EmailThirdParty emailThirdParty;
    @Override
    public void send(Notification notification) {
        emailThirdParty.sendEmail();
    }
}
