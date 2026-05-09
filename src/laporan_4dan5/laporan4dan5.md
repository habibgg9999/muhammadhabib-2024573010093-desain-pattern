# LAPORAN MODUL 4&5 SOLID RESPONSIBILTY PRINCIPLE & OPEN CLOSED PRINCIPLE
**Mata Kuliah:** Praktikum Design Pattern  
**Prodi/Jurusan:** Teknologi Informasi / TIK - Politeknik Negeri Lhokseumawe  
**Nama:** Muhammad Habib Hanafi
**NIM:** 2024573010093  
**Kelas:** 2A


# 1.1 Latar Belakang
Pengembangan perangkat lunak modern tidak hanya berfokus pada fungsionalitas ("apakah program ini berjalan?"), tetapi juga pada aspek maintainability (kemudahan pemeliharaan) dan scalability (kemudahan pengembangan). Seiring bertambahnya fitur, kompleksitas kode seringkali meningkat secara eksponensial. Masalah yang sering muncul adalah adanya kelas atau modul yang menjadi terlalu besar dan menangani terlalu banyak tugas sekaligus, yang sering disebut dengan istilah God Object.

Untuk mengatasi masalah tersebut, Robert C. Martin memperkenalkan sekumpulan prinsip desain yang dikenal sebagai SOLID. Prinsip pertama dari akronim ini adalah Single Responsibility Principle (SRP). SRP hadir sebagai solusi untuk menciptakan struktur kode yang lebih rapi, di mana setiap komponen memiliki batasan tanggung jawab yang jelas.

# 1.2 Pengertian Single Responsibility Principle (SRP)
Secara formal, Single Responsibility Principle menyatakan:

"A class should have one, and only one, reason to change."
(Sebuah kelas hanya boleh memiliki satu, dan hanya satu, alasan untuk berubah).

Dalam konteks ini, "alasan untuk berubah" berkorelasi erat dengan peran atau aktor yang dilayani oleh perangkat lunak tersebut. Jika sebuah kelas memiliki beberapa alasan untuk berubah dari sumber yang berbeda (misalnya perubahan logika perhitungan pajak dan perubahan format tampilan laporan), maka kelas tersebut dianggap memiliki tanggung jawab ganda yang saling berkelindan (tightly coupled).

# 1.3 Langkah praktikum MODUL 4 SINGLE RESPONSIBILTY PRINCIPLE

1.Buat package baru dan beri nama modul 4
- buat package dalam modul 4 dan beri nama order management
- isi kode nya

buat class dengan nama OrderManager dan isi kode di bawah
package modul_4.praktikum_3.tanpa_srp;

import java.io.FileWriter;
import java.io.IOException;

public class OrderManager {
private String product;
private int quantity;
private double price;

    public OrderManager(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // Menghitung total harga
    public double calculateTotal() {
        return quantity * price;
    }

    // Menyimpan pesanan ke file (Seharusnya tugas kelas lain)
    public void saveOrder() {
        // Nama file "orders.txt", 'true' artinya data ditambahkan (append)
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(product + " - " + quantity + " - Rp" + calculateTotal() + "\n");
            System.out.println("Pesanan telah disimpan!");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
        }
    }

    // Menampilkan struk pesanan (Seharusnya tugas kelas lain)
    public void printReceipt() {
        System.out.println("\n📜 Struk Pesanan:");
        System.out.println("Produk: " + product);
        System.out.println("Jumlah: " + quantity);
        System.out.println("Total Harga: Rp" + calculateTotal());
        System.out.println("================================");
    }
}


- buat class dengan nama Main isi dengan kode
  package modul_4.praktikum_3.tanpa_srp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int qty = scanner.nextInt();

        System.out.print("Masukkan Harga per Unit: ");
        double price = scanner.nextDouble();

        // Objek tunggal yang melanggar SRP
        OrderManager order = new OrderManager(product, qty, price);

        order.saveOrder();
        order.printReceipt();

        scanner.close();
    }
}

-jalankan dan lihat hasil nya
![{25979DF9-8B33-4773-93C4-5690FEFB201A}.png](%7B25979DF9-8B33-4773-93C4-5690FEFB201A%7D.png)

