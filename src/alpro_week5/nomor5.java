package alpro_week5;
import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int kembalian, uang, uang2, uang3, uang4;
        int uangSisa;

        //Input
        try {
            System.out.print("Masukkan kembalian : ");
            kembalian = scan.nextInt();
        } 
        finally {
            scan.close();
        }

        //Rumus
        uang = kembalian / 1000;
        uangSisa = kembalian % 1000;

        uang2 = uangSisa / 500;
        uangSisa = uangSisa % 500;
        
        uang3 = uangSisa / 200;
        uangSisa = uangSisa % 200;

        uang4 = uangSisa / 100;

        //Output
        if (uang != 0) {
            System.out.println("Uang 1000 : " + uang);
        }
        if (uang2 != 0) {
            System.out.println("Uang 500 : " + uang2);
        }
        if (uang3 != 0) {    
            System.out.println("Uang 200 : " + uang3);
        }
        if (uang4 != 0) {
            System.out.println("Uang 100 : " + uang4);
        }
    }
}