package alpro_week8;

import java.util.*;

public class alpro {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //Deklarasi
        String cek;
        int pilih;
        boolean run = true;

        //Input Jumlah NIM
        System.out.print("Masukkan jumlah NIM : ");
        int inputNim = input.nextInt();

        //Deklarasi Array
        int[] Nim = new int[inputNim];

        //Input NIM
        for (int i = 0; i < inputNim; i++) {
            System.out.print("Nim " + (i + 1) + " : ");
            Nim[i] = input.nextInt();
        }

        //Program
        while (run) {
            System.out.println("===================");
            System.out.println("SORT NIM");
            System.out.println("===================");

            System.out.println("1. Dari Terkecil");
            System.out.println("2. Dari Terbesar");
            System.out.println("3. Exit");

            //Input
            System.out.print("INPUT : ");
            pilih = input.nextInt();

            //Terkecil ke besar
            if (pilih == 1) {
                for (int i = 0; i < Nim.length; i++) {
                    for (int j = i + 1; j < Nim.length; j++) {
                        int k = 0;
                        if (Nim[i] > Nim[j]) {
                            k = Nim[i];
                            Nim[i] = Nim[j];
                            Nim[j] = k;
                        }
                    }
                    System.out.println(Nim[i]);
                }

                //Cek
                System.out.print("Cek Lagi (Y/N)? ");
                cek = input2.nextLine();

                if (cek.equalsIgnoreCase("y")) {
                    run = true;
                } else if (cek.equalsIgnoreCase("n")) {
                    run = false;
                    System.out.println("Terima Kasih");
                }
            }

            //Terbesar ke kecil
            else if (pilih == 2) {
                for (int i = 0; i < Nim.length; i++) {
                    for (int j = i + 1; j < Nim.length; j++) {
                        int k = 0;
                        if (Nim[i] < Nim[j]) {
                            k = Nim[i];
                            Nim[i] = Nim[j];
                            Nim[j] = k;
                        }
                    }
                    System.out.println(Nim[i]);
                }

                //Cek
                System.out.print("Cek Lagi (Y/N)? ");
                cek = input2.nextLine();

                if (cek.equalsIgnoreCase("y")) {
                    run = true;
                } else if (cek.equalsIgnoreCase("n")) {
                    run = false;
                    System.out.println("Terima Kasih");
                }
            }

            //Exit
            else if (pilih == 3) {
                run = false;
                System.out.println("Terima Kasih");
            }
        }
    }
}