2.Buat package baru di dalam modul 4 dan beri nama praktikum.1_tanpa_srp
- Buat class baru dengan nama ReportManager dan isi kode nya
  package modul_4.praktikum_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
private final String content;

    public ReportManager(String content) {
        this.content = content;
    }

    // Membuat laporan
    public String generateReport() {
        return "=== LAPORAN ===\n" + content + "\n====================";
    }

    // Menyimpan laporan ke file (Seharusnya tugas kelas lain)
    public void saveToFile(String filename) {
        // Path disesuaikan dengan struktur folder di screenshot pertama kamu
        String folderPath = "src\\modul_4\\praktikum_1\\tanpa_srp\\";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Laporan disimpan ke file: " + filename);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }

    // Mencetak laporan ke console (Seharusnya tugas kelas lain)
    public void printReport() {
        System.out.println("\nLaporan yang dicetak:\n" + content);
    }
}

- buat class baru dan beri nama Main dan isi kode
  package modul_4.praktikum_1.tanpa_srp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        // Menyimpan ke file dengan ekstensi .txt secara otomatis
        reportManager.saveToFile(reportFileName + ".txt");

        // Mencetak ke console
        reportManager.printReport();

        scanner.close(); // Praktik baik untuk menutup scanner
    }
}

- jalankan untuk melihat hasil nya
![{00FE6862-0F9B-4C15-9187-7DA0BA729D29}.png](%7B00FE6862-0F9B-4C15-9187-7DA0BA729D29%7D.png)

3. Buat package baru  praktikum 1 dan beri nama dengan_srp

-buat class dengan nama ReportGenerator dan isi kode

package modul_4.praktikum_1.dengan_srp;

public class ReportGenerator {
private final String content;

    public ReportGenerator(String content) {
        this.content = content;
    }

    public String generateReport() {
        return "=== LAPORAN ===\n" + content + "\n====================";
    }
}

-buat class baru dan beri nama ReporPrinter dan isi kode
package modul_4.praktikum_1.dengan_srp;

public class ReportPrinter {
public void printReport(String content) {
System.out.println("\nLaporan yang dicetak:\n" + content);
}
}

-buat class dengan nama ReportSaver dan isi kode
package modul_4.praktikum_1.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
public void saveToFile(String filename, String content) {
// Sesuaikan path dengan struktur folder di IntelliJ kamu
String folderPath = "src\\modul_4\\praktikum_1\\dengan_srp\\";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
            System.out.println("Laporan disimpan ke file: " + filename);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }
}

-buat class dengan nama Main dan isi kode

package modul_4.praktikum_1.dengan_srp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        // Menggunakan ReportGenerator untuk mengolah teks
        ReportGenerator report = new ReportGenerator(reportText);
        String reportContent = report.generateReport();

        // Menggunakan ReportSaver untuk menyimpan ke file
        ReportSaver saver = new ReportSaver();
        saver.saveToFile(reportFileName + ".txt", reportContent);

        // Menggunakan ReportPrinter untuk mencetak ke console
        ReportPrinter printer = new ReportPrinter();
        printer.printReport(reportContent);

        scanner.close();
    }
}

-jalankan untuk melihat hasil
![{B94B7144-1AAE-436B-9F52-2701B8700F12}.png](%7BB94B7144-1AAE-436B-9F52-2701B8700F12%7D.png)

4.Buat package baru di dalam modul 4 dan beri nama praktikum2.tanpa_srp

-buat class baru dan beri nama UserManager dan isi kode 

package modul_4.praktikum_2.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserManager {
private final String name;
private final String email;

    public UserManager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Menyimpan pengguna ke database/file (Seharusnya tugas kelas lain)
    public void saveToDatabase() {
        // Folder path disesuaikan dengan screenshot kamu
        String folderPath = "src\\modul_4\\praktikum_2\\tanpa_srp\\";
        String filename = "user.txt";

        File file = new File(folderPath + filename);

        // 'true' artinya data akan ditambah di baris baru (append), bukan menimpa yang lama
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(name + " - " + email + "\n");
            System.out.println("Pengguna berhasil disimpan: " + name);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pengguna: " + e.getMessage());
        }
    }

    // Mengirim email selamat datang (Seharusnya tugas kelas lain)
    public void sendWelcomeEmail() {
        System.out.println("\nMengirim email ke " + email + "...");
        System.out.println("Halo " + name + ", selamat datang di sistem kami!\n");
    }
}

