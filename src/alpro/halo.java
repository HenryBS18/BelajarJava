package alpro;
import java.util.Scanner;

public class halo {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        String nama, kelamin, menikah;
    
        //Input
        try {
        System.out.print("Nama Anda : ");
        nama = scan.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        kelamin = scan.nextLine();

        System.out.print("Menikah (Y/T) : ");
        menikah = scan.nextLine();
        } finally {
            scan.close();
        }

        //Condition & Output
        if (kelamin.equalsIgnoreCase("L") && menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mr. " + nama);
        }
        else if (kelamin.equalsIgnoreCase("L") && menikah.equalsIgnoreCase("T")) {
            System.out.println("Hello, Mr. " + nama);
        }
        else if (kelamin.equalsIgnoreCase("P") && menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mrs. " + nama);
        }
        else if (kelamin.equalsIgnoreCase("P") && menikah.equalsIgnoreCase("T")){
            System.out.println("Hello, Ms. " + nama);
        }    
    }
}