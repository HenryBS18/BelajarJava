package alpro_week9_2;
import java.util.Scanner;

public class nomor1 {
    // Scanner
    static Scanner scan = new Scanner(System.in);
    static Scanner pilih = new Scanner(System.in);
    static Scanner inputData = new Scanner(System.in);

    // Declare Array
    static String[] room = new String[9];
    static String[][] data = new String[9][5];

    // Declare
    static int menu, pilihKamar;
    static boolean run = true, runMenu;
    static String yakinPilih;

    // Isi Kamar
    static void isiKamar() {
        for (int i = 0; i < room.length; i++) {
            System.out.print("[" + room[i] + "]");
            if (i == 2 || i == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Input Customer Data
    static void inputDataCustomer() {
        System.out.print("Nama : ");
        data[pilihKamar - 1][0] = inputData.nextLine();

        System.out.print("Alamat : ");
        data[pilihKamar - 1][1] = inputData.nextLine();

        System.out.print("No KTP : ");
        data[pilihKamar - 1][2] = inputData.nextLine();

        System.out.print("No Telp : ");
        data[pilihKamar - 1][3] = inputData.nextLine();

        System.out.print("Lama Menginap (dalam hari) : ");
        data[pilihKamar - 1][4] = inputData.nextLine();
    }

    public static void main(String[] args) {
        // Isi Array
        for (int i = 0; i < room.length; i++) {
            room[i] = " ";
        }

        while (run) {
            // Declare Boolean
            runMenu = true;

            // Main Menu
            System.out.println("Menu :");
            System.out.println("1. Reservasi Kamar");
            System.out.println("2. Ubah Pesanan");
            System.out.println("3. Batalkan Pesanan");
            System.out.println("4. Lihat Kamar");
            System.out.println("5. Exit");

            // Input
            System.out.print("Pilih : ");
            menu = scan.nextInt();

            //Run Program
            while (runMenu) {
                switch (menu) {
                    case 1:
                        // Main
                        System.out.println("=======================");
                        System.out.println("Reservasi Kamar");

                        // Isi Kamar
                        isiKamar();

                        do {
                            // Input Pesan Kamar
                            System.out.print("Pesan kamar nomor (0 untuk back) : ");
                            pilihKamar = pilih.nextInt();

                            // Back To Main Menu If Input = 0
                            if (pilihKamar == 0) {
                                runMenu = false;
                                break;
                            }

                            // Check availability
                            if (room[pilihKamar - 1].equalsIgnoreCase("X")) {
                                System.out.println("!! Kamar telah terisi oleh " + data[pilihKamar - 1][0] + " selama " + data[pilihKamar - 1][4] + " hari !!");

                                // Isi Kamar
                                isiKamar();
                            } 
                            else {
                                // Customer Data Input
                                inputDataCustomer();
                            }

                        } while (room[pilihKamar - 1].equalsIgnoreCase("X"));

                        // kamar
                        for (int i = 0; i < room.length; i++) {
                            if (pilihKamar == i + 1) {
                                room[i] = "X";
                            }
                        }

                        // End
                        if (runMenu = true) {
                            System.out.println("========================");
                            System.out.println("Data telah tersimpan!");
                            System.out.println("(kembali ke menu awal)");
                            System.out.println();
                        }

                        // Back To Main Menu
                        runMenu = false;
                    break;

                    case 2:
                        // Isi Kamar
                        System.out.println("=======================");
                        System.out.println("Ubah Pesanan");
                        isiKamar();

                        // Input Pesan Kamar
                        System.out.print("Pesan kamar nomor (0 untuk back) : ");
                        pilihKamar = pilih.nextInt();

                        // Back To Main Menu If Input = 0
                        if (pilihKamar == 0) {
                            runMenu = false;
                            break;
                        }

                        // data baru
                        for (int i = 0; i < 5; i++) {
                            if (data[pilihKamar - 1][i] == null) {
                                System.out.println("!! Kamar nomor " + pilihKamar + " tidak ada yang pesan !!");
                                System.out.println();
                                break;
                            } 
                            else {
                                // Data lama
                                System.out.println("Data yang sudah terisi adalah sebagai berikut : ");

                                System.out.println("Nama : " + data[pilihKamar - 1][0]);
                                System.out.println("Alamat : " + data[pilihKamar - 1][1]);
                                System.out.println("No KTP : " + data[pilihKamar - 1][2]);
                                System.out.println("No Telp : " + data[pilihKamar - 1][3]);
                                System.out.println("Lama Menginap (dalam hari) : " + data[pilihKamar - 1][4]);

                                //Data Baru
                                // Input Customer Data
                                System.out.println("Data baru adalah : ");
                                inputDataCustomer();

                                // End
                                System.out.println("========================");
                                System.out.println("Data telah tersimpan!");
                                System.out.println("(kembali ke menu awal)");
                                System.out.println();
                                break; 
                            }
                        }
                        runMenu = false;
                    break;

                    case 3:
                        // Isi Kamar
                        System.out.println("=======================");
                        System.out.println("Batal Pesanan");
                        
                        //Isi Kamar
                        isiKamar();

                        // Input Pesan Kamar
                        System.out.print("Batal kamar nomor (0 untuk back) : ");
                        pilihKamar = pilih.nextInt();

                        // Back To Main Menu If Input = 0
                        if (pilihKamar == 0) {
                            runMenu = false;
                            break;
                        }

                        System.out.println("=======================");
                        if (room[pilihKamar - 1].equals(" ")) {
                            System.out.println("!! kamar nomor " + pilihKamar + " tidak ada yang pesan !! ");
                        }

                        else if (room[pilihKamar - 1].equalsIgnoreCase("X")) {
                            System.out.print("Apakah anda yakin? (y / t) : ");
                            yakinPilih = pilih.next();
                            
                            if (yakinPilih.equalsIgnoreCase("Y")) {
                                //Change X to " "
                                room[pilihKamar - 1] = " ";

                                System.out.println("========================");
                                System.out.println("!!pesanan oleh " + data[pilihKamar - 1][0] + " telah dibatalkan !!");
                                System.out.println("(kembali ke menu utama)");
                            }
                            runMenu = false;
                        }
                    break;

                    case 4:
                        // Isi Kamar
                        System.out.println("========================");
                        System.out.println("Lihat Kamar");
                        isiKamar();

                        for (int i = 0; i < room.length; i++) {
                            if (room[i].equalsIgnoreCase("X")) {
                                System.out.println("Kamar no " + (i + 1) + " di pesan oleh " + data[i][0] + " selama " + data[i][4] + " hari");
                            }
                        }
                        runMenu = false;
                    break;

                    case 5:
                        run = false;
                        runMenu = false;
                    break;
                }
            }
        }
    }
}
