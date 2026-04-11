package modul_3.bagian_8.abstrak;

abstract class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    abstract void bersuara();
}