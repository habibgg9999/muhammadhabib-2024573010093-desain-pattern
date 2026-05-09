package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class DiscountCalculator {
    public double calculateDiscount(Discount discountStrategy, double price) {
        return discountStrategy.applyDiscount(price);
    }
}
