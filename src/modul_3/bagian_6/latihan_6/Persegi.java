class Persegi extends BangunDatar {
    double sisi;

    @Override
    void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}