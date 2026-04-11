package modul_3.bagian_1;

public class Buku {
    // Atribut
    String judul;
    String penulis;
    int tahunTerbit;

    // Metode untuk menampilkan informasi
    void tampilkanInfo() {
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Penulis       : " + penulis);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
    }
}