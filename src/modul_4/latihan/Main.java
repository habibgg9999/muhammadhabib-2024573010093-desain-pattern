package modul_4.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Produk: ");
        String product = scanner.nextLine();
        System.out.print("Jumlah: ");
        int qty = scanner.nextInt();
        System.out.print("Harga: ");
        double price = scanner.nextDouble();

        // 1. Buat Objek Data
        Order order = new Order(product, qty, price);

        // 2. Simpan Data (Persistence)
        OrderRepository repo = new OrderRepository();
        repo.saveToFile(order);

        // 3. Tampilkan Data (View)
        OrderViewer viewer = new OrderViewer();
        viewer.printReceipt(order);

        scanner.close();
    }
}