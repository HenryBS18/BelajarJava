package alpro;
import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args){
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int i;

        //Input
        try {
            System.out.print("Masukkan Angka : ");
            i = scan.nextInt();
        } 
        finally {
            scan.close();
        }
        
        //Condition & Output
        if (i % 2 == 0) {
            System.out.println("Genap");
        } 
        else {
            System.out.println("Ganjil");
        }
    }
}