package modul_2.bagian_3;

public class MainAkun {
    public static void main(String[] args) {
        AkunBank tabunganku = new AkunBank();

        // 1. Memanggil method public (Berhasil)
        tabunganku.tampilkanSaldo();

        // 2. Mencoba akses atribut private langsung (Akan Error)
        // System.out.println(tabunganku.saldo);
    }
}