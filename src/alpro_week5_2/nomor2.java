package alpro_week5_2;
import java.util.Scanner; //Memasukkan function Scanner kedalam project

public class nomor2 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in); //Membuat Scanner dengan nama scan

        //Declare
        int tahun; //Deklarasi integer
        
        //Input
        try {
            System.out.print("Masukkan Tahun : "); //Input data
            tahun = scan.nextInt();
        }
        finally {
            scan.close();
        }
        
        //Condition & Output
        if (tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " Merupakan Tahun Kabisat"); 
        }
        else if (tahun % 400 != 0 && tahun % 100 == 0) {
            System.out.println("Tahun " + tahun + " Bukan Merupakan Tahun Kabisat");   
        }
        else if (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 == 0) {
            System.out.println("Tahun " + tahun + " Merupakan Tahun Kabisat");
        }
        else if (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 != 0) {
            System.out.println("Tahun " + tahun + " Bukan Merupakan Tahun Kabisat");
        }
    }
}