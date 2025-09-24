public class Smartphone {                                    
    String merek;                                            
    int RAM;                                                 
    double harga;                                            

    public Smartphone (){
        this.merek = "Tidak diketahui";
        this.RAM = 0;
        this.harga = 0.0;
    }

    public Smartphone(String merek, double harga){
        this.merek = merek;
        this.RAM = 32;
        this.harga = harga;
    }

    public Smartphone (String merek, int RAM, double harga){
        this.merek = merek;
        this.RAM = RAM;
        this.harga = harga;
    }

    public void infoSmartphone(){
        System.out.println("Merek: " + merek + ", kapasitas RAM: " + RAM + "GB" + ", Harga: " + harga);
    }

    public void infoSmartphone (boolean detail){
        if (detail) {
            System.out.println("Smartphone merek "+ merek + ", RAM: "+ RAM + "GB dengan harga "+ harga);
        }
        else {
            System.out.println("Smartphone merek "+ merek + " dengan harga "+ harga);
        }
    }

    public static void main (String[] args){

        Smartphone hpGita = new Smartphone();
        Smartphone hpAle = new Smartphone("Vivo", 16, 3000000);
        Smartphone hpFarid = new Smartphone("Oppo", 4000000);

        hpGita.infoSmartphone();
        hpAle.infoSmartphone(true);
        hpFarid.infoSmartphone(false);
    }

}
