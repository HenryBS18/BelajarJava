package alpro_week5;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        String namaGame;
        int koin, gameA = 12, gameB = 15, sisa, sisa2, main, main2;
        
        //Input
        try {
            System.out.print("Game apa : ");
            namaGame = scan.nextLine();
            
            System.out.print("Masukkan jumlah koin : ");
            koin = scan.nextInt();
        } 
        finally {
            scan.close();
        }

        //Condition & Output
        if (namaGame.equalsIgnoreCase("game a")) {
            sisa = koin % gameA;
            System.out.println("Sisa gameA : " + sisa);

            main = koin / gameA;
            System.out.println("Pemainan : " + main + "x");
        }    
        else if (namaGame.equalsIgnoreCase("game b")) {
            sisa2 = koin % gameB;
            System.out.println("Sisa gameB : " + sisa2);

            main2 = koin / gameB;
            System.out.println("Pemainan : " + main2 + "x");
        }
    }
}