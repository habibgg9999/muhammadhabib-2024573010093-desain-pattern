package latihan;

public class Variable {
    public static void main(String[] args) {
        // Deklarasi variabel
        String namaLengkap = "Nama Lengkap Anda";
        String tempatLahir = "Kota Anda";
        String tanggalLahir = "01 Januari 2000";
        char golonganDarah = 'O';
        int umur = 20;
        double tinggiBadan = 170.5;
        String jenisKelamin = "Laki-laki";
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        // Menampilkan data ke layar
        System.out.println("=== DATA DIRI ===");
        System.out.println("Nama Lengkap    : " + namaLengkap);
        System.out.println("Tempat Lahir    : " + tempatLahir);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("Golongan Darah  : " + golonganDarah);
        System.out.println("Umur            : " + umur + " Tahun");
        System.out.println("Tinggi Badan    : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Agama           : " + agama);
        System.out.println("Pekerjaan       : " + pekerjaan);
    }
}