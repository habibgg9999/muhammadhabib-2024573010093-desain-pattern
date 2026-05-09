package modul_4.praktikum_1.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        // Menggunakan ReportGenerator untuk mengolah teks
        ReportGenerator report = new ReportGenerator(reportText);
        String reportContent = report.generateReport();

        // Menggunakan ReportSaver untuk menyimpan ke file
        ReportSaver saver = new ReportSaver();
        saver.saveToFile(reportFileName + ".txt", reportContent);

        // Menggunakan ReportPrinter untuk mencetak ke console
        ReportPrinter printer = new ReportPrinter();
        printer.printReport(reportContent);

        scanner.close();
    }
}