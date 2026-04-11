package modul_3.bagian_4;

class Mobil {
    // Composition: Mobil "memiliki" Mesin
    private final Mesin mesin;

    public Mobil() {
        // Objek Mesin dibuat di dalam constructor Mobil
        this.mesin = new Mesin();
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
}