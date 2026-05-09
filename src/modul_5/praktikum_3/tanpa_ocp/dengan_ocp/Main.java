package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Membuat objek notifier sebagai implementasi dari interface Notifier
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        // Mengirim notifikasi menggunakan objek yang berbeda
        service.sendNotification(emailNotifier, "Hello via Email!");
        service.sendNotification(smsNotifier, "Hello via SMS!");
    }
}