package alpro_week10;

import java.util.Scanner;

public class kasir {
    // Scanner
    static Scanner scanInputMenu = new Scanner(System.in);
    static Scanner scanTambah = new Scanner(System.in);
    static Scanner scanPilihLagi = new Scanner(System.in);

    // Declare Array Menu
    static String[] menu = { "Tambah barang", "Lihat List barang", "Checkout barang", "Exit" };

    // Declare Array Isi Barang
    static String[][] dataBarang = new String[20][3];

    // Declare Variables
    static int chooseMenu, i = 0, total;
    static String chooseAgain;
    static boolean run = true, runTambahBarang = true, update;

    public static void main(String[] args) {
        while (run) {
            

            // Main Menu
            mainMenu();

            // Input Choose Menu
            System.out.print("Menu : ");
            chooseMenu = scanInputMenu.nextInt();

            // Switch Menu
            switch (chooseMenu) {
                case 1:
                    tambahBarang();
                    break;

                case 2:
                    lihatListBarang();
                    break;

                case 3:
                    checkoutBarang();
                    break;

                case 4:
                    run = false;
                    break;
            }

        }
    }

    static void mainMenu() {
        // Main Menu
        System.out.println("=================");
        System.out.println("      Kasir      ");
        System.out.println("=================");

        for (int i = 0; i < 4;) {
            for (String element : menu) {
                i++;
                System.out.println(i + ". " + element);
            }
        }
    }

    // 1. Tambah Barang
    static void tambahBarang() {
        while (runTambahBarang) {
            
            // Title
            System.out.println("=============");
            System.out.println("Tambah Barang");
            System.out.println("=============");

            System.out.print("Nama barang : ");
            dataBarang[i][0] = scanTambah.nextLine();

            System.out.print("Harga barang : ");
            dataBarang[i][1] = scanTambah.nextLine();

            System.out.print("Jumlah barang : ");
            dataBarang[i][2] = scanTambah.nextLine();

            // Barang Sudah Ditambahkan
            System.out.println("====================");
            System.out.println("Barang Ditambahkan!!");
            System.out.println("====================");

            // Tambah Lagi
            System.out.print("Tambah barang lagi (Y/N)? ");
            chooseAgain = scanPilihLagi.nextLine();

            //Tambah Lagi Condition
            if (chooseAgain.equalsIgnoreCase("Y")) {
                runTambahBarang = true;
            }
            else {
                return;
            }
            i++;
        }

        // Update Barang
        for (int i = 0; i < dataBarang.length; i++) {
            if (dataBarang[i][0] == dataBarang[i][0]) {
                if (dataBarang[i][1] != dataBarang[i][1]) {
                    update = true;
                }
            }
        }
        if (update) {
            System.out.println("=============================================================================");
            System.out.println("Barang " + /* Nama Barang */ " sudah ada. Harga dan jumlah barang akan diupdate!!");
            System.out.println("=============================================================================");
        }

        // Tambah Lagi
        System.out.print("Tambah barang lagi (Y/N)? ");
        chooseAgain = scanPilihLagi.nextLine();
    }

    // 2. Lihat List Barang
    static Integer lihatListBarang() {
        System.out.println("No | Nama | Harga | Jumlah | Total harga");

        total = Integer.valueOf(dataBarang[i][1]) + Integer.valueOf(dataBarang[i][2]);

        System.out.println();
        for (int i = 0; i < dataBarang.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (dataBarang[i][j] != null) {
                    System.out.println((i + 1) + ". " + dataBarang[i][0] + " | " + dataBarang[i][1] + " | " + dataBarang[i][2] + " | " + total);
                }
            }
        }
        System.out.println();

        return total;
    }

    // 3. Checkout Barang
    static void checkoutBarang() {

    }

}
