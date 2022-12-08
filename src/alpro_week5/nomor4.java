package alpro_week5;
import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int poin = 2000, kill1, kill2, kill3, ronde1, ronde2, ronde3;

        //Input
        try {
            System.out.print("Kill Ronde 1 : ");
            kill1 = scan.nextInt();

            System.out.print("Kill Ronde 2 : ");
            kill2 = scan.nextInt();

            System.out.print("Kill Ronde 3 : ");
            kill3 = scan.nextInt();
        }
        finally {
            scan.close();
        }

        //Rumus
        ronde1 = kill1 * poin;
        ronde2 = kill2 * poin;
        ronde3 = kill3 * poin;

        //Condition
        if (ronde1 >= ronde2 && ronde1 >= ronde3) {
            System.out.println("Highscore : Ronde 1");
            System.out.println("Total Poin : " + ronde1);
        }
        else if (ronde2 >= ronde1 && ronde2 >= ronde3) {
            System.out.println("Highscore : Ronde 2");
            System.out.println("Total Poin : " + ronde2);
        }
        else if (ronde3 >= ronde1 && ronde3 >= ronde2) {
            System.out.println("Highscore : Ronde 3");
            System.out.println("Total Poin : " + ronde3);
        }

        //Second Condition
        if (ronde1 == ronde2 && ronde3 < ronde1 && ronde3 < ronde2) {
            System.out.println("Highscore : Ronde 2");
            System.out.println("Total Poin : " + ronde2);
        }
        else if (ronde2 == ronde3 && ronde1 < ronde2 && ronde1 < ronde3) {
            System.out.println("Highscore : Ronde 3");
            System.out.println("Total Poin : " + ronde3);
        }
        else if (ronde1 == ronde3 && ronde2 < ronde1 && ronde2 < ronde3) {
            System.out.println("Highscore : Ronde 3");
            System.out.println("Total Poin : " + ronde3);
        }
        else if (ronde1 == ronde2 && ronde1 == ronde3) {
            System.out.println("Highscore : Ronde 3");
            System.out.println("Total Poin : " + ronde3);
        }
    }
}