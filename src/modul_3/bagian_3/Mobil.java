package modul_3.bagian_3;

// Mobil adalah subclass dari Kendaraan
public class Mobil extends Kendaraan {
    int jumlahPintu;

    void displayMobil() {
        // Method displayInfo() dipanggil dari class induk
        displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}