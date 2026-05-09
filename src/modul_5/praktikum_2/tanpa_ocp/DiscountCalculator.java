package modul_5.praktikum_2.tanpa_ocp;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.1; // Diskon 10%
        } else if (customerType.equals("Premium")) {
            return price * 0.2; // Diskon 20%
        } else {
            return 0;
        }
    }
}