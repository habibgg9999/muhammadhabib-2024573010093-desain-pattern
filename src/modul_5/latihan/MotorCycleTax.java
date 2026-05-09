package modul_5.latihan;

public class MotorCycleTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.05; // Pajak 5%
    }
}
