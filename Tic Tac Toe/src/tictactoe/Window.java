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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
        
        gridPanel.setOpaque(false);
        scoreBoard.setOpaque(false);
        
        startBtn.setOpaque(false);
        startBtn.setContentAreaFilled(false);
        b00.setOpaque(false);
        b00.setContentAreaFilled(false);
        b01.setOpaque(false);
        b01.setContentAreaFilled(false);
        b02.setOpaque(false);
        b02.setContentAreaFilled(false);
        b10.setOpaque(false);
        b10.setContentAreaFilled(false);
        b11.setOpaque(false);
        b11.setContentAreaFilled(false);
        b12.setOpaque(false);
        b12.setContentAreaFilled(false);
        b20.setOpaque(false);
        b20.setContentAreaFilled(false);
        b21.setOpaque(false);
        b21.setContentAreaFilled(false);
        b22.setOpaque(false);
        b22.setContentAreaFilled(false);
        quitBtn.setOpaque(false);
        quitBtn.setContentAreaFilled(false);
        
        backBtn.setOpaque(false);
        backBtn.setContentAreaFilled(false);
        
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
                wonLbl.setText("You lost!");
                for (int i = 0; i < 3; i++) {
                    for (JButton b : buttons[i]) {
                        b.setEnabled(false);
                    }
                }
                return;
            } else if (win() == -1) {
                wonLbl.setText("It is a draw!");
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

        gridPanel = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        scoreBoard = new javax.swing.JPanel();
        singlePlayerLabel1 = new javax.swing.JLabel();
        singlePlayerLabel2 = new javax.swing.JLabel();
        singlePlayerLabel3 = new javax.swing.JLabel();
        singlePlayerLabel4 = new javax.swing.JLabel();
        singlePlayerLabel5 = new javax.swing.JLabel();
        singlePlayerLabel6 = new javax.swing.JLabel();
        wonLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        quitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        backgroungLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setMinimumSize(new java.awt.Dimension(742, 523));
        getContentPane().setLayout(null);

        gridPanel.setBackground(new java.awt.Color(0, 0, 0));

        b00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b00.setFocusPainted(false);
        b00.setFocusable(false);
        b00.setName("00"); // NOI18N
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b01.setFocusPainted(false);
        b01.setFocusable(false);
        b01.setName("01"); // NOI18N
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b02.setFocusPainted(false);
        b02.setFocusable(false);
        b02.setName("02"); // NOI18N
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        b10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b10.setFocusPainted(false);
        b10.setFocusable(false);
        b10.setName("10"); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b11.setFocusPainted(false);
        b11.setFocusable(false);
        b11.setName("11"); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b12.setFocusPainted(false);
        b12.setFocusable(false);
        b12.setName("12"); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b20.setFocusPainted(false);
        b20.setFocusable(false);
        b20.setName("20"); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b21.setFocusPainted(false);
        b21.setFocusable(false);
        b21.setName("21"); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        b22.setFocusPainted(false);
        b22.setFocusable(false);
        b22.setName("22"); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(gridPanelLayout.createSequentialGroup()
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gridPanelLayout.createSequentialGroup()
                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gridPanelLayout.createSequentialGroup()
                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(gridPanel);
        gridPanel.setBounds(40, 250, 250, 235);

        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EMOTICON SMILE.png"))); // NOI18N
        startBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        startBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startBtnMouseClicked(evt);
            }
        });
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn);
        startBtn.setBounds(100, 110, 125, 128);

        scoreBoard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 153, 0)));

        singlePlayerLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel1.setText("Computer");

        singlePlayerLabel2.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel2.setText("Player");

        singlePlayerLabel3.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel3.setText("Ties");

        singlePlayerLabel4.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel4.setText("0");

        singlePlayerLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel5.setText("0");

        singlePlayerLabel6.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        singlePlayerLabel6.setText("0");

        javax.swing.GroupLayout scoreBoardLayout = new javax.swing.GroupLayout(scoreBoard);
        scoreBoard.setLayout(scoreBoardLayout);
        scoreBoardLayout.setHorizontalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreBoardLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singlePlayerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singlePlayerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singlePlayerLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(singlePlayerLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singlePlayerLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singlePlayerLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        scoreBoardLayout.setVerticalGroup(
            scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreBoardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singlePlayerLabel1)
                    .addComponent(singlePlayerLabel4))
                .addGap(18, 18, 18)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singlePlayerLabel2)
                    .addComponent(singlePlayerLabel5))
                .addGap(18, 18, 18)
                .addGroup(scoreBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singlePlayerLabel3)
                    .addComponent(singlePlayerLabel6))
                .addGap(23, 23, 23))
        );

        getContentPane().add(scoreBoard);
        scoreBoard.setBounds(360, 250, 310, 160);

        wonLbl.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        getContentPane().add(wonLbl);
        wonLbl.setBounds(260, 140, 450, 62);

        titleLbl.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        titleLbl.setText("Tic Tac Toe");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(239, 30, 360, 65);

        quitBtn.setFont(new java.awt.Font("Viner Hand ITC", 3, 14)); // NOI18N
        quitBtn.setText("Quit Game");
        quitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn);
        quitBtn.setBounds(530, 430, 140, 40);

        backBtn.setFont(new java.awt.Font("Viner Hand ITC", 3, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(360, 430, 140, 40);

        backgroungLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vintage-Backgrounds-7.jpg"))); // NOI18N
        getContentPane().add(backgroungLabel);
        backgroungLabel.setBounds(0, 0, 740, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        btnAction(2, 2);
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        btnAction(2, 1);
    }//GEN-LAST:event_b21ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        btnAction(2, 0);
    }//GEN-LAST:event_b20ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        btnAction(1, 2);
    }//GEN-LAST:event_b12ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        btnAction(1, 1);
    }//GEN-LAST:event_b11ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        btnAction(1, 0);
    }//GEN-LAST:event_b10ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
        btnAction(0, 2);
    }//GEN-LAST:event_b02ActionPerformed

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
        btnAction(0, 1);
    }//GEN-LAST:event_b01ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        btnAction(0, 0);
    }//GEN-LAST:event_b00ActionPerformed

    private void initialize() {
        session++;
        prompt = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = 0;
            }
        }
    }
    
    
    private void startBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startBtnMouseClicked

        initialize();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setIcon(null);
                buttons[i][j].setEnabled(true);
            }
        }
        startBtn.setIcon(new ImageIcon(getClass().getResource("/images/EMOTICON SMILE.png")));
        wonLbl.setText("");
        
    }//GEN-LAST:event_startBtnMouseClicked

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit the game?", "Quit Game", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_quitBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        this.dispose();
        WelcomeScreen welcome = new WelcomeScreen();
        welcome.setLocationRelativeTo(null);
        welcome.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroungLabel;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JButton quitBtn;
    private javax.swing.JPanel scoreBoard;
    private javax.swing.JLabel singlePlayerLabel1;
    private javax.swing.JLabel singlePlayerLabel2;
    private javax.swing.JLabel singlePlayerLabel3;
    private javax.swing.JLabel singlePlayerLabel4;
    private javax.swing.JLabel singlePlayerLabel5;
    private javax.swing.JLabel singlePlayerLabel6;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel wonLbl;
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
            wonLbl.setText("You won!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        } else if (win() == -1) {
            wonLbl.setText("It is a draw!");
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
            wonLbl.setText("You lost!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        } else if (win() == -1) {
            wonLbl.setText("It is a draw!");
            for (int i = 0; i < 3; i++) {
                for (JButton b : buttons[i]) {
                    b.setEnabled(false);
                }
            }
            return;
        }
    }
}
