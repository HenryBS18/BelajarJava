package alpro_week4;
import java.util.Scanner;

public class usia {
    public static void main(String[] args) {

        //Scanner
        Scanner scan =  new Scanner(System.in);

        //Declare
        int usia;

        //input
        try {
        System.out.print("Masukkan Usia : ");
        usia = scan.nextInt();
        } finally {
        scan.close();
        }
        
        //Condition
        if (usia <= 17) {
            System.out.println("Tidak boleh nonton");
        }
    }
}