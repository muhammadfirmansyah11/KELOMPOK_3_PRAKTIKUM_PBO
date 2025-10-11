public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("Buku", 100000);
        //Produk p2 = new BarangElektronik("Mouse", 900000, 12)
        BarangElektronik p2 = new BarangElektronik("Mouse", 900000, 12);

        p1.tampilkanInfo();
        System.out.println("Pajak Produk biasa\t: "+ p1.hitungPajak());
        System.out.println("Harga akhir Produk biasa: "+ p1.hitungHarga());
        System.out.println("========================================");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Harga akhir Produk Elektronik\t: "+ p2.hitungHarga());


        //p1.tampilkanGaransi();
    }
}
