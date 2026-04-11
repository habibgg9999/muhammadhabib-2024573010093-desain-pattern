package modul_2.bagian_5;

public class Barang {
    String namaBarang;
    int harga;

    // Default Constructor
    public Barang() {
        namaBarang = "Barang Baru";
        harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan detail barang
    public void tampilkanBarang() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("---------------------------");
    }
}