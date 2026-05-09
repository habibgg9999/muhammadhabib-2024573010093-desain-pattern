package modul_5.praktikum_1.tanpa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        // Menggunakan equalsIgnoreCase agar tidak error jika salah huruf besar/kecil
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing Credit Card payment of " + amount);
        } else if (paymentType.equalsIgnoreCase("EWallet")) {
            System.out.println("Processing E-Wallet payment of " + amount);
        } else {
            System.out.println("Invalid payment method");
        }
    }
}