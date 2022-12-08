package alpro_week5_2;
import java.util.Scanner; //Memasukkan function Scanner kedalam project
import java.lang.Math; //Memasukkan function Math kedalam project

public class nomor4 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in); //Membuat scanner dengan nama scan

        //Declare
        double bmi;                           //Deklarasi double
        int kelamin, beratBadan, tinggiBadan; //Deklarasi integer

        //Main
        System.out.println("==============");
        System.out.println("BMI CALCULATOR");
        System.out.println("==============");

        //Input
        System.out.println("1. Female");
        System.out.println("2. Male");
        
        try {
            System.out.print("Jenis Kelamin Anda (1/2): "); //Input data
            kelamin = scan.nextInt();

            //Condition & Output
            switch (kelamin) {
                case 1 :
                    //Input
                    System.out.print("Masukkan Tinggi Badan Anda : ");
                    tinggiBadan = scan.nextInt();

                    System.out.print("Masukkan Berat Badan Anda : ");
                    beratBadan = scan.nextInt();

                    //Rumus
                    bmi = beratBadan/Math.pow(tinggiBadan, 2)*10000;

                    //Output
                    System.out.println("BMI = " + String.format("%,.3f",bmi));
                    System.out.print("Anda termasuk Wanita yang ");

                    //Condition
                    if (bmi < 18) {
                        System.out.println("Kurus");
                    }
                    else if (bmi >= 18 && bmi <= 25) {
                        System.out.println("Normal");
                    }
                    else if (bmi >= 25 && bmi <= 27) {
                        System.out.println("Kegemukan");
                    }
                    else if (bmi >= 27) {
                        System.out.println("Obesitas");
                    }
                break;
                
                case 2 :
                    //Input
                    System.out.print("Masukkan Tinggi Badan Anda : ");
                    tinggiBadan = scan.nextInt();

                    System.out.print("Masukkan Berat Badan Anda : ");
                    beratBadan = scan.nextInt();

                    //Rumus
                    bmi = beratBadan/Math.pow(tinggiBadan, 2)*10000;

                    //Output
                    System.out.println("BMI = " + String.format("%,.3f", bmi));
                    System.out.print("Anda termasuk Pria yang ");

                    //Condition
                    if (bmi < 17) {
                        System.out.println("Kurus");
                    }
                    else if (bmi >= 17 && bmi <= 23) {
                        System.out.println("Normal");
                    }
                    else if (bmi >= 23 && bmi <= 27) {
                        System.out.println("Kegemukan");
                    }
                    else if (bmi >= 27) {
                        System.out.println("Obesitas");
                    }
                break;
            }
        }
        finally {
            scan.close();
        }
    }
}