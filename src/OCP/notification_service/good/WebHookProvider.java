package OCP.notification_service.good;

import OCP.notification_service.Notification;
import OCP.notification_service.WebHookThirdParty;

public class WebHookProvider implements NotificationProvider{

    private WebHookThirdParty webHookThirdParty;
    @Override
    public void send(Notification notification) {
        webHookThirdParty.sendWebHook();
    }
}
