package com.jonathansamines.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


/**
 * CalculatorView
 * Main view for calculator application
 * @author jonathansamines
 */
public class CalculatorView extends JFrame implements ActionListener {
    
    public CalculatorView() {        
        initComponents();
        
        // configure layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
    }

    /**
     * Event generated when a user generates a click
     * @param event Event metadata
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Hola mundo click");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        firstRow = new javax.swing.JPanel();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        secondRow = new javax.swing.JPanel();
        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        thirdRow = new javax.swing.JPanel();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        fourthRow = new javax.swing.JPanel();
        btnDivision = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCompute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setName("mainPanel"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setAlignmentX(0.0F);
        mainPanel.setAlignmentY(0.0F);
        mainPanel.setMaximumSize(new java.awt.Dimension(0, 0));
        mainPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        mainPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        mainPanel.setLayout(new java.awt.GridLayout(5, 5));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("00.00");
        jTextField1.setName("txtDisplay"); // NOI18N
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        mainPanel.add(jTextField1);

        firstRow.setBackground(new java.awt.Color(255, 255, 255));
        firstRow.setLayout(new java.awt.GridLayout(1, 4));

        btnNumber1.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber1.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber1.setLabel("1");
        btnNumber1.setName("txtButtonNumber1"); // NOI18N
        btnNumber1.setVerifyInputWhenFocusTarget(false);
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        firstRow.add(btnNumber1);

        btnNumber2.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber2.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber2.setLabel("2");
        btnNumber2.setName("txtButtonNumber1"); // NOI18N
        btnNumber2.setVerifyInputWhenFocusTarget(false);
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber2ActionPerformed(evt);
            }
        });
        firstRow.add(btnNumber2);

        btnNumber3.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber3.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber3.setLabel("3");
        btnNumber3.setName("txtButtonNumber1"); // NOI18N
        btnNumber3.setVerifyInputWhenFocusTarget(false);
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber3ActionPerformed(evt);
            }
        });
        firstRow.add(btnNumber3);

        btnPlus.setBackground(new java.awt.Color(255, 255, 255));
        btnPlus.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(102, 102, 102));
        btnPlus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPlus.setLabel("+");
        btnPlus.setName("txtButtonNumber1"); // NOI18N
        btnPlus.setVerifyInputWhenFocusTarget(false);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        firstRow.add(btnPlus);

        mainPanel.add(firstRow);

        secondRow.setBackground(new java.awt.Color(255, 255, 255));
        secondRow.setLayout(new java.awt.GridLayout(1, 4));

        btnNumber4.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber4.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber4.setLabel("4");
        btnNumber4.setName("txtButtonNumber1"); // NOI18N
        btnNumber4.setVerifyInputWhenFocusTarget(false);
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber4ActionPerformed(evt);
            }
        });
        secondRow.add(btnNumber4);

        btnNumber5.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber5.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber5.setLabel("5");
        btnNumber5.setName("txtButtonNumber1"); // NOI18N
        btnNumber5.setVerifyInputWhenFocusTarget(false);
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber5ActionPerformed(evt);
            }
        });
        secondRow.add(btnNumber5);

        btnNumber6.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber6.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber6.setLabel("6");
        btnNumber6.setName("txtButtonNumber1"); // NOI18N
        btnNumber6.setVerifyInputWhenFocusTarget(false);
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber6ActionPerformed(evt);
            }
        });
        secondRow.add(btnNumber6);

        btnMinus.setBackground(new java.awt.Color(255, 255, 255));
        btnMinus.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(102, 102, 102));
        btnMinus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMinus.setLabel("-");
        btnMinus.setName("txtButtonNumber1"); // NOI18N
        btnMinus.setVerifyInputWhenFocusTarget(false);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        secondRow.add(btnMinus);

        mainPanel.add(secondRow);

        thirdRow.setBackground(new java.awt.Color(255, 255, 255));
        thirdRow.setLayout(new java.awt.GridLayout(1, 4));

        btnNumber7.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber7.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber7.setLabel("7");
        btnNumber7.setName("txtButtonNumber1"); // NOI18N
        btnNumber7.setVerifyInputWhenFocusTarget(false);
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber7ActionPerformed(evt);
            }
        });
        thirdRow.add(btnNumber7);

        btnNumber8.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber8.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber8.setLabel("8");
        btnNumber8.setName("txtButtonNumber1"); // NOI18N
        btnNumber8.setVerifyInputWhenFocusTarget(false);
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber8ActionPerformed(evt);
            }
        });
        thirdRow.add(btnNumber8);

        btnNumber9.setBackground(new java.awt.Color(255, 255, 255));
        btnNumber9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnNumber9.setForeground(new java.awt.Color(102, 102, 102));
        btnNumber9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNumber9.setLabel("9");
        btnNumber9.setName("txtButtonNumber1"); // NOI18N
        btnNumber9.setVerifyInputWhenFocusTarget(false);
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber9ActionPerformed(evt);
            }
        });
        thirdRow.add(btnNumber9);

        btnMultiply.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiply.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(102, 102, 102));
        btnMultiply.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMultiply.setLabel("*");
        btnMultiply.setName("txtButtonNumber1"); // NOI18N
        btnMultiply.setVerifyInputWhenFocusTarget(false);
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        thirdRow.add(btnMultiply);

        mainPanel.add(thirdRow);

        fourthRow.setBackground(new java.awt.Color(255, 255, 255));
        fourthRow.setLayout(new java.awt.GridLayout(1, 4));

        btnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btnDivision.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(102, 102, 102));
        btnDivision.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDivision.setLabel("/");
        btnDivision.setName("txtButtonNumber1"); // NOI18N
        btnDivision.setVerifyInputWhenFocusTarget(false);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        fourthRow.add(btnDivision);

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(102, 102, 102));
        btnClear.setText("CLR");
        btnClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnClear.setName("txtButtonNumber1"); // NOI18N
        btnClear.setVerifyInputWhenFocusTarget(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        fourthRow.add(btnClear);

        btnCompute.setBackground(new java.awt.Color(255, 255, 255));
        btnCompute.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnCompute.setForeground(new java.awt.Color(102, 102, 102));
        btnCompute.setText("=");
        btnCompute.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCompute.setName("txtButtonNumber1"); // NOI18N
        btnCompute.setVerifyInputWhenFocusTarget(false);
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });
        fourthRow.add(btnCompute);

        mainPanel.add(fourthRow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber2ActionPerformed

    private void btnNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber3ActionPerformed

    private void btnNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber4ActionPerformed

    private void btnNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber5ActionPerformed

    private void btnNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber6ActionPerformed

    private void btnNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber7ActionPerformed

    private void btnNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber8ActionPerformed

    private void btnNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber9ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComputeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btnClear;
    protected javax.swing.JButton btnCompute;
    protected javax.swing.JButton btnDivision;
    protected javax.swing.JButton btnMinus;
    protected javax.swing.JButton btnMultiply;
    protected javax.swing.JButton btnNumber1;
    protected javax.swing.JButton btnNumber2;
    protected javax.swing.JButton btnNumber3;
    protected javax.swing.JButton btnNumber4;
    protected javax.swing.JButton btnNumber5;
    protected javax.swing.JButton btnNumber6;
    protected javax.swing.JButton btnNumber7;
    protected javax.swing.JButton btnNumber8;
    protected javax.swing.JButton btnNumber9;
    protected javax.swing.JButton btnPlus;
    protected javax.swing.JPanel firstRow;
    protected javax.swing.JPanel fourthRow;
    protected javax.swing.JTextField jTextField1;
    protected javax.swing.JPanel mainPanel;
    protected javax.swing.JPanel secondRow;
    protected javax.swing.JPanel thirdRow;
    // End of variables declaration//GEN-END:variables
}
