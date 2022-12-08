package alpro_week4;
import java.util.Scanner;

public class andmax {
    public static void main(String[] args) {

        //scanner
        Scanner scan =  new Scanner(System.in);

        //declare
        int tahunLahir;
        String nama;

        //input
        try {
        System.out.print("Masukkan nama anda : ");
        nama = scan.nextLine();

        System.out.print("Masukkan tahun lahir anda : ");
        tahunLahir = scan.nextInt();
        } finally {
            scan.close();
        }

        //output & condition
        System.out.print(nama + ", Berdasarkan tahun lahir anda tergolong ");
        
        if (tahunLahir >= 1995 && tahunLahir <= 2015) {
            System.out.print("Generasi Z.");
        }
    }
}