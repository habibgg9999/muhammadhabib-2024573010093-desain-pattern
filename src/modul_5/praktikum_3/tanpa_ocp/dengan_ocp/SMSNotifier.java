package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
