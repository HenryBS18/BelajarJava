package mine;
import java.util.Scanner;

public class ara {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
            
        //Declare
        double i, ara, ara2, ara3;
        double p=0.35, p2=0.25, p3=0.20;

        //Input Number
        try {
        System.out.print("Masukkan Angka : ");
        i = input.nextInt();
        }
        finally {
            input.close();
        }
        //ara condition
        ara = i + (i*p);
        ara2 = i + (i*p2);
        ara3 = i + (i*p3);

        //Condition & Output
        if (i < 200) {
            System.out.println(Math.round(ara));
        }
        else if (i <= 1000) {
            System.out.println(Math.round(ara2));
        }
        else {
            System.out.println(Math.round(ara3));
        }
    }
}
