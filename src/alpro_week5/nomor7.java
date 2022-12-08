package alpro_week5;
import java.util.Scanner;

public class nomor7 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int pilihan;
        int hargaIcon, hargaIlustrasi, stockIlustrasi = 1, stockIcon;
        int hargaIlustrasiNaik, hargaIconNaik;
        double profitIlustrasi, profitIcon;

        //Input
        System.out.println("Welcome To Microstock!");
        System.out.println("1. Design Ilustrasi");
        System.out.println("2. Design Icon");

        try {
            System.out.print("Masukkan Pilihan Anda (1/2) : ");
            pilihan = scan.nextInt();
            
            
            //Condition
            if (pilihan == 1) {
                    
                //Input
                System.out.print("Masukkan Harga Design Ilustrasi : ");
                hargaIlustrasi = scan.nextInt();

                //Rumus
                hargaIlustrasiNaik = hargaIlustrasi + (hargaIlustrasi * 30)/100;
                profitIlustrasi = hargaIlustrasiNaik * stockIlustrasi;

                //Output
                System.out.println("Gross Profit : " + String.format("%,.0f", profitIlustrasi));

            }
            else if (pilihan == 2) {
                    
                //Input
                System.out.print("Masukkan Harga Design Icon : ");
                hargaIcon = scan.nextInt();

                System.out.print("Masukkan Stock Design Icon : ");
                stockIcon = scan.nextInt();
                    
                //Rumus
                hargaIconNaik = hargaIcon + (hargaIcon * 20)/100;
                profitIcon = hargaIconNaik * stockIcon;

                //Output
                System.out.println("Gross Profit : " + String.format("%,.0f", profitIcon));
            }

        } finally {
            scan.close();
        } 
    }
}