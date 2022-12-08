package alpro_week8;

import java.util.Scanner;

public class alpro3 {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);
        Scanner cek = new Scanner(System.in);

        // Declare
        int jumlahChecklist, inputCheck, i;
        boolean run = true;

        // Input Jumlah Checklist
        System.out.print("Masukkan Jumlah Checklist : ");
        jumlahChecklist = scan.nextInt();

        // Declare Array
        String[][] checklist = new String[jumlahChecklist][2];

        // Input Checklist
        for (i = 0; i < jumlahChecklist; i++) {
            System.out.print("Checklist " + (i + 1) + " = ");
            checklist[i][0] = cek.nextLine();
            checklist[i][1] = "Not Done";
        }
        System.out.println();

        //Program
        while (run) {
            // Main
            System.out.println("=================");
            System.out.println("    Checklist    ");
            System.out.println("-----------------");

            for (i = 0; i < checklist.length; i++) {
                System.out.println((i+1) + ". " + checklist[i][0] + " - " + checklist[i][1]);
            }
            System.out.println("=================");

            // Second
            System.out.println("1. Update Checklist");
            System.out.println("2. Exit");

            // Choose
            System.out.print("Input : ");
            inputCheck = scan.nextInt();

            if (inputCheck == 1) {
                //Update Checklist
                System.out.println("------------------------------");
                System.out.println("       Update Checklist       ");
                System.out.println("------------------------------");

                for (i = 0; i < checklist.length; i++) {
                    System.out.println((i+1) + ". " + checklist[i][0] + " - " + checklist[i][1]);
                }

                //Choose Checklist To Update
                System.out.print("No : ");
                i = scan.nextInt();

                i = i - 1;

                System.out.println("!! Checklist Updated !!");

                //Condition
                if (i < checklist.length && i >= 0) {
                    checklist[i][1] = "Done";
                }
            }
            else if (inputCheck == 2) {
                run = false;
            }
        }
    }
}
