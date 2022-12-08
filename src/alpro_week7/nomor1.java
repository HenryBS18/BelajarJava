package alpro_week7;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {

        //Scanner
        Scanner scan  = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
         //Declare Array
         String[] choose = {"Perhitungan", "Shape Generator", "Name Spelling", "Close App"};
        
        //Declare
        int pilih, pilih2, input;
        double hasil;
        String pilihLagi, name;
        boolean run = true, run2 = true, run3 = true, run4 = true, run5 = true;

        while (run) {
            //Declare
            int i = 1;
            
            //Main Menu
            System.out.println("==============");
            System.out.println("MOST BASIC APP");
            System.out.println("==============");

            while (i < 4) {
                for (String element : choose) {
                    System.out.println(i + ". " + element);
                    i++;
                }
            }

            //Choose Program
            System.out.print("Choose : ");
            pilih = scan.nextInt();
        
            //Declare boolean
            run2 = true;
            run4 = true;

            //Choose Menu
            switch (pilih) {
                //1. Perkalian
                case 1 :
                    while (run2) {
                        //Main
                        System.out.println("==============");
                        System.out.println("Perkalian");
                        System.out.println("==============");
                        
                        System.out.println("1. Normal");
                        System.out.println("2. Ganjil");
                        System.out.println("3. Genap");

                        //Input
                        System.out.print("Input : ");
                        pilih2 = scan.nextInt();

                        //Declare boolean
                        run3 = true;
                        run5 = true;

                        //Choose Perkalian
                        switch (pilih2) {
                            //Perkalian_Normal
                            case 1 :
                                while (run3) {
                                    //Main
                                    System.out.println("==============");
                                    System.out.println("Normal");
                                    System.out.println("==============");

                                    //Input
                                    System.out.print("Input Angka : ");
                                    input = scan.nextInt();
                    
                                    //Declare
                                    hasil = 1;
                                    i = 1;
                    
                                    //Loop
                                    do {
                                        hasil = hasil * i;
                    
                                        System.out.print(i);
                                        i++;
                    
                                        if (i <= input) {
                                            System.out.print("x");
                                        }
                                    } 
                                    while (i <= input);
                                    
                                    //Output
                                    System.out.println("");
                                    System.out.println("Hasil : " + String.format("%,.0f", hasil));
                            
                                    //Choose Again
                                    System.out.print("Gunakan Lagi (Y/N)? ");
                                    pilihLagi = scan2.nextLine();

                                    if (pilihLagi.equalsIgnoreCase("y")) {
                                        run3 = true;
                                    }
                                    else if (pilihLagi.equalsIgnoreCase("n")) {
                                        run3 = false;
                                    }

                                    //Back to Menu perkalian
                                    if (run3 == false) {
                                        System.out.print("Kembali ke menu perkalian (Y/N)? ");
                                        pilihLagi = scan2.nextLine();

                                        if (pilihLagi.equalsIgnoreCase("y")) {
                                            run2 = true;
                                        }
                                        else if (pilihLagi.equalsIgnoreCase("n")) {
                                            run2 = false;
                                        }
                                    }
                                }
                            break;
                            
                            //Perkalian_Ganjil
                            case 2 :
                                while (run3) {
                                    //Main
                                    System.out.println("==============");
                                    System.out.println("Ganjil");
                                    System.out.println("==============");
                                
                                    //Input
                                    System.out.print("Input Angka : ");
                                    input = scan.nextInt();

                                    //Declare
                                    int p = 1;
                                    hasil = 1;

                                    //Loop
                                    for (int k = 1; k <= input; k++){

                                        hasil = hasil * p;
                            
                                            System.out.print(p);
                                                if(k < input){
                            
                                                    System.out.print("x");
                                                }
                                                p+=2;
                                    }
                                    
                                    //Output
                                    System.out.println("");
                                    System.out.println("Hasil : " + String.format("%,.0f", hasil));

                                    //Choose Again
                                    System.out.print("Gunakan Lagi (Y/N)? ");
                                    pilihLagi = scan2.nextLine();

                                    if (pilihLagi.equalsIgnoreCase("y")) {
                                        run3 = true;
                                    }
                                    else if (pilihLagi.equalsIgnoreCase("n")) {
                                        run3 = false;
                                    }

                                    //Back to Menu perkalian
                                    if (run3 == false) {
                                        System.out.print("Kembali ke menu perkalian (Y/N)? ");
                                        pilihLagi = scan2.nextLine();

                                        if (pilihLagi.equalsIgnoreCase("y")) {
                                            run2 = true;
                                        }
                                        else if (pilihLagi.equalsIgnoreCase("n")) {
                                            run2 = false;
                                        }
                                    }
                                }
                            break;

                            //Perkalian_Genap
                            case 3 :
                                while (run3) {
                                    //Main
                                    System.out.println("==============");
                                    System.out.println("Genap");
                                    System.out.println("==============");
                                
                                    //Input
                                    System.out.print("Input Angka : ");
                                    input = scan.nextInt();

                                    //Declare
                                    int j = 2;
                                    hasil = 1;

                                    //Loop
                                    for (int k = 1; k <= input; k++){

                                        hasil = hasil * j;
                            
                                            System.out.print(j);
                                                if(k < input){
                            
                                                    System.out.print("x");
                                                }
                                                j+=2;
                                    }
                                    
                                    //Output
                                    System.out.println("");
                                    System.out.println("Hasil : " + String.format("%,.0f", hasil));

                                    //Choose Again
                                    System.out.print("Gunakan Lagi (Y/N)? ");
                                    pilihLagi = scan2.nextLine();

                                    if (pilihLagi.equalsIgnoreCase("y")) {
                                        run3 = true;
                                    }
                                    else if (pilihLagi.equalsIgnoreCase("n")) {
                                        run3 = false;
                                    }

                                    //Back to Menu perkalian
                                    if (run3 == false) {
                                        System.out.print("Kembali ke menu perkalian (Y/N)? ");
                                        pilihLagi = scan2.nextLine();

                                        if (pilihLagi.equalsIgnoreCase("y")) {
                                            run2 = true;
                                        }
                                        else if (pilihLagi.equalsIgnoreCase("n")) {
                                            run2 = false;
                                        }
                                    }
                                }
                            break;
                        }
                    }
                break;

                //2. Shape Generator
                case 2 :
                    while (run4) {
                        System.out.println("===============");
                        System.out.println("SHAPE GENERATOR");
                        System.out.println("===============");

                        System.out.println("1. Persegi");
                        System.out.println("2. Segitiga");

                        System.out.print("Pilih : ");
                        pilih = scan.nextInt();

                        System.out.println("===============");

                        //Choose Shape Generator
                        switch (pilih) {
                            //Shape Generator_Persegi
                            case 1 :
                                //Input
                                System.out.print("Panjang Sisi : ");
                                input = scan.nextInt();
                                
                                System.out.println("");

                                //Loop
                                for (int a = 1; a < input; a++) {
                                    System.out.print("#");
                                }
                                for (int a = 0; a < input-2; a++) {
                                    System.out.println("#");
                                    
                                    for (int j = 0; j < 1; j++) {
                                        System.out.print("#");
                                        
                                        for (int k = 0; k < input-2; k++) {
                                            System.out.print("0");
                                        }
                                    }
                                }
                                System.out.print("#");
                                System.out.println();
                        
                                for (int a = 0; a < input; a++) {
                                    System.out.print("#");
                                }
                                
                                System.out.println("");
                                System.out.println("");
                            break;

                            //Shape Generator_Segitiga
                            case 2 :
                                //Input
                                System.out.print("Tinggi & Alas : ");
                                input = scan.nextInt();

                                System.out.println("");
                                
                                //Loop
                                for (int a = input-2; a >= 0 ; a--) {

                                    for (int j = 0; j <= a; j++) {
                                        System.out.print("+");  
                                    }
                                    for (int k = 0; k <= input-a-2; k++) {
                                        System.out.print("#");
                                    }
                                    System.out.println();
                                }
                                for (int a = input-1; a >= 0 ; a--) {
                                    System.out.print("#");
                                }
                                System.out.println("");
                                System.out.println("");
                            break;
                        }

                        //Choose Again
                        System.out.print("Pilih Shape Lagi (Y/N)? ");
                        pilihLagi = scan2.nextLine();

                        if (pilihLagi.equalsIgnoreCase("y")) {
                            run4 = true;
                        }
                        else if (pilihLagi.equalsIgnoreCase("n")) {
                            run4 = false;
                        }
                    }
                break;

                //3. Name Spelling
                case 3 :
                    while (run5) {
                        //Main
                        System.out.println("===============");
                        System.out.println("Name Spelling");
                        System.out.println("===============");

                        //Input
                        System.out.print("Input Name : ");
                        name = scan2.nextLine();

                        //Loop
                        for (int z = 0; z <= name.length(); z++) {
                            //Output
                            System.out.println(name.substring(0, z));
                        }

                        //Choose Again
                        System.out.print("Gunakan Name Spelling Lagi (Y/N)? ");
                        pilihLagi = scan2.nextLine();

                        if (pilihLagi.equalsIgnoreCase("y")) {
                            run5 = true;
                        }
                        else if (pilihLagi.equalsIgnoreCase("n")) {
                            run5 = false;
                        }
                    }
                break;

                //4. Close App
                case 4 :
                    //Output
                    System.out.println("");
                    System.out.println("!!! Terima Kasih Sudah Menggunakan Aplikasi Ini !!!");
                    
                    //Boolean Condition
                    run = false;
                break;
            }
        }
    }
}