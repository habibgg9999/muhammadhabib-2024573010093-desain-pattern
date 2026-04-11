package modul_3.bagian_2;

public class MainMotor {
    public static void main(String[] args) {
        // Membuat objek motor
        Motor motorSaya = new Motor();

        // Mengisi nilai menggunakan Setter
        motorSaya.setMerk("Honda Vario");
        motorSaya.setTahun(2023);

        // Menampilkan nilai menggunakan Getter
        System.out.println("=== Detail Motor ===");
        System.out.println("Merk  : " + motorSaya.getMerk());
        System.out.println("Tahun : " + motorSaya.getTahun());
    }
}