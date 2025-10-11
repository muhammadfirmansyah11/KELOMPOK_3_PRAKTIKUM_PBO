public class BarangElektronik extends Produk {
    private int garansi;

    public BarangElektronik (String nama, int harga, int garansi) {
        super (nama, harga);
        this.garansi = garansi;

    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk: "+ nama);
        System.out.println("Harga: "+ harga);
        System.out.println("Garansi: "+ garansi + " Bulan");
    }

    public void tampilkanGaransi() {
        System.out.println("Garansi: " + garansi + " Bulan");
    }

    @Override
    public double hitungPajak() {
        return harga * 0.01;
    }

    @Override
    public double hitungHarga() {
        return harga * 1.01;
    }
}
