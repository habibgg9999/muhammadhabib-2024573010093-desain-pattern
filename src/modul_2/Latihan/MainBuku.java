package modul_2.bagian_1;

public class MainBuku {
    public static void main(String[] args) {
        // 1. Membuat object dari class Buku
        Buku buku1 = new Buku();

        // 2. Mengisi nilai atribut
        buku1.judul = "Laskar Pelangi";
        buku1.pengarang = "Andrea Hirata";

        // 3. Menampilkan nilai atribut
        System.out.println("Judul Buku     : " + buku1.judul);
        System.out.println("Pengarang Buku : " + buku1.pengarang);
    }
}