package alpro_week6;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        String nama;
        int health = 5, hungry = 2, mood = 2, clean = 4;
        int interaksi;

        //Main
        System.out.println("TamaGotchi");
        System.out.println("");

        //Input
        System.out.print("Beri Nama Pet : ");
        nama = scan.nextLine();

        //Output
        do {
            System.out.println("Pet : " + nama);

            System.out.println("Health : " + health);
            System.out.println("Hungry : " + hungry);
            System.out.println("Mood : " + mood);
            System.out.println("Clean : " + clean);
            
            System.out.println("1. Makan");
            System.out.println("2. Mandi");
            System.out.println("3. Main");
            System.out.println("4. Tidur");
            System.out.println("5. Exit");


            System.out.println("");

            System.out.print("Interaksi : ");
            interaksi = scan.nextInt();


            //Condition
            if (interaksi == 1) {
                hungry = hungry + 2;
            }
            if (interaksi == 2) {
                clean = 5;
                mood = mood - 1;
            }
            if (interaksi == 3) {
                mood = mood + 2;
                clean = clean - 1;
                hungry = hungry - 2;
            }
            if (interaksi == 4) {
                health = health + 1;
                hungry = hungry - 1;
            }

            //Cek Atribut
            if (hungry < 1 || hungry > 5) {
                health = health - 1;
            }
            if (mood < 1 || mood > 5) {
                health = health - 1;
            }
            if (clean < 1 || clean > 5) {
                health = health - 1;
            }

            if (health <= 0) {
                interaksi = 5;
            }
        }
        while (interaksi != 5);
    }
}