-buat class baru beri nama Main dan isi kode
package modul_4.praktikum_2.tanpa_srp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();

        // Membuat satu objek yang melakukan segalanya
        UserManager user = new UserManager(name, email);

        user.saveToDatabase();
        user.sendWelcomeEmail();

        scanner.close();
    }
}

-jalankan
![{A57F38FA-1888-4745-9D3B-0B65378FD8C2}.png](%7BA57F38FA-1888-4745-9D3B-0B65378FD8C2%7D.png)

5.Buat package baru di dalam praktikum 2 dan beri nama dengan_srp

-buat class dengan nama EmailService isi kode
package modul_4.praktikum_2.dengan_srp;

public class EmailService {
public void sendWelcomeEmail(User user) {
System.out.println("\nMengirim email ke " + user.getEmail() + "...");
System.out.println("Halo " + user.getName() + ", selamat datang di sistem kami!\n");
}
}

-buat class dengan nama UserRepository isi kode

package modul_4.praktikum_2.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {
// Path disesuaikan dengan struktur folder di screenshot kamu
private static final String FOLDER_PATH = "src\\modul_4\\praktikum_2\\dengan_srp\\";
private static final String DATABASE_FILE = "user.txt";

    public void save(User user) {
        File file = new File(FOLDER_PATH + DATABASE_FILE);

        // 'true' agar data baru ditambahkan di bawah data lama (append)
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(user.getName() + " - " + user.getEmail() + "\n");
            System.out.println("Pengguna berhasil disimpan: " + user.getName());
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pengguna: " + e.getMessage());
        }
    }
}

-buat class dengan nama User isi kode

package modul_4.praktikum_2.dengan_srp;

public class User {
private String name;
private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

-buat class dengan nama Main isi kode

package modul_4.praktikum_2.dengan_srp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();

        // 1. Inisialisasi Data (Entity)
        User user = new User(name, email);

        // 2. Simpan Data (Persistence)
        UserRepository repository = new UserRepository();
        repository.save(user);

        // 3. Kirim Notifikasi (Service)
        EmailService emailService = new EmailService();
        emailService.sendWelcomeEmail(user);

        scanner.close();
    }
}

-jalankan
![{B67CC978-A972-4DC7-A759-DEF4FA3F7703}.png](%7BB67CC978-A972-4DC7-A759-DEF4FA3F7703%7D.png)

6.Buat package baru di dalam modul 4 dan beri nama latihan
Analisis kode yang telah diberikan.
Identifikasi bagian mana yang melanggar SRP.
Pisahkan tanggung jawab ke dalam kelas-kelas yang sesuai agar mematuhi SRP.


-buat class dengan nama Order isi kode
package modul_4.latihan;

public class Order {
private String product;
private int quantity;
private double price;

    public Order(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    // Getter untuk kebutuhan kelas lain
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

-buat class dengan nama OrderRepository isi kode
package modul_4.latihan;

import java.io.FileWriter;
import java.io.IOException;

public class OrderRepository {
public void saveToFile(Order order) {
try (FileWriter writer = new FileWriter("orders.txt", true)) {
writer.write(order.getProduct() + " - " + order.getQuantity() +
" - Rp" + order.calculateTotal() + "\n");
System.out.println("Sistem: Pesanan berhasil disimpan ke file.");
} catch (IOException e) {
System.out.println("Sistem: Gagal menyimpan pesanan: " + e.getMessage());
}
}
}

-buat class dengan nama OrderViewer isi kode

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

-buat class dengan nama Main isi kode
package modul_4.latihan;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Produk: ");
        String product = scanner.nextLine();
        System.out.print("Jumlah: ");
        int qty = scanner.nextInt();
        System.out.print("Harga: ");
        double price = scanner.nextDouble();

        // 1. Buat Objek Data
        Order order = new Order(product, qty, price);

        // 2. Simpan Data (Persistence)
        OrderRepository repo = new OrderRepository();
        repo.saveToFile(order);

        // 3. Tampilkan Data (View)
        OrderViewer viewer = new OrderViewer();
        viewer.printReceipt(order);

        scanner.close();
    }
}

