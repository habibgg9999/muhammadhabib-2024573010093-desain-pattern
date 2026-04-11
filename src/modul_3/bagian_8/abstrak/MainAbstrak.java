package modul_3.bagian_8.abstrak;

public class MainAbstrak {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.makan();
        kucing.bersuara();

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan();
        anjing.bersuara();
    }
}