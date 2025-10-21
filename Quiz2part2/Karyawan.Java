package QuizPBOPart2;

public class Karyawan {
    private String nama;
    private String NIP;

    public Karyawan(String nama, String NIP){
        this.nama = nama;
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public String getNIP(){
        return NIP;
    }
}
