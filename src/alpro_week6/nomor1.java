package alpro_week6;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int i = 0, choice, input, hasil = 0;

        //Choice menu
        System.out.println("Deretan Angka :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pekalian");

        System.out.print("Pilihan Anda : ");
        choice = scan.nextInt();


        switch (choice) {
            case 1 :
                System.out.print("Input Angka : ");
                input = scan.nextInt();

                while (i < input) {
                    i++;
                    hasil = hasil + i;
                    
                    if (i == input) {
                    System.out.print(i);
                    }
                    else {
                        System.out.print(i + "+");
                    }
                }
                System.out.println("=" + hasil);
            break;

            case 2 :
                System.out.print("Input Angka : ");
                input = scan.nextInt();

                //Declare
                hasil = 1;
                i = 1;

                do {
                    hasil = hasil * i;

                    System.out.print(i);
                    i++;

                    if (i <= input) {
                        System.out.print("x");
                    }
                } 
                while (i <= input);
                    
                System.out.println("=" + hasil);
            break; 
        }
    }
}
