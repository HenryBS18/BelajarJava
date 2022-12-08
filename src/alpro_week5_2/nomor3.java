package alpro_week5_2;
import java.util.Scanner; //Memasukkan function Scanner kedalam project

public class nomor3 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in); //Membuat Scanner dengana nama scan

        //Declare
        int bulan, tahun; //Deklarasi integer

        //Input
        try {
            System.out.print("Masukkan Bulan : "); //Input data
            bulan = scan.nextInt();

            System.out.print("Masukkan Tahun : "); //Input data
            tahun = scan.nextInt();
        }
        finally {
            scan.close();
        }
        
        //Condition & Output
        switch (bulan) {
            case 1, 3, 5, 7, 8, 10, 12 :
                
                System.out.print("Terdapat 31 hari pada bulan ");

                if (bulan == 1) {
                    System.out.print("Januari");
                }
                else if (bulan == 3) {
                    System.out.print("Maret");
                }
                else if (bulan == 5) {
                    System.out.print("Mei");
                }
                else if (bulan == 7) {
                    System.out.print("Juli");
                }
                else if (bulan == 8) {
                    System.out.print("Agustus");
                }
                else if (bulan == 10) {
                    System.out.print("Oktober");
                }
                else if (bulan == 12) {
                    System.out.print("Desember");
                }
                
                System.out.print(" " + tahun);
            break;

            case 2 :
                //Kabisat
                if (tahun % 400 == 0) {
                    System.out.print("Terdapat 29 hari pada bulan Februari " + tahun);
                }
                
                else if (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 == 0) {
                    System.out.print("Terdapat 29 hari pada bulan Februari " + tahun);
                }

                //Bukan Kabisat
                else if (tahun % 400 != 0 && tahun % 100 == 0) {
                    System.out.println("Terdapat 28 hari pada bulan Februari " + tahun);
                }

                else if (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 != 0) {
                    System.out.println("Terdapat 28 hari pada bulan Februari " + tahun);
                }
            break;

            case 4, 6, 9, 11 :
                System.out.print("Terdapat 30 hari pada bulan ");
                
                if (bulan == 4) {
                    System.out.print("April");
                }
                else if (bulan == 6) {
                    System.out.print("Juni");
                }
                else if (bulan == 9) {
                    System.out.print("September");
                }
                else if (bulan == 11) {
                    System.out.print("November");
                }
                
                System.out.print(" " + tahun);
            break;
        }
    }
}