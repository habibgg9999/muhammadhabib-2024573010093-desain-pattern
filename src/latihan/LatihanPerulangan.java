package latihan;

public class LatihanPerulangan {
    public static void main(String[] args) {

        // 1. Menggunakan FOR
        System.out.println("=== Bilangan Ganjil dengan FOR ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 2. Menggunakan WHILE
        System.out.println("=== Bilangan Ganjil dengan WHILE ===");
        int j = 1;
        while (j <= 20) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\n");

        // 3. Menggunakan DO-WHILE
        System.out.println("=== Bilangan Ganjil dengan DO-WHILE ===");
        int k = 1;
        do {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 20);
    }
}