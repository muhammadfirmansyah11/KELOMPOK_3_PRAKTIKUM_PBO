public class Praktikum6 {

    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 7000000, 15);
       Produk p2 = new Produk("Handphone", 1500000, 10);
       
       System.out.println(p1.nama);
       System.out.println(p1.stok);
//     System.out.println(p1.harga);
//      p1.namaSuppliers();
        p1.namaSuppliersFix();
        p2.tampilkanInfo();               
        System.out.println(p1.getHarga());
        p1.setHarga(5000000);
        System.out.println("Harga baru untuk produk 1 = " + p1.getHarga());
        Produk.infoJumlahProduk();
    }
}
