package modul_2.bagian_2;

public class MainLingkaran {
    public static void main(String[] args) {
        // 1. Membuat object dari class Lingkaran
        Lingkaran bundar = new Lingkaran();

        // 2. Mengisi nilai atribut jariJari
        bundar.jariJari = 10;

        // 3. Memanggil method hitungLuas() dan menampilkan hasilnya
        System.out.println("Jari-jari Lingkaran : " + bundar.jariJari);
        System.out.println("Luas Lingkaran      : " + bundar.hitungLuas());
    }
}