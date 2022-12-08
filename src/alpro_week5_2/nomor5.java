package alpro_week5_2;
import java.util.Scanner; //Memasukkan function Scanner kedalam project

public class nomor5 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in); //Membuat Scanner dengan nama scan

        //Declare
        double saa1, saa2, saa3, uts, uas, nilaiAkhir; //Deklarasi double

        //Input
        try {
            System.out.print("SAA1 : "); //Input data
            saa1 = scan.nextDouble();

            System.out.print("SAA2 : "); //Input data
            saa2 = scan.nextDouble();

            System.out.print("SAA3 : "); //Input data
            saa3 = scan.nextDouble();

            System.out.print("UTS : "); //Input data
            uts = scan.nextDouble();

            System.out.print("UAS : "); //Input data
            uas = scan.nextDouble();
        }
        finally {
            scan.close();
        }

        //Rumus
        nilaiAkhir = (saa1 + saa2 + saa3 + uts + uas)/5; //Rumus nilai akhir
        
        //Condition & Output
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.print("Nilai Huruf : ");

        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            System.out.print("A");
        }
        else if (nilaiAkhir >= 80.00 && nilaiAkhir <= 84.99) {
            System.out.print("A-");
        }
        else if (nilaiAkhir >= 75.00 && nilaiAkhir <= 79.99) {
            System.out.print("B+");
        }
        else if (nilaiAkhir >= 70.00 && nilaiAkhir <= 74.99) {
            System.out.print("B");
        }
        else if (nilaiAkhir >= 65.00 && nilaiAkhir <= 69.99) {
            System.out.print("B-");
        }
        else if (nilaiAkhir >= 60.00 && nilaiAkhir <= 64.99) {
            System.out.print("C+");
        }
        else if (nilaiAkhir >= 55.00 && nilaiAkhir <= 59.99) {
            System.out.print("C");
        }
        else if (nilaiAkhir >= 45.00 && nilaiAkhir <= 54.99) {
            System.out.print("D");
        }
        else if (nilaiAkhir >= 0 && nilaiAkhir <= 44.99) {
            System.out.print("E");
        }   
    }
}