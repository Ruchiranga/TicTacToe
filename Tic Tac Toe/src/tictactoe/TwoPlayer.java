/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ruchiranga
 */
public class TwoPlayer extends javax.swing.JFrame {

    JButton[][] btn_array = new JButton[3][3];

    TicTacToeDualVersionLogic logic;
    /**
     * Creates new form TwoPlayer
     */
    public TwoPlayer() {
        initComponents();
        gridPanel.setOpaque(false);
        scoreBoard.setOpaque(false);
        
        startBtn.setOpaque(false);
        startBtn.setContentAreaFilled(false);
        Btn1.setOpaque(false);
        Btn1.setContentAreaFilled(false);
        Btn2.setOpaque(false);
        Btn2.setContentAreaFilled(false);
        Btn3.setOpaque(false);
        Btn3.setContentAreaFilled(false);
        Btn4.setOpaque(false);
        Btn4.setContentAreaFilled(false);
        Btn5.setOpaque(false);
        Btn5.setContentAreaFilled(false);
        Btn6.setOpaque(false);
        Btn6.setContentAreaFilled(false);
        Btn7.setOpaque(false);
        Btn7.setContentAreaFilled(false);
        Btn8.setOpaque(false);
        Btn8.setContentAreaFilled(false);
        Btn9.setOpaque(false);
        Btn9.setContentAreaFilled(false);
        quitBtn.setOpaque(false);
        quitBtn.setContentAreaFilled(false);
        
        backBtn.setOpaque(false);
        backBtn.setContentAreaFilled(false);
        
        
        setLocationRelativeTo(null);
        btn_array[0][0] = Btn1;
        btn_array[0][1] = Btn2;
        btn_array[0][2] = Btn3;
        btn_array[1][0] = Btn4;
        btn_array[1][1] = Btn5;
        btn_array[1][2] = Btn6;
        btn_array[2][0] = Btn7;
        btn_array[2][1] = Btn8;
        btn_array[2][2] = Btn9;

        logic = new TicTacToeDualVersionLogic(btn_array);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridPanel = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        scoreBoard = new javax.swing.JPanel();
        singlePlayerLabel1 = new javax.swing.JLabel();
        singlePlayerLabel2 = new javax.swing.JLabel();
        singlePlayerLabel3 = new javax.swing.JLabel();
        singlePlayerLabel4 = new javax.swing.JLabel();
        singlePlayerLabel5 = new javax.swing.JLabel();
        singlePlayerLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        wonLbl = new javax.swing.JLabel();
        backgroungLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setMinimumSize(new java.awt.Dimension(750, 540));
        setPreferredSize(new java.awt.Dimension(750, 540));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        gridPanel.setBackground(new java.awt.Color(0, 0, 0));

        Btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
        });
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn2MouseClicked(evt);
            }
        });

        Btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn3MouseClicked(evt);
            }
        });

        Btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn4MouseClicked(evt);
            }
        });

        Btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn5MouseClicked(evt);
            }
        });

        Btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn6MouseClicked(evt);
            }
        });

        Btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn7MouseClicked(evt);
            }
        });

        Btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn8MouseClicked(evt);
            }
        });

        Btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        Btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gridPanelLayout.createSequentialGroup()
                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gridPanelLayout.createSequentialGroup()
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gridPanelLayout.createSequentialGroup()
                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(gridPanel);
        gridPanel.setBounds(40, 250, 251, 235);

        quitBtn.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        quitBtn.setForeground(new java.awt.Color(153, 0, 0));
        quitBtn.setText("Quit Game");
        quitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(quitBtn);
        quitBtn.setBounds(520, 430, 140, 40);

        scoreBoard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 102, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 153, 0)));

        singlePlayerLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel1.setForeground(new java.awt.Color(153, 0, 0));
        singlePlayerLabel1.setText("Player 1");

        singlePlayerLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel2.setForeground(new java.awt.Color(153, 0, 0));
        singlePlayerLabel2.setText("Player 2");

        singlePlayerLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel3.setForeground(new java.awt.Color(153, 0, 0));
        singlePlayerLabel3.setText("Ties");

        singlePlayerLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel4.setForeground(new java.awt.Color(153, 0, 0));
        singlePlayerLabel4.setText("0");

        singlePlayerLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel5.setForeground(new java.awt.Color(153, 0, 0));
        singlePlayerLabel5.setText("0");

        singlePlayerLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 20)); // NOI18N
        singlePlayerLabel6.setForeground(new java.awt.Color(153, 0, 0));
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

        backBtn.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(153, 0, 0));
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 102, 0), new java.awt.Color(204, 204, 0)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(360, 430, 140, 40);

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

        titleLbl.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(153, 0, 0));
        titleLbl.setText("Tic Tac Toe");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(239, 30, 360, 65);

        wonLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        wonLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(wonLbl);
        wonLbl.setBounds(260, 140, 450, 62);

        backgroungLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vintage-Backgrounds-7.jpg"))); // NOI18N
        getContentPane().add(backgroungLabel);
        backgroungLabel.setBounds(0, 0, 740, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked

        int click = logic.click(0, 0, 0);
        if (click == 1) {
            Btn1.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn1.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }

    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn2MouseClicked
        int click = logic.click(1, 0, 1);
        if (click == 1) {
            Btn2.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn2.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn2MouseClicked

    private void Btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn3MouseClicked
        int click = logic.click(2, 0, 2);
        if (click == 1) {
            Btn3.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn3.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn3MouseClicked

    private void Btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn4MouseClicked
        int click = logic.click(3, 1, 0);
        if (click == 1) {
            Btn4.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn4.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn4MouseClicked

    private void Btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn5MouseClicked

        int click = logic.click(4, 1, 1);
        if (click == 1) {
            Btn5.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn5.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }

    }//GEN-LAST:event_Btn5MouseClicked

    private void Btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn6MouseClicked
        int click = logic.click(5, 1, 2);
        if (click == 1) {
            Btn6.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn6.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn6MouseClicked

    private void Btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn7MouseClicked
        int click = logic.click(6, 2, 0);
        if (click == 1) {
            Btn7.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn7.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn7MouseClicked

    private void Btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn8MouseClicked
        int click = logic.click(7, 2, 1);
        if (click == 1) {
            Btn8.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn8.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }
    }//GEN-LAST:event_Btn8MouseClicked

    private void Btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn9MouseClicked
        int click = logic.click(8, 2, 2);
        if (click == 1) {
            Btn9.setIcon(new ImageIcon(getClass().getResource("/images/circle.jpg")));
            if (logic.isPlayerWon(1)) {
                wonLbl.setText("Congradulations!  \nPlayer 1 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        } else if (click == 2) {
            Btn9.setIcon(new ImageIcon(getClass().getResource("/images/cross.jpg")));
            if (logic.isPlayerWon(2)) {
                wonLbl.setText("Congradulations!  \nPlayer 2 Won!");
                startBtn.setIcon(new ImageIcon(getClass().getResource("/images/smile.png")));
            }
        }

    }//GEN-LAST:event_Btn9MouseClicked

    private void startBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startBtnMouseClicked

        logic.initialize();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btn_array[i][j].setIcon(null);
                btn_array[i][j].setEnabled(true);
            }
        }
        startBtn.setIcon(new ImageIcon(getClass().getResource("/images/EMOTICON SMILE.png")));
        wonLbl.setText("");

    }//GEN-LAST:event_startBtnMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.setLocationRelativeTo(null);
        welcomeScreen.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
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
}