-jalankan
![{BBEB40F4-1D16-42AB-8715-D0FE3A8B5875}.png](%7BBBEB40F4-1D16-42AB-8715-D0FE3A8B5875%7D.png)

Kesimpulan Hasil Program
Berdasarkan hasil eksekusi program pada modul latihan ini, dapat disimpulkan bahwa program telah berhasil mengimplementasikan alur logika pemrosesan transaksi secara otomatis dengan detail sebagai berikut:

Keberhasilan Alur Input-Output: Program mampu menerima input data produk (sabun), jumlah (4), dan harga (3000), kemudian mengolahnya menjadi struk pesanan dengan perhitungan total harga yang akurat sebesar Rp12000.0.

Penerapan Persistensi Data: Program menunjukkan kemampuan penyimpanan data eksternal dengan adanya notifikasi "Pesanan berhasil disimpan ke file", yang menandakan implementasi modul File I/O telah berjalan dengan baik.

Relevansi dengan Prinsip Desain:

Single Responsibility Principle (SRP): Pemisahan tugas terlihat jelas dari kemampuan sistem untuk mengolah data pesanan sekaligus menangani fungsi penyimpanan file secara terpisah.

Stabilitas Sistem: Program berjalan menggunakan environment Amazon Corretto JDK 21 dan berakhir dengan exit code 0, yang menunjukkan tidak adanya kesalahan logika atau runtime error selama proses eksekusi berlangsung.




# 1.4 Latar Belakang Open-Closed Principle (OCP)
Dalam siklus hidup pengembangan perangkat lunak, perubahan adalah sesuatu yang tidak terhindarkan. Masalah utama yang sering dihadapi pengembang adalah ketika penambahan fitur baru mengharuskan perubahan pada kode yang sudah ada, sudah diuji, dan sudah berjalan di lingkungan produksi. Perubahan pada kode lama ini sering kali memicu efek domino, di mana kesalahan kecil pada modifikasi tersebut dapat merusak fungsionalitas sistem secara keseluruhan (bug regresi).

Prinsip OCP muncul untuk mengatasi kerapuhan (fragility) sistem tersebut. Dengan menerapkan OCP, pengembang diarahkan untuk membangun arsitektur yang stabil namun tetap fleksibel. Alih-alih membongkar kode lama setiap kali ada permintaan fitur baru, sistem dirancang agar fitur baru tersebut dapat "ditancapkan" (di-extend) ke dalam sistem tanpa mengganggu integritas komponen yang sudah mapan.

# 1.5 Pengertian Open-Closed Principle (OCP)
Open-Closed Principle (OCP) adalah prinsip kedua dalam SOLID yang menekankan pada skalabilitas dan ketahanan kode. Secara harfiah, prinsip ini menyatakan bahwa:

"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."

Secara mendalam, pengertian tersebut dibagi menjadi dua bagian utama:

Open for Extension (Terbuka untuk Perluasan): Modul atau kelas harus dirancang sedemikian rupa sehingga perilakunya dapat diperluas atau diubah sesuai dengan kebutuhan bisnis yang baru. Hal ini biasanya dicapai melalui penggunaan abstraksi (interface atau abstract class).

Closed for Modification (Tertutup untuk Modifikasi): Setelah sebuah kode selesai dibuat, diuji, dan dianggap stabil, kode tersebut tidak boleh diubah lagi secara fisik untuk menambahkan fungsi baru. Tujuannya adalah untuk menjaga agar kode yang sudah terbukti berjalan dengan baik tidak mengalami kerusakan akibat intervensi kode baru.

# 1.6 Langlah praktikum OCP

1. Buat package baru beri nama modul 5 di dalam  package modul 5 buat package baru dengan nama praktikum1.tanpa_ocp

- buat class dengan nama PaymentProcessor isi kode
  package modul_5.praktikum_1.tanpa_ocp;

