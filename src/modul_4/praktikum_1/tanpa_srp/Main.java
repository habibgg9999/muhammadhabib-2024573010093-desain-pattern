package modul_4.praktikum_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        // Menyimpan ke file dengan ekstensi .txt secara otomatis
        reportManager.saveToFile(reportFileName + ".txt");

        // Mencetak ke console
        reportManager.printReport();

        scanner.close(); // Praktik baik untuk menutup scanner
    }
}
