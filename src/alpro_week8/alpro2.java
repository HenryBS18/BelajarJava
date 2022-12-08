package alpro_week8;

import java.util.*;

public class alpro2 {
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //Declare
        int inputKontak;
        String inputName, choose;
        boolean run = true;

        //Input Sum Of Contact
        System.out.print("Number Of Contacts? ");
        inputKontak = scan.nextInt();

        System.out.println("=== CONTACTS ===");
        System.out.println("== Add Contact ==");
        System.out.println("=================");

        //Declare Array
        String[][] data = new String[inputKontak][2];

        //Input Into Array
        for (int i = 0; i < inputKontak; i++) {
            //Input Name
            System.out.print("Name - " + (i + 1) + " : ");
            data[i][0] = scan2.nextLine();

            //Input Phone Number
            System.out.print("Phone Number - " + (i + 1) + " : ");
            data[i][1] = scan2.nextLine();    
        }
        while (run) {
            //Declare
            int nilai = 0;

            System.out.println();
            
            System.out.println("====================");
            System.out.println("== Search Contact ==");
            System.out.println("====================");

            //Input Name
            System.out.print("Contact Name : ");
            inputName = scan2.nextLine();

            for (int i = 0; i < data.length; i++) {
                if (inputName.equalsIgnoreCase(data[i][0])) {
                    System.out.println(data[i][0] + "'s number is " + data[i][1]);
                    nilai = 1;
                }
            }

            if (nilai != 1) {
                System.out.println("Sorry, can't find " + inputName);
            }

            //Choose Again
            System.out.print("Search Again? (Y/N) : ");
            choose = scan2.nextLine();

            if (choose.equalsIgnoreCase("y")) {
                run = true;
            }
            else if (choose.equalsIgnoreCase("n")) {
                run = false;
            }
        }      
    }
}
