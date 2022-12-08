package alpro_week9;

import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Declare Array
        String[][] room = new String[3][4];

        // Input
        System.out.println("HOTEL VIA SECURITY CODE");
        System.out.println("======================");
        System.out.println("Input Kode Kunci :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Lantai " + (i + 1) + " Kamar " + (j + 1) + " : ");
                room[i][j] = scan.nextLine();

                while (room[i][j].length() != 3) {
                    System.out.print("Lantai " + (i + 1) + " Kamar " + (j + 1) + " : ");
                    room[i][j] = scan.nextLine();
                }
            }
        }

        // Output & Check Condition
        System.out.println("Poppy Mungkin berada di :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (room[i][j].contains("1") || room[i][j].contains("2") || room[i][j].contains("3")
                        || room[i][j].contains("4") || room[i][j].contains("5") || room[i][j].contains("6")) {
                } 
                else {
                    System.out.println("Lantai " + (i + 1) + " Kamar " + (j + 1));
                }
            }
        }
    }
}
