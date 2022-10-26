package alpro;
import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int jamKerja, jamKerjaLebih;
        double gajiKotor, pajak, gajiBersih;

        //Input
        try {
        System.out.print("Masukkan total jam kerja : ");
        jamKerja = scan.nextInt();
        } finally {
            scan.close();
        }

        //Condition & Output
        //Gaji Kotor
        if (jamKerja > 40) {
            jamKerjaLebih = jamKerja-40;
            gajiKotor = 40*6  + jamKerjaLebih*9;
            
            System.out.println("Gaji Kotor : " + gajiKotor);
        }
        else {
            gajiKotor = jamKerja*6;
            
            System.out.println("Gaji Kotor : " + gajiKotor);
        }

        //Pajak
        if (gajiKotor > 250) {
            pajak = gajiKotor*0.12;
            
            System.out.println("Pajak : " + pajak);
        }
        else {
            pajak = gajiKotor*0.1;
            
            System.out.println("Pajak : " + pajak);
        }

        //Gaji Bersih
        gajiBersih = gajiKotor - pajak;
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
}