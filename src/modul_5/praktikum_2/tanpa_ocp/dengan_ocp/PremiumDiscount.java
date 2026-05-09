package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class PremiumDiscount implements Discount {

    @Override
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}
