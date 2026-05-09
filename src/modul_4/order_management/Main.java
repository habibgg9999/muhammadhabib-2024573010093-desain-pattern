package modul_4.praktikum_3.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int qty = scanner.nextInt();

        System.out.print("Masukkan Harga per Unit: ");
        double price = scanner.nextDouble();

        // Objek tunggal yang melanggar SRP
        OrderManager order = new OrderManager(product, qty, price);

        order.saveOrder();
        order.printReceipt();

        scanner.close();
    }
}