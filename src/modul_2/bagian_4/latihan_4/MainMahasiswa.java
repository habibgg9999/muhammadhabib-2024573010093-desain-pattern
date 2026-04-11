package modul_2.bagian_4;

public class MainMahasiswa {
    public static void main(String[] args) {
        // 1. Membuat object dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // 2. Menggunakan Setter untuk mengisi nilai atribut
        mhs.setNama("Muhammad Habib");
        mhs.setNim("2024573010093");

        // 3. Menampilkan nilai menggunakan Getter
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM  : " + mhs.getNim());
    }
}