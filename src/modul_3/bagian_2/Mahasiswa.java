package modul_3.bagian_2;

class Mahasiswa {
    // Atribut private (Data Hiding)
    private String nama;
    private int umur;

    // Getter untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Setter untuk mengisi nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengambil nilai umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk mengisi nilai umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}