package alpro;
import java.util.Scanner;

public class lulus {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int nilai;
        
        //Input
        try {
        System.out.print("Masukkan Nilai Anda : ");
        nilai = scan.nextInt();
        } finally {
            scan.close();
        }

        //Condition & Output
        if (nilai >= 75) {
            System.out.print("Lulus");
        }
        else {
            System.out.println("Tidak Lulus");
        }
    }
}