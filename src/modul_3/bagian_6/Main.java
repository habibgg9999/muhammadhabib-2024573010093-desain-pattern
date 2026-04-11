package modul_3.bagian_6;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Tipe referensi induk, tapi objeknya anak
        Hewan hewan1 = new Kucing(); // Polymorphism
        Hewan hewan2 = new Anjing(); // Polymorphism

        // Menjalankan method yang sudah di-override
        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk Guk!
    }
}