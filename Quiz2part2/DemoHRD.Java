package QuizPBOPart2;

public class DemoHRD {
    public static void main(String[] args) {
        KaryawanTetap k1 = new KaryawanTetap("Itachi", "12345678", 5000000 );
        KaryawanKontrak k2 = new KaryawanKontrak("Sasuke", "87654321", 500000, 24);

        IDapatGaji[] daftarGaji = {k1, k2};

        for (int i = 0; i < 0; i++){
            daftarGaji[i].tampilkanSlipGaji();
        }
    }
}
