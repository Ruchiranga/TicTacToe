/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Window.java
 *
 * Created on Nov 30, 2013, 11:56:22 AM
 */
package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Ruchiranga
 */
public class Window extends javax.swing.JFrame {

    int session = 0;
    boolean prompt = true;
    int ways[][] = new int[8][3];
    int counts[] = new int[8];
    int pair[] = new int[2];
    int ar[][];
    int winner;

    public Window() {
        ar = new int[3][3];
        initComponents();
        buttons = new JButton[3][3];
        buttons[0][0] = b00;
        buttons[0][1] = b01;
        buttons[0][2] = b02;
        buttons[1][0] = b10;
        buttons[1][1] = b11;
        buttons[1][2] = b12;
        buttons[2][0] = b20;
        buttons[2][1] = b21;
        buttons[2][2] = b22;
        
        if (session % 2 == 0) {
            prompt = false;
//            respond();
            mark(ar, 1, 1);
            if (win() == 5) {
                lbl.setText("You lost!");
                for (int i = 0; i < 3; i++) {
                    for (JButton b : buttons[i]) {
                        b.setEnabled(false);
                    }
                }
                return;
            } else if (win() == -1) {
                lbl.setText("It is a draw!");
                for (int i = 0; i < 3; i++) {
                    for (JButton b : buttons[i]) {
                        b.setEnabled(false);
                    }
                }
                return;
            }
        }

//        while ((winner = win()) == 0) {
//            prompt = true;
//            System.out.println("Enter coordinate : ");
//            for (int i = 0; i < 2; i++) {
//                pair[i] = input.nextInt();
//            }
//            mark(ar, pair[0], pair[1]);
//            printArray(ar);
//            prompt = false;
//            
//            System.out.println("Conputer :");
//            printArray(ar);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        b00.setFocusPainted(false);
        b00.setFocusable(false);
        b00.setName("00"); // NOI18N
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.setFocusPainted(false);
        b01.setFocusable(false);
        b01.setName("01"); // NOI18N
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b02.setFocusPainted(false);
        b02.setFocusable(false);
        b02.setName("02"); // NOI18N
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        b11.setFocusPainted(false);
        b11.setFocusable(false);
        b11.setName("11"); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setFocusPainted(false);
        b12.setFocusable(false);
        b12.setName("12"); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b10.setFocusPainted(false);
        b10.setFocusable(false);
        b10.setName("10"); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b21.setFocusPainted(false);
        b21.setFocusable(false);
        b21.setName("21"); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setFocusPainted(false);
        b22.setFocusable(false);
        b22.setName("22"); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b20.setFocusPainted(false);
        b20.setFocusable(false);
        b20.setName("20"); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 0, 0));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setName("lbl"); // NOI18N

        Heading.setFont(new java.awt.Font("Garamond", 3, 36)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("TIC TAC TOE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        btnAction(1, 1);
    }//GEN-LAST:event_b11ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        btnAction(2, 1);
    }//GEN-LAST:event_b21ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        btnAction(0, 0);


    }//GEN-LAST:event_b00ActionPerformed

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
        btnAction(0, 1);
    }//GEN-LAST:event_b01ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
        btnAction(0, 2);
    }//GEN-LAST:event_b02ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        btnAction(1, 0);
    }//GEN-LAST:event_b10ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        btnAction(1, 2);
    }//GEN-LAST:event_b12ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        btnAction(2, 0);
    }//GEN-LAST:event_b20ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        btnAction(2, 2);
    }//GEN-LAST:event_b22ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
    JButton buttons[][];

    static void printArray(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

//    private void respond() {
//        int way = isRisky();
//        if (way == -1) {
//            attack();
//        } else if (isWinning() >= 0) {
//            attack();
//        } else {
//            block(way);
//
//        }
//    }
    private void respond() {
        int way = isRisky();
        if (way == -1) {
            if (isWinning() >= 0) {
                System.out.println("is winning");
                attack();
            } else {
                System.out.println("isnot winning");
                attack();
            }
        } else {
            System.out.println(way + "is risky");
            block(way);

        }
    }

    int isRisky() {
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j : ways[i]) {

                sum += j;
            }
            System.out.println(i + " " + sum);
            if (sum == 2) {
                return i;
            }
        }
        return -1;

    }

    int isWinning() {
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j : ways[i]) {
                sum += j;
            }
            if (sum == 10) {
                return i;
            }
        }
        return -1;

    }

    void block(int way) {
        if (way < 3) {
            for (int j = 0; j < 3; j++) {
                if (ar[way][j] == 0) {
                    mark(ar, way, j);
                    return;
                }
            }
        } else if (way < 6) {
            for (int j = 0; j < 3; j++) {
                if (ar[j][way - 3] == 0) {
                    mark(ar, j, way - 3);
                    return;
                }
            }
        } else if (way == 6) {
            for (int j = 0; j < 3; j++) {
                if (ar[j][j] == 0) {
                    mark(ar, j, j);
                    return;
                }
            }

        } else {
            for (int j = 0, k = 2; j < 3 && k >= 0; j++, k--) {
                if (ar[j][k] == 0) {
                    mark(ar, j, k);
                    return;
                }

            }
        }
    }

    void attack() {
        for (int p = 10; p > 0; p -= 5) {
            for (int i = 0; i < 8; i++) {
                int sum = 0;
                for (int j : ways[i]) {
                    sum += j;
                }
                if (sum == p) {
                    if (i < 3) {
                        for (int j = 0; j < 3; j++) {
                            if (ar[i][j] == 0) {
                                mark(ar, i, j);
                                return;
                            }
                        }
                    } else if (i < 6) {
                        for (int j = 0; j < 3; j++) {
                            if (ar[j][i - 3] == 0) {
                                mark(ar, j, i - 3);
                                return;
                            }
                        }
                    } else if (i == 6) {
                        for (int j = 0; j < 3; j++) {
                            if (ar[j][j] == 0) {
                                mark(ar, j, j);
                                return;
                            }
                        }

                    } else {
                        for (int j = 0, k = 2; j < 3 && k >= 0; j++, k--) {

                            if (ar[j][k] == 0) {
                                mark(ar, j, k);
                                return;
                            }

                        }
                    }
                }
            }
        }

        int min = 25, minidx = 0;
        for (int j = 0; j < 8; j++) {
            int cursum = 0;

            for (int k : ways[j]) {
                cursum += j;
            }
            if (cursum < min) {
                min = cursum;
                minidx = j;
            }
        }
        if (minidx < 3) {
            for (int j = 0; j < 3; j++) {
                if (ar[minidx][j] == 0) {
                    mark(ar, minidx, j);
                    return;
                }
            }
        } else if (minidx < 6) {
            for (int j = 0; j < 3; j++) {
                if (ar[j][minidx - 3] == 0) {
                    mark(ar, j, minidx - 3);
                    return;
                }
            }
        } else if (minidx == 6) {
            for (int j = 0; j < 3; j++) {
                if (ar[j][j] == 0) {
                    mark(ar, j, j);
                    return;
                }
            }

        } else {
            for (int j = 0, k = 2; j < 3 && k >= 0; j++, k--) {

                if (ar[j][k] == 0) {
                    mark(ar, j, k);
                    return;
                }

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ar[i][j] == 0) {
                    mark(ar, i, j);
                }
            }
        }

    }

    private int win() {
        boolean draw = true;
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j : ways[i]) {
                sum += j;
            }
            if (sum == 3) {
                return 1;
            } else if (sum == 15) {
                return 5;
            }
            if (sum < 7) {
                draw = false;
            }
        }
        if (draw) {
            return -1;
        } else {
            return 0;
        }
    }

    private void mark(int ar[][], int x, int y) {
        if (prompt) {
            ar[x][y] = 1;
            if (x == y) {
                ways[6][counts[6]] = 1;
                counts[6]++;
            }
            if (Math.abs(y - x) == 2 || (x == 1 && y == 1)) {
                ways[7][counts[7]] = 1;
                counts[7]++;
            }
            ways[x][counts[x]] = 1;
            counts[x]++;

            ways[y + 3][counts[y + 3]] = 1;
            counts[y + 3]++;
        } else {
            ar[x][y] = 5;
            buttons[x][y].setIcon(new ImageIcon(getClass().getResource("/cir.png")));
            buttons[x][y].setEnabled(false);
//            System.out.println(""+x+" "+y+buttons[x][y]);
            if (x == y) {
                ways[6][counts[6]] = 5;
                counts[6]++;
            }
            if (Math.abs(y - x) == 2 || (x == 1 && y == 1)) {
                ways[7][counts[7]] = 5;
                counts[7]++;
            }
            ways[x][counts[x]] = 5;
            counts[x]++;

            ways[y + 3][counts[y + 3]] = 5;
            counts[y + 3]++;

        }
    }

    private void btnAction(int x, int y) {
        prompt = true;
        buttons[x][y].setIcon(new ImageIcon(getClass().getResource("/crs.png")));
        buttons[x][y].setEnabled(false);
        mark(ar, x, y);
        if (win() == 1) {
            lbl.setText("You won!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        } else if (win() == -1) {
            lbl.setText("It is a draw!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        }
        prompt = false;
        respond();
        if (win() == 5) {
            lbl.setText("You lost!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        } else if (win() == -1) {
            lbl.setText("It is a draw!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        }
    }
}
