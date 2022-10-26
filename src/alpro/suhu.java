package alpro;
import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);

        //Declare
        int i;

        double celcius, celcius2, celcius3; 
        double reamur, fahrenheit, kelvin;

        //Main
        System.out.println("Hai selamat datang");
        System.out.println("");
        
        //Decision
        System.out.println("Konversi Celcius ke : ");
        
        System.out.println("1. Reameur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("");
        
        System.out.print("Pilihan anda : ");
        try {
        i = scan.nextInt();
        
        //Condition, Input, Formula, Output
        if (i == 1) {
            System.out.print("Masukkan Celcius : ");
            celcius = scan.nextDouble();
            reamur = (0.8) * celcius;
            System.out.println("Celcius ~> Reamur : " + reamur);

        }
        else if (i == 2) {
            System.out.print("Masukkan celcius : ");
            celcius2 = scan.nextDouble();
            fahrenheit = (1.8) * celcius2 + 32;
            System.out.println("Celcius ~> Fahrenheit : " + fahrenheit);
        }
        else if (i == 3) {
            System.out.print("Masukkan celcius : ");
            celcius3 = scan.nextDouble();
            kelvin = celcius3 + 273;
            System.out.println("Celcius ~> Kelvin : " + kelvin);
        }
        } finally {
            scan.close();
        }
    }
}