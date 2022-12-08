package alpro_week6;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //Declare
        int input, pilihan, i = 0;
        double inputAngka, jumlah = 0;
        String ulangi, lagi;
        boolean run = true, run2 = true, run3 = true, run4 = true, run5 = true, run6 = true;

        while (run) {
            //Main
            System.out.println("===============");
            System.out.println("CALCULATOR");
            System.out.println("===============");

            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Pembagian");
            System.out.println("4. Pangkat");
            System.out.println("5. Akar");

            System.out.print("Pilihan Anda : ");
            pilihan = scan.nextInt();
            

            switch (pilihan) {
                case 1 :
                    while (run2) {
                        //Input
                        System.out.print("Input : ");
                        input = scan.nextInt();

                        System.out.println("===============");
                        System.out.println("Penjumlahan");
                        System.out.println("===============");

                        //Declare
                        i = 0;
                        jumlah = 0;

                        //Loop Condition
                        do {
                            i++;
                            System.out.print("Angka ke-" + i + " : ");
                            inputAngka = scan.nextDouble();

                            //Rumus
                            jumlah = jumlah + inputAngka;
                        }
                        while (i < input);

                        //Output
                        System.out.println("Hasil = " + jumlah);

                        //ulangi
                        System.out.print("Ulangi lagi (Y/N)? ");
                        ulangi = scan2.nextLine();

                        //Choose Again
                        if (ulangi.equalsIgnoreCase("y")) {
                            run2 = true;
                        }
                        else if (ulangi.equalsIgnoreCase("n")) {
                            run2 = false;
                        }

                        //Back To Main Menu
                        if (run2 == false) {
                            System.out.print("Pakai Metode Calculator lain (Y/N)? ");
                            lagi = scan2.nextLine();

                            if (lagi.equalsIgnoreCase("y")) {
                                run = true;
                            }
                            else if (lagi.equalsIgnoreCase("n")) {
                                run = false;
                            }
                        }
                    }
                break;

                case 2 :
                    while (run3) {
                        //Input
                        System.out.print("Input : ");
                        input = scan.nextInt();

                        System.out.println("===============");
                        System.out.println("Perkalian");
                        System.out.println("===============");

                        //Declare
                        jumlah = 1;
                        i = 0;

                        //Loop Condition
                        do {
                            i++;
                            System.out.print("Angka ke-" + i + " : ");
                            inputAngka = scan.nextDouble();

                            //Rumus
                            jumlah = jumlah * inputAngka;
                        }
                        while (i < input);

                        //Output
                        System.out.println("Hasil = " + jumlah);

                        //ulangi
                        System.out.print("Ulangi lagi (Y/N)? ");
                        ulangi = scan2.nextLine();

                        if (ulangi.equalsIgnoreCase("y")) {
                            run3 = true;
                        }
                        else if (ulangi.equalsIgnoreCase("n")) {
                            run3 = false;
                        }

                        //Back To Main Menu
                        if (run3 == false) {
                            System.out.print("Pakai Metode Calculator lain (Y/N)? ");
                            lagi = scan2.nextLine();

                            if (lagi.equalsIgnoreCase("y")) {
                                run = true;
                            }
                            else if (lagi.equalsIgnoreCase("n")) {
                                run = false;
                            }
                        }
                    }
                break;

                case 3 :
                    while (run4) {
                        //Input
                        System.out.print("Input : ");
                        input = scan.nextInt();

                        System.out.println("================");
                        System.out.println("Pembagian");
                        System.out.println("================");
                        
                        //Declare
                        i = 0;
                        jumlah = 0;

                        //Loop Condition
                        do {
                            if (i == 0) {
                                i++;
                                System.out.print("Angka ke-" + i + " : ");
                                inputAngka = scan.nextDouble();
                                
                                jumlah = inputAngka;
                            } 
                            else {
                                i++;
                                System.out.print("Angka ke-" + i + " : ");
                                inputAngka = scan.nextDouble();

                                jumlah = jumlah / inputAngka;
                            }
                        }
                        while (i < input);

                        //Output
                        System.out.println("Hasil = " + jumlah);

                        //ulangi
                        System.out.print("Ulangi lagi (Y/N)? ");
                        ulangi = scan2.nextLine();

                        if (ulangi.equalsIgnoreCase("y")) {
                            run4 = true;
                        }
                        else if (ulangi.equalsIgnoreCase("n")) {
                            run4 = false;
                        }

                        //Back To Main Menu
                        if (run4 == false) {
                            System.out.print("Pakai Metode Calculator lain (Y/N)? ");
                            lagi = scan2.nextLine();

                            if (lagi.equalsIgnoreCase("y")) {
                                run = true;
                            }
                            else if (lagi.equalsIgnoreCase("n")) {
                                run = false;
                            }
                        }
                    }
                break;

                case 4 :
                    //Declare
                    run5 = true;

                    while (run5) {
                        System.out.println("================");
                        System.out.println("Pangkat");
                        System.out.println("================");

                        //Choice
                        System.out.println("1. Jumlah");
                        System.out.println("2. Kurang");
                        
                        System.out.print("Pilihan Anda : ");
                        pilihan = scan.nextInt();

                        if (pilihan == 1) {
                            System.out.println("================");
                            System.out.println("Pangkat (Jumlah)");
                            System.out.println("================");
                        }
                        else if (pilihan == 2) {
                            System.out.println("================");
                            System.out.println("Pangkat (Kurang)");
                            System.out.println("================");
                        }

                        //Declare
                        i = 0;
                        jumlah = 0;

                        //Case
                        switch (pilihan) {
                            case 1 :
                                //Input
                                System.out.print("Input Angka : ");
                                input = scan.nextInt();

                                //Loop Condition
                                do {
                                    i++;
                                    System.out.print("Angka ke-" + i + " : ");
                                    inputAngka = scan.nextDouble();

                                    //Rumus
                                    jumlah = jumlah + Math.pow(inputAngka, 2);
                                }
                                
                                while (i < input);
                                
                                //Output
                                System.out.println("Hasil = " + jumlah);
                            break;

                            case 2 :
                                //Input
                                System.out.print("Input Angka : ");
                                input = scan.nextInt();

                                //Declare
                                jumlah = 0;

                                //Loop Condition
                                do {
                                    if (i == 0) {
                                        i++;
                                        System.out.print("Angka ke-" + i + " : ");
                                        inputAngka = scan.nextDouble();
                                        
                                        jumlah = Math.pow(inputAngka, 2);
                                    } 
                                    else {
                                        i++;
                                        System.out.print("Angka ke-" + i + " : ");
                                        inputAngka = scan.nextDouble();

                                        jumlah = jumlah - Math.pow(inputAngka, 2);
                                    }
                                }
                                while (i < input);
                                
                                //Output
                                System.out.println("Hasil = " + jumlah);
                            break;
                        }
                        
                        //ulangi
                        System.out.print("Ulangi lagi (Y/N)? ");
                        ulangi = scan2.nextLine();

                        if (ulangi.equalsIgnoreCase("y")) {
                            run5 = true;
                        }
                        else if (ulangi.equalsIgnoreCase("n")) {
                            run5 = false;
                        }

                        //Back To Main Menu
                        if (run5 == false) {
                            System.out.print("Pakai Metode Calculator lain (Y/N)? ");
                            lagi = scan2.nextLine();

                            if (lagi.equalsIgnoreCase("y")) {
                                run = true;
                            }
                            else if (lagi.equalsIgnoreCase("n")) {
                                run = false;
                            }
                        }
                    }
                    break;

                case 5 :
                    while (run6) {
                        //Input
                        System.out.print("Input Angka : ");
                        inputAngka = scan.nextInt();

                        System.out.println("================");
                        System.out.println("Akar");
                        System.out.println("================");

                        //Rumus
                        jumlah = Math.sqrt(inputAngka);
                        
                        //Output
                        System.out.println("Hasil = " + jumlah);

                        //ulangi
                        System.out.print("Ulangi lagi (Y/N)? ");
                        ulangi = scan2.nextLine();

                        if (ulangi.equalsIgnoreCase("y")) {
                            run6 = true;
                        }
                        else if (ulangi.equalsIgnoreCase("n")) {
                            run6 = false;
                        }

                        //Back To Main Menu
                        if (run6 == false) {
                            System.out.print("Pakai Metode Calculator lain (Y/N)? ");
                            lagi = scan2.nextLine();

                            if (lagi.equalsIgnoreCase("y")) {
                                run = true;
                            }
                            else if (lagi.equalsIgnoreCase("n")) {
                                run = false;
                            }
                        }
                    }
                break;
            }
        }
    }
}
