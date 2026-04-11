package modul_2.bagian_3;

public class AkunBank {
    // Atribut saldo diset private agar terlindungi
    private double saldo = 500000;

    // Method public agar bisa dipanggil dari luar class
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp " + saldo);
    }
}