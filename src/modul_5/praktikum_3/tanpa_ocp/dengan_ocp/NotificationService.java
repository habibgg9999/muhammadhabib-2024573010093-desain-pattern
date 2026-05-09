package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class NotificationService {
    public void sendNotification(Notifier notifier, String message) {
        notifier.send(message);
    }
}