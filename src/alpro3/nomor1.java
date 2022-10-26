package alpro3;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int umur;

        //Input
        try {
            System.out.print("Umur anda : ");
            umur = scan.nextInt();

            //Rumus
            if (umur >= 17) {

                //Scanner
                Scanner kerjaan = new Scanner(System.in);

                //Declare
                String kerja;
                int income;
        
                //Input
                try {
                    System.out.print("Apakah anda memiliki pekerjaan : ");
                    kerja = kerjaan.nextLine();
            
                    //Condition & Output
                    if (kerja.equalsIgnoreCase("tidak")) {
                        System.out.println("Miskin");
                    }
                    else if (kerja.equalsIgnoreCase("ya")) {
                        System.out.print("Penghasilan anda : ");
                        income = kerjaan.nextInt();

                        if (income >= 300000) {
                            System.out.println("Tidak miskin");
                        }
                        else {
                            System.out.println("Miskin");
                        }
                    }
                } finally {
                    kerjaan.close();
                }
            }
        } 
        finally {
            scan.close();
        }
    }    
}