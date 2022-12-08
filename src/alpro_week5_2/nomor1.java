package alpro_week5_2;
import java.util.Scanner; //Masukkan function Scanner kedalam project

public class nomor1 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in); //Membuat Scanner dengan nama scan

        //Declare
        int kode; //Deklarasi integer

        //Input
        try {    
            System.out.print("Masukkan kode : "); //Input data
            kode = scan.nextInt();
        }
        finally {
            scan.close();
        }

        //Condition & Output
        switch (kode) {
            case 1 :
                System.out.println("Alat Olahraga"); //Jika input = 1, maka print "Alat Olahraga"
                break;
            case 2 :
                System.out.println("Alat Eletronik"); //Jika input = 2, maka print "Alat Eletronik"
                break;
            case 3 :
                System.out.println("Alat Masak"); //Jika input = 3, maka print "Alat Masak"
                break;
            default :
                System.out.println("Anda Salah Memasukkan Kode"); //Jika input selain 1, 2, 3. maka print "Anda Salah Memasukkan Kode"
        }   
    }
}