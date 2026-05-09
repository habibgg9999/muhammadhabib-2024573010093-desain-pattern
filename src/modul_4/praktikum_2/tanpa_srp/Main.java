package modul_4.praktikum_2.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();

        // Membuat satu objek yang melakukan segalanya
        UserManager user = new UserManager(name, email);

        user.saveToDatabase();
        user.sendWelcomeEmail();

        scanner.close();
    }
}