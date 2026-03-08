# Laporan Modul 1: Review Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Design Pattern  
**Prodi/Jurusan:** Teknologi Informasi / TIK - Politeknik Negeri Lhokseumawe  
**Nama:** Muhammad Habib Hanafi
**NIM:** 2024573010093  
**Kelas:** 2A

---

## Abstrak
Laporan ini disusun sebagai dokumentasi praktikum Modul 1 pada mata kuliah Design Pattern. Fokus utama dari praktikum ini adalah meninjau kembali (*review*) dasar-dasar pemrograman Java, mulai dari pengaturan lingkungan pengembangan menggunakan IntelliJ IDEA, pemahaman tipe data, hingga implementasi logika kontrol aliran (percabangan dan perulangan).

---

## 1. Pendahuluan
Java merupakan bahasa pemrograman berorientasi objek yang dirancang untuk memiliki sintaks yang mirip dengan C++ namun lebih mudah digunakan. Dalam ekosistemnya, Java memerlukan JDK (*Java Development Kit*) sebagai *compiler* dan IDE (*Integrated Development Environment*) seperti IntelliJ IDEA untuk efisiensi penulisan kode. Pemahaman dasar Java sangat krusial sebelum melangkah ke konsep *Design Pattern* yang lebih kompleks.

---

## 2. Proses Instalasi Java dan Setup Project
Langkah-langkah yang dilakukan untuk memulai praktikum adalah:
1. Memastikan **JDK (Amazon Corretto)** dan **IntelliJ IDE Community Edition** terinstal di sistem.
2. Membuat project baru dengan nama **`ti_design_pattern`** menggunakan build system IntelliJ.
3. Membuat struktur folder dengan menambahkan *package* baru bernama **`modul_1`** di dalam folder `src`.
4. Membuat class pertama bernama `HelloWorld` untuk memverifikasi bahwa lingkungan pengembangan berjalan dengan benar.

---

## 3. Laporan Proses Pembuatan Program
Berikut adalah ringkasan kode dan logika yang telah diimplementasikan sesuai dengan instruksi modul:

### 3.1 Variabel dan Tipe Data
Saya telah membuat class `Variable` untuk memahami penggunaan tipe data dasar seperti `int`, `double`, `boolean`, `char`, dan `String`.
* **Latihan Mandiri:** Membuat program data diri lengkap (Nama, TTL, Golongan Darah, dll) di dalam *package* `latihan` menggunakan tipe data yang presisi.

### 3.2 Operator dan Ekspresi
Dalam class `Operator`, diimplementasikan penggunaan operator aritmatika, perbandingan, dan logika.
* **Latihan Mandiri:** Membuat program penghitung luas persegi panjang dengan rumus `panjang * lebar`.

### 3.3 Percabangan (Control Flow)
Menggunakan struktur `if-else` dan `switch-case` untuk pengambilan keputusan dalam program.
* **Latihan Mandiri:** Membuat logika untuk menentukan bilangan genap atau ganjil menggunakan operator modulus (`%`).

### 3.4 Perulangan (Looping)
Menerapkan tiga jenis perulangan: `for`, `while`, dan `do-while`.
* **Latihan Mandiri:** Mencetak bilangan ganjil dari rentang 1 hingga 20 menggunakan ketiga metode perulangan tersebut untuk membandingkan perbedaannya.

### 3.5 Practice Problems (Masalah Praktik)
Saya telah menyelesaikan tiga masalah logika tingkat lanjut di folder `modul_1`:
1.  **Factorial**: Menghitung hasil perkalian berurutan dari suatu bilangan menggunakan perulangan.
2.  **Prima**: Menggunakan perulangan dan kondisi boolean untuk mengecek apakah suatu angka adalah bilangan prima.
3.  **Segitiga**: Implementasi *nested loop* (perulangan bersarang) untuk mencetak pola bintang berbentuk segitiga.

---

## 4. Referensi
1. Modul Praktikum Design Pattern: Review Dasar Pemrograman Java — Muhammad Reza Zulman.
2. Dokumentasi Resmi Java (Oracle) — https://docs.oracle.com/en/java/
3. Panduan Penggunaan IntelliJ IDEA — https://www.jetbrains.com/help/idea/

---
**Catatan:** Seluruh kode telah di-commit ke repositori dengan pesan *"quick review - pemrograman java dasar"*.