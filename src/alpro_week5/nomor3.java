package alpro_week5;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int uang, uangBersih, saku;
        int toy = 10, toy2 = 15, toy3 = 25;
        int sisa, sisa2, sisa3, sisaUang;
        int totalToy, totalToy2, totalToy3, jumlahToy;

        //Input
        try {
            System.out.print("Jumlah uang anda : ");
            uang = scan.nextInt();
        } 
        finally {
            scan.close();
        }

        //Condition
        if (uang < 15) {
            System.out.println("Uang anda tidak cukup");
        }
        else if (uang > 14) {

            //Rumus
            //Uang Yang Dapat Digunakan
            uangBersih = uang - (uang*30)/100;

            //Uang Yang Harus Disimpan Sebanyak 30% Dari Uang Saku
            saku = uang - uangBersih;

            //Mainan Harga $25
            totalToy = uangBersih / toy3;
            sisa = uangBersih % toy3;

            //Mainan Harga $15
            totalToy2 = sisa / toy2;
            sisa2 = sisa % toy2;

            //Maiaan Harga $10
            totalToy3 = sisa2 / toy;

            //Uang Sisa Yang Dapat Digunakan
            sisa3 = sisa2 % toy; 

            //Jumlah Mainan Yang Dapat Dibeli
            jumlahToy = totalToy + totalToy2 + totalToy3;

            //Uang User Saat ini
            sisaUang = sisa3 + saku;


            //Output
            // System.out.println("Uang yang dapat digunakan : " + uangBersih);
            // System.out.println("Sisa uang yang dapat anda gunakan : " + sisa3);

            System.out.println("Jumlah Mainan $10 : " + totalToy3);
            System.out.println("Jumlah Mainan $15 : " + totalToy2);
            System.out.println("Jumlah Mainan $25 : " + totalToy);
            
            System.out.println("Jumlah Mainan : " + jumlahToy);
            System.out.println("Sisa uang anda sekarang : " + sisaUang);
        }
    }
}