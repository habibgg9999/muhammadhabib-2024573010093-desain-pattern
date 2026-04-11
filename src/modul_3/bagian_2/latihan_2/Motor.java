package modul_3.bagian_2;

public class Motor {
    // Atribut yang dienkapsulasi (private)
    private String merk;
    private int tahun;

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}