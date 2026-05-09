package modul_4.latihan;

public class OrderViewer {
    public void printReceipt(Order order) {
        System.out.println("\n📜 STRUK PESANAN (LATIHAN)");
        System.out.println("Produk      : " + order.getProduct());
        System.out.println("Jumlah      : " + order.getQuantity());
        System.out.println("Harga/Unit  : Rp" + order.getPrice());
        System.out.println("--------------------------");
        System.out.println("TOTAL HARGA : Rp" + order.calculateTotal());
        System.out.println("==========================");
    }
}