package modul_3.bagian_3;

public class Main {
    public static void main(String[] args) {
        Mobil myMobil = new Mobil();

        // Mengisi atribut (merk dan tahun diwarisi dari Kendaraan)
        myMobil.merk = "Toyota";
        myMobil.tahun = 2024;
        myMobil.jumlahPintu = 4;

        // Menampilkan informasi
        System.out.println("=== Informasi Kendaraan ===");
        myMobil.displayMobil();
    }
}