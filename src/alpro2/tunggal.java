package alpro2;
import java.util.Scanner;

public class tunggal {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //declare
        String i;

        //input
        try {
        System.out.print("Apakah anda sudah makan? ");
        i = scan.nextLine();
        } finally {
        scan.close();
        }

        //Condition & Output
        if (i.equalsIgnoreCase("sudah")) {
            System.out.println("Mantap");
        }
    }
}