public class PaymentProcessor {
public void processPayment(String paymentType, double amount) {
// Menggunakan equalsIgnoreCase agar tidak error jika salah huruf besar/kecil
if (paymentType.equalsIgnoreCase("CreditCard")) {
System.out.println("Processing Credit Card payment of " + amount);
} else if (paymentType.equalsIgnoreCase("EWallet")) {
System.out.println("Processing E-Wallet payment of " + amount);
} else {
System.out.println("Invalid payment method");
}
}
}

-buat class dengan nama Main isi kode
package modul_5.praktikum_1.tanpa_ocp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment type (CreditCard/EWallet): ");
        String type = scanner.next();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        // Memanggil class PaymentProcessor
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(type, amount);

    }
}

-jalankan
![{7BF61E01-4292-4EF5-B86A-0BF3F42B1DA9}.png](%7B7BF61E01-4292-4EF5-B86A-0BF3F42B1DA9%7D.png)

2. buat package di dalam praktikum 1 dan beri nama dengan ocp

-buat class PaymentProcessor isi kode
package modul_5.praktikum_1.tanpa_ocp.dengan_ocp;

public class PaymentProcessor {
public void processPayment(PaymentMethod method, double amount) {
method.process(amount);
}
}

-buat class dengan nama CreditCardPayment isi kode
package modul_5.praktikum_1.tanpa_ocp.dengan_ocp;

/**
* Class ini adalah implementasi dari interface PaymentMethod.
* Dibuat khusus untuk menangani logika pembayaran Kartu Kredit.
  */
  public class CreditCardPayment implements PaymentMethod {

  @Override
  public void process(double amount) {
  System.out.println("Processing Credit Card payment of " + amount);
  }
  }

-buat class dengan nama EWalletPayent isi kode
package modul_5.praktikum_1.tanpa_ocp.dengan_ocp;

/**
* Class ini adalah implementasi dari interface PaymentMethod.
* Dibuat khusus untuk menangani logika pembayaran E-Wallet.
  */
  public class EWalletPayment implements PaymentMethod {

  @Override
  public void process(double amount) {
  System.out.println("Processing E-Wallet payment of " + amount);
  }
  }

-buat interface dengan nama PaymentMethod isi kode
package modul_5.praktikum_1.tanpa_ocp.dengan_ocp;

public interface PaymentMethod {
void process(double amount);
}

-jalankan
![{9A4C5913-596F-4EF6-8698-CB9E25F8305C}.png](%7B9A4C5913-596F-4EF6-8698-CB9E25F8305C%7D.png)

3. Buat package baru dalam modul 5 dengan nama praktikum2.tanpa_ocp

-buat class dengan nama DiscountCalculator isi kode
package modul_5.praktikum_2.tanpa_ocp;

public class DiscountCalculator {
public double calculateDiscount(String customerType, double price) {
if (customerType.equals("Regular")) {
return price * 0.1; // Diskon 10%
} else if (customerType.equals("Premium")) {
return price * 0.2; // Diskon 20%
} else {
return 0;
}
}
}

-buat class dengan nama Main isi kode
package modul_5.praktikum_2.tanpa_ocp;

public class Main {
public static void main(String[] args) {
DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular Customer Discount: " +
                calculator.calculateDiscount("Regular", 100));

        System.out.println("Premium Customer Discount: " +
                calculator.calculateDiscount("Premium", 100));
    }
}

- jalankan
![{D769D5AE-A2EE-4988-96E1-A2E46E4049A5}.png](%7BD769D5AE-A2EE-4988-96E1-A2E46E4049A5%7D.png)

4. Buat package baru di dalam praktikum2 beri nama dengan_ocp

-buat class dengan nama RegularDiscount isi kode
package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class RegularDiscount implements Discount {
@Override
public double applyDiscount(double price) {
return price * 0.1;
}
}

-buat class dengan nama PremiumDiscount isi kode

package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class PremiumDiscount implements Discount {

    @Override
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}

-buat class dengan nama DiscountCalculator isi kode
package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class DiscountCalculator {
public double calculateDiscount(Discount discountStrategy, double price) {
return discountStrategy.applyDiscount(price);
}
}

-buat interface dengan nama Discount isi kode

package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public interface Discount {
double applyDiscount(double price);
}

