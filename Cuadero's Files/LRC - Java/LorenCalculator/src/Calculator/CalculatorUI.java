/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author student.admin
 */
public class CalculatorUI extends javax.swing.JFrame {

    // declare a variable 
    
    double previousValue =0;
    /**
     * Creates new form CalculatorUI
     */
    public CalculatorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldOutput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonZero = new javax.swing.JButton();
        jButtonTimes = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonNegativeOrPositive = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonClear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOutputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("El'Cuadero");

        jButtonZero.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonZero.setForeground(new java.awt.Color(0, 0, 153));
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonTimes.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonTimes.setForeground(new java.awt.Color(0, 0, 153));
        jButtonTimes.setText("*");

        jButtonThree.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonThree.setForeground(new java.awt.Color(0, 0, 153));
        jButtonThree.setText("3");
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });

        jButtonTwo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonTwo.setForeground(new java.awt.Color(0, 0, 153));
        jButtonTwo.setText("2");
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });

        jButtonOne.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonOne.setForeground(new java.awt.Color(0, 0, 153));
        jButtonOne.setText("1");
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });

        jButtonSix.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonSix.setForeground(new java.awt.Color(0, 0, 153));
        jButtonSix.setText("6");
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });

        jButtonSeven.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonSeven.setForeground(new java.awt.Color(0, 0, 153));
        jButtonSeven.setText("7");
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });

        jButtonNegativeOrPositive.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonNegativeOrPositive.setForeground(new java.awt.Color(0, 0, 153));
        jButtonNegativeOrPositive.setText("+/-");

        jButtonFive.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonFive.setForeground(new java.awt.Color(0, 0, 153));
        jButtonFive.setText("5");
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiveActionPerformed(evt);
            }
        });

        jButtonEight.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonEight.setForeground(new java.awt.Color(0, 0, 153));
        jButtonEight.setText("8");
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });

        jButtonDot.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jButtonDot.setForeground(new java.awt.Color(0, 0, 153));
        jButtonDot.setText(".");

        jButtonDivide.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonDivide.setForeground(new java.awt.Color(0, 0, 153));
        jButtonDivide.setText("/");

        jButtonEquals.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonEquals.setForeground(new java.awt.Color(0, 0, 153));
        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonFour.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonFour.setForeground(new java.awt.Color(0, 0, 153));
        jButtonFour.setText("4");
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourActionPerformed(evt);
            }
        });

        jButtonNine.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonNine.setForeground(new java.awt.Color(0, 0, 153));
        jButtonNine.setText("9");
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonMinus.setForeground(new java.awt.Color(0, 0, 153));
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonPlus.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonPlus.setForeground(new java.awt.Color(0, 0, 153));
        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonClear1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButtonClear1.setForeground(new java.awt.Color(0, 0, 153));
        jButtonClear1.setText("C");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldOutput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNegativeOrPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNegativeOrPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOutputActionPerformed
        jTextFieldOutput.setText("");

    }//GEN-LAST:event_jTextFieldOutputActionPerformed

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOneActionPerformed
        String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "1");

        
    }//GEN-LAST:event_jButtonOneActionPerformed

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "2");
    }//GEN-LAST:event_jButtonTwoActionPerformed

    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThreeActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "3");
    }//GEN-LAST:event_jButtonThreeActionPerformed

    private void jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFourActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "4");
    }//GEN-LAST:event_jButtonFourActionPerformed

    private void jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiveActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "5");
    }//GEN-LAST:event_jButtonFiveActionPerformed

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSixActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "6");
    }//GEN-LAST:event_jButtonSixActionPerformed

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSevenActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "7");
    }//GEN-LAST:event_jButtonSevenActionPerformed

    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEightActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "8");
    }//GEN-LAST:event_jButtonEightActionPerformed

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNineActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "9");
    }//GEN-LAST:event_jButtonNineActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
    String oldValue = jTextFieldOutput.getText();
        jTextFieldOutput.setText(oldValue + "0");
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        previousValue = Double.parseDouble(jTextFieldOutput.getText());
        jTextFieldOutput.setText("");
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
//        String answer;
        
        double currentValue = Double.parseDouble(jTextFieldOutput.getText());
        double sum = previousValue + currentValue;
        jTextFieldOutput.setText(" " + sum);
        
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
//        previousValue = Double.parseDouble(jTextFieldOutput.getText());
//        jTextFieldOutput.setText("");
    }//GEN-LAST:event_jButtonMinusActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear1;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonNegativeOrPositive;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTimes;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldOutput;
    // End of variables declaration//GEN-END:variables
}