package modul_2.bagian_5;

public class MainBarang {
    public static void main(String[] args) {
        // 1. Membuat object menggunakan Default Constructor
        Barang barang1 = new Barang();

        // 2. Membuat object menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop ProBook", 7500000);

        // Menampilkan hasil
        System.out.println("=== Daftar Barang ===");
        barang1.tampilkanBarang();
        barang2.tampilkanBarang();
    }
}