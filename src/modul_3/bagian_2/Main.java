package modul_3.bagian_2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi nilai atribut melalui SETTER
        mhs1.setNama("Budi");
        mhs1.setUmur(20);

        // Menampilkan nilai atribut melalui GETTER
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
    }
}