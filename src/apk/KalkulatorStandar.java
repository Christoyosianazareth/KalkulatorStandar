/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk;

/**
 *
 * @author GL553VD
 */
public class KalkulatorStandar extends javax.swing.JFrame {
    String angka="";
    double jumlah, angka1, angka2;
    int pilih;

    /**
     * Creates new form NewJFrame
     */
    public KalkulatorStandar() {
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

        buttonkurang = new javax.swing.JButton();
        buttonhasil = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        button9 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        buttonclear = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttontambah = new javax.swing.JButton();
        buttontitik = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        buttonakar = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonkali = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        buttonbagi = new javax.swing.JButton();
        buttonpersen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR");

        buttonkurang.setBackground(new java.awt.Color(255, 255, 0));
        buttonkurang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonkurang.setText("-");
        buttonkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkurangActionPerformed(evt);
            }
        });

        buttonhasil.setBackground(new java.awt.Color(255, 255, 0));
        buttonhasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonhasil.setText("=");
        buttonhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhasilActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(255, 255, 0));
        button8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 0));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(255, 255, 0));
        button9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(255, 255, 0));
        button7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        buttonclear.setBackground(new java.awt.Color(255, 255, 0));
        buttonclear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonclear.setText("C");
        buttonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonclearActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 255, 0));
        button3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(255, 255, 0));
        button0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        buttontambah.setBackground(new java.awt.Color(255, 255, 0));
        buttontambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttontambah.setText("+");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });

        buttontitik.setBackground(new java.awt.Color(255, 255, 0));
        buttontitik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttontitik.setText(".");
        buttontitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontitikActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 0));
        button4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 255, 0));
        button1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        buttonakar.setBackground(new java.awt.Color(255, 255, 0));
        buttonakar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonakar.setText("√");
        buttonakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonakarActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(255, 255, 0));
        button6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        buttonkali.setBackground(new java.awt.Color(255, 255, 0));
        buttonkali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonkali.setText("x");
        buttonkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkaliActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 0));
        button2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(255, 255, 0));
        button5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        buttonbagi.setBackground(new java.awt.Color(255, 255, 0));
        buttonbagi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonbagi.setText(":");
        buttonbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbagiActionPerformed(evt);
            }
        });

        buttonpersen.setBackground(new java.awt.Color(255, 255, 0));
        buttonpersen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonpersen.setText("%");
        buttonpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpersenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(buttonkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(buttonkali, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttontitik, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttontambah, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(buttonhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonakar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonakar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonkali, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttontitik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttontambah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(389, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;
        
        
    }//GEN-LAST:event_buttonkurangActionPerformed

    private void buttonhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhasilActionPerformed
        // TODO add your handling code here:
        switch(pilih){
            case 1:
            angka2=Double.parseDouble(angka);
            jumlah=angka1+angka2;
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            case 2:
            angka2=Double.parseDouble(angka);
            jumlah=angka1-angka2;
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            case 3:
            angka2=Double.parseDouble(angka);
            jumlah=angka1*angka2;
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            case 4:
            angka2=Double.parseDouble(angka);
            jumlah=angka1/angka2;
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            case 5:
            angka2=Double.parseDouble(angka);
            jumlah=Math.sqrt(angka1);
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            case 6:
            angka2=Double.parseDouble(angka);
            jumlah=angka1%angka2;
            angka=Double.toString(jumlah);
            display.setText(angka);
            break;
            
            default:
            break;
        }
        

    }//GEN-LAST:event_buttonhasilActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        angka +="8";
        display.setText(angka);
        
    }//GEN-LAST:event_button8ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        angka +="9";
        display.setText(angka);
        
    }//GEN-LAST:event_button9ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        angka +="7";
        display.setText(angka);
        
    }//GEN-LAST:event_button7ActionPerformed

    private void buttonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonclearActionPerformed
        // TODO add your handling code here:
        display.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka="";
        
        
    }//GEN-LAST:event_buttonclearActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        angka +="3";
        display.setText(angka);
    }//GEN-LAST:event_button3ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        // TODO add your handling code here:
        angka +="0";
        display.setText(angka);
        
    }//GEN-LAST:event_button0ActionPerformed

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("+");
        angka="";
        pilih=1;
        

    }//GEN-LAST:event_buttontambahActionPerformed

    private void buttontitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontitikActionPerformed
        // TODO add your handling code here:
        angka +=".";
        display.setText(angka);
    }//GEN-LAST:event_buttontitikActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        angka +="4";
        display.setText(angka);
       
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        angka +="1";
        display.setText(angka);
        

    }//GEN-LAST:event_button1ActionPerformed

    private void buttonakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonakarActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("√");
        angka="";
        pilih=5;
    }//GEN-LAST:event_buttonakarActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        angka +="6";
        display.setText(angka);
        
    }//GEN-LAST:event_button6ActionPerformed

    private void buttonkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("x");
        angka="";
        pilih=3;
        
        
    }//GEN-LAST:event_buttonkaliActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        angka +="2";
        display.setText(angka);
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        angka +="5";
        display.setText(angka);
        
    }//GEN-LAST:event_button5ActionPerformed

    private void buttonbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText(":");
        angka="";
        pilih=4;
        
        

    }//GEN-LAST:event_buttonbagiActionPerformed

    private void buttonpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpersenActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("%");
        angka="";
        pilih=6;
        
    }//GEN-LAST:event_buttonpersenActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorStandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorStandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorStandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorStandar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorStandar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonakar;
    private javax.swing.JButton buttonbagi;
    private javax.swing.JButton buttonclear;
    private javax.swing.JButton buttonhasil;
    private javax.swing.JButton buttonkali;
    private javax.swing.JButton buttonkurang;
    private javax.swing.JButton buttonpersen;
    private javax.swing.JButton buttontambah;
    private javax.swing.JButton buttontitik;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
