package modul_5.praktikum_1.tanpa_ocp.dengan_ocp;

/**
 * Class ini adalah implementasi dari interface PaymentMethod.
 * Dibuat khusus untuk menangani logika pembayaran Kartu Kredit.
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }
}