-buat class dengan nama Main isi kode
package modul_5.praktikum_2.tanpa_ocp.dengan_ocp;

public class Main {
public static void main(String[] args) {
DiscountCalculator calculator = new DiscountCalculator();

        // Membuat objek strategi diskon
        Discount regular = new RegularDiscount();
        Discount premium = new PremiumDiscount();

        // Menghitung diskon untuk Regular
        System.out.println("Regular Customer Discount: " +
                calculator.calculateDiscount(regular, 100));

        // Menghitung diskon untuk Premium
        System.out.println("Premium Customer Discount: " +
                calculator.calculateDiscount(premium, 100));
    }
}

-jalankan
![{DB8C3CBD-7A90-4EE5-A8AA-12117719279C}.png](%7BDB8C3CBD-7A90-4EE5-A8AA-12117719279C%7D.png)

5. Buat package baru di dalam modul 5 dan beri nama praktikum3 tanpa_ocp

-buat class dengan nama NotificationService isi kode
package modul_5.praktikum_3.tanpa_ocp;

public class NotificationService {
public void sendNotification(String type, String message) {
if (type.equals("Email")) {
System.out.println("Sending Email: " + message);
} else if (type.equals("SMS")) {
System.out.println("Sending SMS: " + message);
} else {
System.out.println("Invalid notification type");
}
}

-buat class dengan nama Main isi kode
package modul_5.praktikum_3.tanpa_ocp;

public class Main {
public static void main(String[] args) {
NotificationService service = new NotificationService();

        service.sendNotification("Email", "Hello via Email!");
        service.sendNotification("SMS", "Hello via SMS!");
    }
}
-jalankan
![{67B67095-7911-4050-8BEC-E1A8984E3692}.png](%7B67B67095-7911-4050-8BEC-E1A8984E3692%7D.png)

6. Buat package baru di dalam praktikum 3 beri nama dengan_ocp

-buat class dengan nama EmailNotifier isi kode
package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class EmailNotifier implements Notifier {
@Override
public void send(String message) {
System.out.println("Sending Email: " + message);
}
}

-buaat class dengan nama NotificationService isi kode

package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class NotificationService {
public void sendNotification(Notifier notifier, String message) {
notifier.send(message);
}
}

-buat class dengan nama SMSNotifier isi kode
package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class SMSNotifier implements Notifier {
@Override
public void send(String message) {
System.out.println("Sending SMS: " + message);
}
}

-buat interface dengan nama Notifier isi kode
package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public interface Notifier {
void send(String message);
}

-buat class dengan nama Main isi kode
package modul_5.praktikum_3.tanpa_ocp.dengan_ocp;

public class Main {
public static void main(String[] args) {
NotificationService service = new NotificationService();

        // Membuat objek notifier sebagai implementasi dari interface Notifier
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        // Mengirim notifikasi menggunakan objek yang berbeda
        service.sendNotification(emailNotifier, "Hello via Email!");
        service.sendNotification(smsNotifier, "Hello via SMS!");
    }
}

-jalankan
![{512B685D-5EC1-49BE-8872-C9C78E35176D}.png](%7B512B685D-5EC1-49BE-8872-C9C78E35176D%7D.png)

7. Buat package baru di dalam modul 5 dan beri nama latihan selesaikan soal berikut
   Modifikasi kode di atas agar memenuhi prinsip OCP, sehingga kita bisa menambahkan jenis kendaraan baru tanpa mengubah kode yang sudah ada.

Petunjuk:

Gunakan polimorfisme dengan membuat interface TaxStrategy.
Buat class CarTax dan MotorcycleTax yang mengimplementasikan TaxStrategy.
Ubah TaxCalculator agar menerima strategi pajak sebagai parameter, bukan langsung menerima vehicleType.
Tambahkan kelas baru TruckTax (dengan pajak 15%) tanpa mengubah TaxCalculator.
Setelah refactoring, program harus bisa dengan mudah menangani kendaraan baru tanpa mengubah kode TaxCalculator.


-buat class dengan nama CarTax isi kode
package modul_5.latihan;

public class CarTax implements TaxStrategy {
@Override
public double calculate(double price) {
return price * 0.1; // Pajak 10%
}
}

-buat class dengan nama MotorCycleTax isi kode
package modul_5.latihan;

public class MotorCycleTax implements TaxStrategy {
@Override
public double calculate(double price) {
return price * 0.05; // Pajak 5%
}
}

-buat class dengan nama TaxCalculator isi kode
package modul_5.latihan;

public class TaxCalculator {
public double calculateTax(TaxStrategy strategy, double price) {
return strategy.calculate(price);
}
}

-buat class dengan nama TruckTax isi kode
package modul_5.latihan;

public class TruckTax implements TaxStrategy {
@Override
public double calculate(double price) {
return price * 0.15; // Pajak 15%
}
}

-buat interface dengan nama TaxStrategy isi kode
package modul_5.latihan;

public interface TaxStrategy {
double calculate(double price);
}

-buat class dengan nama Main isi kode
package modul_5.latihan;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Motorcycle/Truck): ");
        String type = scanner.next();

        System.out.print("Enter vehicle price: ");
        double price = scanner.nextDouble();

        TaxCalculator calculator = new TaxCalculator();
        TaxStrategy strategy = null;

        // Pemilihan strategi berdasarkan input
        if (type.equalsIgnoreCase("Car")) {
            strategy = new CarTax();
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            strategy = new MotorCycleTax();
        } else if (type.equalsIgnoreCase("Truck")) {
            strategy = new TruckTax();
        } else {
            System.out.println("Invalid vehicle type!");
            return;
        }

        double tax = calculator.calculateTax(strategy, price);
        System.out.println("Calculated tax: " + tax);
    }
}

