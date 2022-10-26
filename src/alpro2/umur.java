package alpro2;
import java.util.Scanner;

public class umur {
    public static void main(String[] args) {

        //scanner
        Scanner scan = new Scanner(System.in);

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

        //output
        System.out.print(nama + ", Berdasarkan tahun lahir anda tergolong ");

        //Condition
        if (tahunLahir >= 1944 && tahunLahir <= 1964) {
            System.out.print("Baby Boomer");
        }
        else if (tahunLahir >= 1965 && tahunLahir <= 1979) {
            System.out.print("Generasi X");
        }
        else if (tahunLahir >= 1980 && tahunLahir <= 1994) {
            System.out.print("Generasi Y");
        }
        else if (tahunLahir >= 1995 && tahunLahir <= 2015) {
            System.out.print("Generasi Z");
        }
        else {
            System.out.print("Generasi .");
        }
    }
}
