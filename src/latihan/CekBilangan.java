package latihan;

public class CekBilangan {
    public static void main(String[] args) {
        // Masukkan angka yang ingin dicek
        int angka = 15;

        // Logika Percabangan
        // % adalah operator modulus (sisa bagi)
        if (angka % 2 == 0) {
            // Jika angka dibagi 2 sisa baginya adalah 0
            System.out.println(angka + " adalah bilangan GENAP.");
        } else {
            // Jika angka dibagi 2 ada sisa baginya (sisa 1)
            System.out.println(angka + " adalah bilangan GANJIL.");
        }
    }
}