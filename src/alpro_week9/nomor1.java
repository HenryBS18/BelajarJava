package alpro_week9;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Declare
        String i, j;
        boolean run = true;
        int turn = 0;

        // Declare Array
        String[] bar1 = new String[3];
        String[] bar2 = new String[3];
        String[] bar3 = new String[3];

        bar1[0] = "1"; bar1[1] = "2"; bar1[2] = "3";
        bar2[0] = "4"; bar2[1] = "5"; bar2[2] = "6";
        bar3[0] = "7"; bar3[1] = "8"; bar3[2] = "9";

        // loop
        while (run) {
            //Turn Increment
            turn++;

            // Player 1
            // Print TicTacToe
            // Baris 1
            System.out.println("=========");
            System.out.print("|" + bar1[0] + "|" + bar1[1] + "|" + bar1[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Baris 2
            System.out.print("|" + bar2[0] + "|" + bar2[1] + "|" + bar2[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Baris 3
            System.out.print("|" + bar3[0] + "|" + bar3[1] + "|" + bar3[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Input Player 1
            System.out.print("Player 1 : ");
            i = scan.nextLine();
            System.out.println();

            // Condition Convert Number To X
            // baris1
            
            if (i.equals(bar1[0])) {
                bar1[0] = "X";
            } 
            else if (i.equals(bar1[1])) {
                bar1[1] = "X";
            } 
            else if (i.equals(bar1[2])) {
                bar1[2] = "X";
            }

            // baris2
            else if (i.equals(bar2[0])) {
                bar2[0] = "X";
            } 
            else if (i.equals(bar2[1])) {
                bar2[1] = "X";
            } 
            else if (i.equals(bar2[2])) {
                bar2[2] = "X";
            }

            // baris3
            else if (i.equals(bar3[0])) {
                bar3[0] = "X";
            } 
            else if (i.equals(bar3[1])) {
                bar3[1] = "X";
            } 
            else if (i.equals(bar3[2])) {
                bar3[2] = "X";
            }

            // Print TicTacToe
            // Baris 1
            System.out.println("=========");
            System.out.print("|" + bar1[0] + "|" + bar1[1] + "|" + bar1[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Baris 2
            System.out.print("|" + bar2[0] + "|" + bar2[1] + "|" + bar2[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Baris 3
            System.out.print("|" + bar3[0] + "|" + bar3[1] + "|" + bar3[2] + "|");
            System.out.println();
            System.out.println("-------");

            // Win/Lose Condition
            // Win Player 1
            if (bar1[0].equals("X") && bar1[1].equals("X") && bar1[2].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            } 
            else if (bar2[0].equals("X") && bar2[1].equals("X") && bar2[2].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            } 
            else if (bar3[0].equals("X") && bar3[1].equals("X") && bar3[2].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            }
            else if (bar1[0].equals("X") && bar2[0].equals("X") && bar3[0].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            } 
            else if (bar1[1].equals("X") && bar2[1].equals("X") && bar3[1].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            } 
            else if (bar1[2].equals("X") && bar2[2].equals("X") && bar3[2].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            }
            else if (bar1[0].equals("X") && bar2[1].equals("X") && bar3[2].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            } 
            else if (bar1[2].equals("X") && bar2[1].equals("X") && bar3[0].equals("X")) {
                System.out.println("Player 1 Win");
                run = false;
            }

            // Draw
            if (turn >= 9) {
                run = false;
                System.out.println("Draw");
            }

            // Player 2
            if (run) {
                //Turn Increment
                turn++;

                // Input Player 2
                System.out.print("Player  : ");
                j = scan.nextLine();

                // Condition Convert Number To O
                // baris1
                if (j.equals(bar1[0])) {
                    bar1[0] = "O";
                } 
                else if (j.equals(bar1[1])) {
                    bar1[1] = "O";
                } 
                else if (j.equals(bar1[2])) {
                    bar1[2] = "O";
                }

                // baris2
                else if (j.equals(bar2[0])) {
                    bar2[0] = "O";
                } 
                else if (j.equals(bar2[1])) {
                    bar2[1] = "O";
                } 
                else if (j.equals(bar2[2])) {
                    bar2[2] = "O";
                }

                // baris3
                else if (j.equals(bar3[0])) {
                    bar3[0] = "O";
                } 
                else if (j.equals(bar3[1])) {
                    bar3[1] = "O";
                } 
                else if (j.equals(bar3[2])) {
                    bar3[2] = "O";
                }

                // Print TicTacToe
                // Baris 1
                System.out.println("=========");
                System.out.print("|" + bar1[0] + "|" + bar1[1] + "|" + bar1[2] + "|");
                System.out.println();
                System.out.println("-------");

                // Baris 2
                System.out.print("|" + bar2[0] + "|" + bar2[1] + "|" + bar2[2] + "|");
                System.out.println();
                System.out.println("-------");

                // Baris 3
                System.out.print("|" + bar3[0] + "|" + bar3[1] + "|" + bar3[2] + "|");
                System.out.println();
                System.out.println("-------");
            }

            // Win/Lose Condition
            // Win Player 2
            if (bar1[0].equals("O") && bar1[1].equals("O") && bar1[2].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            } 
            else if (bar2[0].equals("O") && bar2[1].equals("O") && bar2[2].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            } 
            else if (bar3[0].equals("O") && bar3[1].equals("O") && bar3[2].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            }
            else if (bar1[0].equals("O") && bar2[0].equals("O") && bar3[0].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            } 
            else if (bar1[1].equals("O") && bar2[1].equals("O") && bar3[1].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            } 
            else if (bar1[2].equals("O") && bar2[2].equals("O") && bar3[2].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            }
            else if (bar1[0].equals("O") && bar2[1].equals("O") && bar3[2].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            } 
            else if (bar1[2].equals("O") && bar2[1].equals("O") && bar3[0].equals("O")) {
                System.out.println("Player 2 Win");
                run = false;
            }
        }
    }
}
