package QuizPBOPart2;

public class KaryawanTetap extends Karyawan implements IDapatGaji {
    private double gajiBulanan;
    public KaryawanTetap(String nama, String NIP, double gajiBulanan){
        super(nama, NIP);
    }

    @Override
    public void tampilkanSlipGaji(){
        System.out.println("Nama: "+ getNama() + "\nNIP: "+ getNIP() + "\nStatus: Karyawan Tetap"+ "\nGaji Bulanan: "+ gajiBulanan);
    }
    
}
