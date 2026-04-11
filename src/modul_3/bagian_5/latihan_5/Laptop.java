package modul_3.bagian_5;

public class Laptop {
    // Composition: Laptop memiliki komponen Processor dan RAM
    private final Proccesor processor;
    private final Ram ram;

    public Laptop() {
        // Objek komponen dibuat saat objek Laptop dibuat
        this.processor = new Proccesor();
        this.ram = new Ram();
    }

    void nyalakan() {
        System.out.println("Menyalakan laptop...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan!");
    }
}