-jalankan
![{09B5C050-A496-42AC-8086-00E5113F31E5}.png](%7B09B5C050-A496-42AC-8086-00E5113F31E5%7D.png)
Kesimpulan Hasil Program
Berdasarkan implementasi kode pada modul latihan ini, dapat disimpulkan bahwa program telah berhasil menerapkan prinsip Open-Closed Principle (OCP) dan Single Responsibility Principle (SRP) dengan baik. Hal ini terlihat dari beberapa poin berikut:

Pemisahan Tanggung Jawab (SRP): Program mampu memisahkan tugas antara input pengguna, logika perhitungan pajak berdasarkan jenis kendaraan, dan penampilan hasil, sehingga kode lebih terstruktur.

Fleksibilitas Desain (OCP): Dengan menggunakan abstraksi pada jenis kendaraan (Car, Motorcycle, Truck), program dapat menghitung pajak sebesar 10.000,0 dari harga kendaraan 100.000 secara akurat. Struktur ini memungkinkan penambahan jenis kendaraan baru di masa depan tanpa harus mengubah logika perhitungan utama pada kelas Main.

Validitas Eksekusi: Program berjalan dengan stabil menggunakan JDK 21, dibuktikan dengan status Process finished with exit code 0, yang menunjukkan bahwa seluruh alur logika dari input hingga kalkulasi pajak berjalan tanpa error.


# 1.7 Kesimpulan Hasil Penerapan SRP dan OCP
Berdasarkan hasil implementasi dan pengujian program yang telah dilakukan, dapat ditarik kesimpulan sebagai berikut:

Penerapan SRP (Single Responsibility Principle): Program berhasil memisahkan tanggung jawab antara logika bisnis (perhitungan), pengelolaan data produk, dan fungsi penyimpanan ke file. Hal ini terbukti dari output yang menunjukkan proses penyimpanan file dan pencetakan struk dapat berjalan secara independen tanpa tumpang tindih fungsi.

Penerapan OCP (Open-Closed Principle): Struktur kode memungkinkan penambahan jenis produk atau kalkulasi pajak baru tanpa harus memodifikasi kelas utama yang sudah ada. Hal ini terlihat pada fleksibilitas sistem dalam menangani berbagai tipe input (seperti jenis kendaraan atau produk ritel) secara akurat sesuai kontrak abstraksi yang telah dibuat.

Efisiensi dan Stabilitas: Implementasi kedua prinsip ini menghasilkan kode yang lebih mudah dipelihara (maintainable) dan stabil, dibuktikan dengan eksekusi program yang berjalan sempurna pada environment JDK 21 dengan exit code 0.