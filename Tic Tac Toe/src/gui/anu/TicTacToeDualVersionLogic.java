/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.anu;

import javax.swing.JButton;

/**
 *
 * @author Anuradha
 */
public class TicTacToeDualVersionLogic {

    int no_of_clicks;
    int ar[][] = new int[3][3];
    int clicked[] = new int[9];
    JButton[][] btn_array;

    public TicTacToeDualVersionLogic(JButton[][] btn_array) {
        no_of_clicks = 0;
        this.btn_array = btn_array;
    }

    public int click(int i, int row, int col) {
        if (clicked[i] == 0) {
            no_of_clicks += 1;

            if ((no_of_clicks % 2) == 1) {


                clicked[i] = 1;
                ar[row][col] = 1;
                return 1;
            } else {
                clicked[i] = -1;
                ar[row][col] = -1;
                return 2;

            }
        } else {
            return 0;
        }

    }

    public void initialize() {
        no_of_clicks = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = 0;
            }
        }
        for (int i = 0; i
                < 9; i++) {
            clicked[i] = 0;
        }
    }

    public boolean isPlayerWon(int player) {
        int total = 0;
        int checkTot;

        if (player == 1) {
            checkTot = 3;
        } else if (player == 2) {
            checkTot = -3;
        } else {
            return false;
        }


        for (int i = 0; i < 3; i++) {
            total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println(ar[i][j]);
                total += ar[i][j];
            }
            if (total == checkTot) {
                for (int j = 0; j < 9; j++) {
                    clicked[j] = 1;
                }
                return true;
            }
        }

        for (int k = 0; k < 3; k++) {
            total = 0;
            for (int l = 0; l < 3; l++) {
                total += ar[l][k];
            }
            if (total == checkTot) {
                for (int j = 0; j < 9; j++) {
                    clicked[j] = 1;
                }
                return true;
            }
        }

        total = 0;
        for (int m = 0; m < 3; m++) {
            total += ar[m][m];
        }
        if (total == checkTot) {
            for (int j = 0; j < 9; j++) {
                clicked[j] = 1;
            }
            return true;
        }

        total = 0;
        int p = 2;
        for (int n = 0; n < 3; n++) {
            total += ar[n][p];
            p--;
        }
        if (total == checkTot) {
            for (int j = 0; j < 9; j++) {
                clicked[j] = 1;
            }
            return true;
        }
        return false;
    }
}
