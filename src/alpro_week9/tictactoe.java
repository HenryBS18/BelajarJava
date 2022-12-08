package alpro_week9;
import java.util.Scanner;

public class tictactoe {
    // Declare Array
    static String[][] kotak = new String[3][3];

    // TicTacToe
    static void board() {
        System.out.println("=========");
        System.out.print("|" + kotak[0][0] + "|" + kotak[0][1] + "|" + kotak[0][2] + "|");
        System.out.println();
        System.out.println("-------");
        System.out.print("|" + kotak[1][0] + "|" + kotak[1][1] + "|" + kotak[1][2] + "|");
        System.out.println();
        System.out.println("-------");
        System.out.print("|" + kotak[2][0] + "|" + kotak[2][1] + "|" + kotak[2][2] + "|");
        System.out.println();
        System.out.println("-------");
    }
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Declare
        int player = 1, turn = 0;
        boolean run = true;
        String isi;

        // Isi Array
        kotak[0][0] = "1"; kotak[0][1] = "2"; kotak[0][2] = "3";
        kotak[1][0] = "4"; kotak[1][1] = "5"; kotak[1][2] = "6";
        kotak[2][0] = "7"; kotak[2][1] = "8"; kotak[2][2] = "9";

        // Print TicTacToe
        board();

        while (run) {
            turn++;

            // Player Number Condition
            if (turn % 2 != 0) {
                player = 1;
            } 
            else {
                player = 2;
            }

            // Input
            System.out.print("Player " + player + " : ");
            isi = scan.nextLine();

            // Convert Condition
            for (int i = 0; i < kotak.length; i++) {
                for (int j = 0; j < kotak.length; j++) {
                    if (isi.equals(kotak[i][j])) {
                        if (player == 1) {
                            isi = "X";
                        } 
                        else if (player == 2) {
                            isi = "O";
                        }
                        kotak[i][j] = isi;
                    }
                }
            }

            // Print TicTacToe
            board();

            // Win/Draw Condition
            if ((kotak[0][0].equals(isi) && kotak[0][1].equals(isi) && kotak[0][2].equals(isi)) || (kotak[1][0].equals(isi) && kotak[1][1].equals(isi) && kotak[1][2].equals(isi)) || (kotak[2][0].equals(isi) && kotak[2][1].equals(isi) && kotak[2][2].equals(isi)) || (kotak[0][0].equals(isi) && kotak[1][0].equals(isi) && kotak[2][0].equals(isi)) || (kotak[0][1].equals(isi) && kotak[1][1].equals(isi) && kotak[2][1].equals(isi)) || (kotak[0][2].equals(isi) && kotak[1][2].equals(isi) && kotak[2][2].equals(isi)) || (kotak[0][0].equals(isi) && kotak[1][1].equals(isi) && kotak[2][2].equals(isi)) || (kotak[0][2].equals(isi) && kotak[1][1].equals(isi) && kotak[2][0].equals(isi))) {
                System.out.println("Player " + player + " Win");
                run = false;
            } 
            else if (turn >= 9) {
                run = false;
                System.out.println("Draw");
            }
        }
    }
}