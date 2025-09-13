import java.util.Scanner;

public class Percobaan4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        // if else
        System.out.print("Masukkan Nilai: ");
        int nilai = Integer.parseInt(scanner.nextLine());

        if (nilai > 75) {
            System.out.println("Selamat Anda Lulus Ujian");
        } else {
            System.out.println("Maaf Anda Harus Mengulang Ujian");
        }



        // if else if else
        System.out.print("Masukkan Nilai: ");
        nilai = Integer.parseInt(scanner.nextLine());

        if (nilai > 75) {
            System.out.println("Selamat Anda Lulus Ujian");
        } else if (nilai > 65) {
            System.out.println("Nilai Anda berada di ambang batas kelulusan");
        } else {
            System.out.println("Maaf Anda Harus Mengulang Ujian");
        }


        //Switch Case
        System.out.print("Masukkan warna (RGB): ");
        String warna = scanner.next();
        switch (warna) {
            case "R":
                System.out.println("Anda Memilih Warna Merah");
                break;
            case "G":
                System.out.println("Anda Memilih Warna Hijau");
                break;
            case "B":
                System.out.println("Anda Memilih Warna Biru");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        }


        //Nested if
        System.out.print("Masukkan Angka: ");
        int angka = scanner.nextInt();

        if (angka >= 0) {
            System.out.print("Bilangan bernilai positif ");
                if (angka %2 == 0) {
                    System.out.println("dan genap");              
                }else {
                    System.out.println("dan ganjil");
                }
        }else if (angka == 0) {
            System.out.print("Bilangan bernilai netral ");
        }else {
            System.out.print("Bilangan bernilai negatif ");
                if (angka %2 == 0) {
                    System.out.println("dan genap");
                }else {
                    System.out.println("dan ganjil");
                }
        }


        //For Loop
        int a;
        for (a = 1; a <= 5; a++) {
            System.out.println("For loop ke- "+ a);
        }


        //While Loop
        int b = 1;
        while (b <= 5) {
            System.out.println("While loop ke- "+ b);
            b++;
        }


        //Do-While
        int c = 5;
        do {
            System.out.println("Do While ke- "+ c);
            c++;
        } while (c <= 5);


        //Nested Loop
        char kursi = 'A';
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(kursi + "" + j + " ");
            }
                System.out.println( );
                kursi++;
        }


        //Break
        for (int d = 1; d <= 10; d++){
            if (d == 5){
                System.out.println("Break di angka "+ d);
                break;
            }
            System.out.println("Angka "+ d);
        }


        //Continue
        for (int e = 1; e <=10; e++){
            if (e %2 == 0){
                continue;
            }
            System.out.println("Bilangan ganjil: "+ e);
        }

    }
}

