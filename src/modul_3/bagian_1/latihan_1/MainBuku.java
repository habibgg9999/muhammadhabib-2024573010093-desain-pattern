package modul_3.bagian_1;

public class MainBuku {
    public static void main(String[] args) {
        // Membuat objek dari class Buku
        Buku bukuSaya = new Buku();

        // Mengisi nilai atribut
        bukuSaya.judul = "Laskar Pelangi";
        bukuSaya.penulis = "Andrea Hirata";
        bukuSaya.tahunTerbit = 2005;

        // Menampilkan informasi buku
        System.out.println("=== Informasi Buku ===");
        bukuSaya.tampilkanInfo();
    }
}