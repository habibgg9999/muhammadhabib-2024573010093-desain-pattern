package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // Membuat objek strategi diskon
        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();

        // Menghitung diskon untuk Regular
        System.out.println("Regular Customer Discount: " +
                calculator.calculateDiscount(regular, 100));

        // Menghitung diskon untuk Premium
        System.out.println("Premium Customer Discount: " +
                calculator.calculateDiscount(premium, 100));
    }
}