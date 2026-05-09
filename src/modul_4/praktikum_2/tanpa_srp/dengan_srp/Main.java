package modul_4.praktikum_2.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();

        // 1. Inisialisasi Data (Entity)
        User user = new User(name, email);

        // 2. Simpan Data (Persistence)
        UserRepository repository = new UserRepository();
        repository.save(user);

        // 3. Kirim Notifikasi (Service)
        EmailService emailService = new EmailService();
        emailService.sendWelcomeEmail(user);

        scanner.close();
    }
}