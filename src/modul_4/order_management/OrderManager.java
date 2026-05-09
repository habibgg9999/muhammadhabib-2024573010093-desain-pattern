package modul_4.praktikum_3.tanpa_srp;

import java.io.FileWriter;
import java.io.IOException;

public class OrderManager {
    private String product;
    private int quantity;
    private double price;

    public OrderManager(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // Menghitung total harga
    public double calculateTotal() {
        return quantity * price;
    }

    // Menyimpan pesanan ke file (Seharusnya tugas kelas lain)
    public void saveOrder() {
        // Nama file "orders.txt", 'true' artinya data ditambahkan (append)
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(product + " - " + quantity + " - Rp" + calculateTotal() + "\n");
            System.out.println("Pesanan telah disimpan!");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
        }
    }

    // Menampilkan struk pesanan (Seharusnya tugas kelas lain)
    public void printReceipt() {
        System.out.println("\n📜 Struk Pesanan:");
        System.out.println("Produk: " + product);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Total Harga: Rp" + calculateTotal());
        System.out.println("================================");
    }
}