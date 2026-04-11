class Lingkaran extends BangunDatar {
    double r;

    @Override
    void hitungLuas() {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran: " + luas);
    }
}