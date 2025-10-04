public class Rekening {
    
    public String namaNasabah;
    private int saldo;
    
    Rekening (String namaNasabah, int saldo){
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        System.out.print("Saldo Nasabah: ");
        return saldo;
    }
           
}
