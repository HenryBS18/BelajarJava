package mine;
import java.util.*;

/**
 * Week 9 Antonius Indra & Edgar Tanamal
 */

public class awd {
    static Scanner inputint = new Scanner(System.in);
    static Scanner inputstr = new Scanner(System.in);
    static String[][] Hotel = new String[9][6];
    static int pesan;
    static String batal, jenis, ignore;

    public static void main(String[] args) {
        boolean ulang = true;
        for (int i = 0; i < 9; i++) {
            Hotel[i][0] = "";
        }
        do {
            System.out.println("Menu :");
            System.out.println("1. Reservasi Kamar");
            System.out.println("2. Ubah Pesanan");
            System.out.println("3. Batalkan Pesanan");
            System.out.println("4. Lihat Kamar");
            System.out.println("5. Exit");
            System.out.print("Pilih : ");
            int pilihan = inputint.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    reservasi();
                    break;
                case 2:
                    Ubah();
                    break;
                case 3:
                    Batalkan();
                    break;
                case 4:
                    Lihat();
                    break;
                case 5:
                    ulang = false;
                    break;
            }
        } while (ulang);
    }

    static void reservasi() {
        do {
        System.out.println("=======================");
        System.out.println("Reservasi Kamar");

        gambar();

            System.out.print("Pesan kamar nomor (0 untuk back) : ");
            pesan = inputint.nextInt();
            if (pesan == 0) {
                return;
            } else if (Hotel[pesan - 1][0].equalsIgnoreCase("x")) {
                System.out.println("!! Kamar telah terisi oleh " + Hotel[pesan - 1][1] + " selama " + Hotel[pesan - 1][5] + " hari !!");
            }
        } while (Hotel[pesan - 1][0].equalsIgnoreCase("x"));

        inputData();

        Hotel[pesan - 1][0] = "x";
    }

    static void Ubah() {
        do {
        System.out.println("=======================");
        System.out.println("Ubah Pesanan");

        gambar();

        System.out.print("Ubah kamar nomor (0 untuk back) : ");
        pesan = inputint.nextInt();
        if (pesan == 0) {
            return;
        } else if (Hotel[pesan - 1][0].equalsIgnoreCase("")) {
            System.out.println("!! Kamar nomor " + pesan + " tidak ada yang pesan !!");
        }
    } while (Hotel[pesan - 1][0].equalsIgnoreCase(""));

        System.out.println();
        System.out.println("Nama : " + Hotel[pesan - 1][1]);
        System.out.println("Alamat : " + Hotel[pesan - 1][2]);
        System.out.println("No KTP : " + Hotel[pesan - 1][3]);
        System.out.println("No Telp : " + Hotel[pesan - 1][4]);
        System.out.println("Lama Menginap (dalam hari) : " + Hotel[pesan - 1][5]);
        System.out.println();
        System.out.println("Data baru adalah");

        inputData();

    }

    static void Batalkan() {
        do {
        System.out.println("=======================");
        System.out.println("Batal Pesanan");

        gambar();

        jenis = "Batal";
        ignore = "";

        System.out.print("Batal kamar nomor (0 untuk back) : ");
        pesan = inputint.nextInt();
        if (pesan == 0) {
            return;
        } else if (Hotel[pesan - 1][0].equalsIgnoreCase("")) {
            System.out.println("!! Kamar nomor " + pesan + " tidak ada yang pesan !!");
        }
    } while (Hotel[pesan - 1][0].equalsIgnoreCase(""));

        System.out.print("Apakah anda yakin (y/t) ? ");
        batal = inputstr.nextLine();

        System.out.println("=======================");
        if (batal.equalsIgnoreCase("Y")) {
            Hotel[pesan - 1][0] = "";
            System.out.println("!! Pesanan oleh " + Hotel[pesan - 1][1] + " telah dibatalkan !!");
        }
        System.out.print("(Tekan enter untuk kembali ke menu awal)");
        inputstr.nextLine();
        System.out.println();
    }

    static void Lihat() {
        System.out.println("=======================");
        System.out.println("Lihat Kamar");

        gambar();

        for (int i = 0; i < 9; i++) {
            if (Hotel[i][0].equalsIgnoreCase("x")) {
                System.out.println("Kamar nomor " + (i + 1) + " dipesan oleh " + Hotel[i][1] + " selama " + Hotel[i][5] + " hari");
                System.out.println();
            }
        }
        System.out.print("(Tekan enter untuk kembali ke menu awal)");
        inputstr.nextLine();
        System.out.println();
    }

    static void gambar() {
        System.out.println("[ " + Hotel[0][0] + " ] [ " + Hotel[1][0] + " ] [ " + Hotel[2][0] + " ]");
        System.out.println("[ " + Hotel[3][0] + " ] [ " + Hotel[4][0] + " ] [ " + Hotel[5][0] + " ]");
        System.out.println("[ " + Hotel[6][0] + " ] [ " + Hotel[7][0] + " ] [ " + Hotel[8][0] + " ]");
    }

    static void inputData() {
        System.out.print("Nama : ");
        Hotel[pesan - 1][1] = inputstr.nextLine();

        System.out.print("Alamat : ");
        Hotel[pesan - 1][2] = inputstr.nextLine();

        System.out.print("No KTP : ");
        Hotel[pesan - 1][3] = inputstr.nextLine();

        System.out.print("No Telp : ");
        Hotel[pesan - 1][4] = inputstr.nextLine();

        System.out.print("Lama Menginap (dalam hari) : ");
        Hotel[pesan - 1][5] = inputstr.nextLine();

        System.out.println("=======================");
        System.out.println("Data Telah tersimpan!");
        System.out.print("(Tekan enter untuk kembali ke menu awal)");
        inputstr.nextLine();
        System.out.println();
    }
}
