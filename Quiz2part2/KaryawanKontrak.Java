package QuizPBOPart2;

public class KaryawanKontrak extends Karyawan implements IDapatGaji{
    private double upahHarian;
    private int jumlahHariMasuk;
    public KaryawanKontrak(String nama, String NIP, double upahHarian, int jumlahHariMasuk){
        super(nama, NIP);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    
    @Override
    public void tampilkanSlipGaji(){
        System.out.println("Nama: "+ getNama() + "\nNIP: "+ getNIP() + "\nStatus: Karyawan Kontrak"+ "\nGaji Bulanan: "+ upahHarian * jumlahHariMasuk);
    }
}
