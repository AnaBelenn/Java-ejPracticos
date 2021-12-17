package Swing;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class EjercicioTV extends javax.swing.JFrame {
        private boolean estado=false;
        private int canal=0;
        private int vol=0;
        String tvOn= "tvOn.png";
        String tvOff= "tvOff.png";
    /**
     * Creates new form EjercicioTV
     */
    public EjercicioTV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        estadotv = new javax.swing.JToggleButton();
        nrocanal = new javax.swing.JLabel();
        can1 = new javax.swing.JButton();
        can0 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        volumen = new javax.swing.JProgressBar();
        volup = new javax.swing.JButton();
        voldown = new javax.swing.JButton();
        imgtv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Television");

        estadotv.setText("Encender");
        estadotv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadotvActionPerformed(evt);
            }
        });

        nrocanal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nrocanal.setText("Canal:");

        can1.setText("Canal +");
        can1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                can1ActionPerformed(evt);
            }
        });

        can0.setText("Canal -");
        can0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                can0ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Volumen:");

        volumen.setMaximum(15);

        volup.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        volup.setText("+");
        volup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volupActionPerformed(evt);
            }
        });

        voldown.setText("-");
        voldown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voldownActionPerformed(evt);
            }
        });

        imgtv.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\tvOff.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nrocanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(can1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(volup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(voldown)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(can0, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(estadotv, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imgtv))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(estadotv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrocanal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can0)
                    .addComponent(can1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(volup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(voldown))
                    .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imgtv, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadotvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadotvActionPerformed
        if (estadotv.isSelected()) {
            estadotv.setText("Apagar");
            estado=true;
            imgtv.setIcon(new ImageIcon(getClass().getResource(tvOn)));
        } else {
            estadotv.setText("Encender");
            estado= false;
            imgtv.setIcon(new ImageIcon(getClass().getResource(tvOff)));
        }
    }//GEN-LAST:event_estadotvActionPerformed

    private void can1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_can1ActionPerformed
        // TODO add your handling code here:
        
            if (estado) {
                canal++;
                nrocanal.setText("Canal: "+canal);
            } else {
                JOptionPane.showMessageDialog(null, "Debe encender el televisor.");
            }
        
    }//GEN-LAST:event_can1ActionPerformed

    private void can0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_can0ActionPerformed
        // TODO add your handling code here:
        
            if (estado) {
                if (canal>0) {
                    canal--;
                    nrocanal.setText("Canal: "+canal);
                } else {
                    JOptionPane.showMessageDialog(null, "No puede seguir bajando.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe encender el televisor.");
            }
                   
        
    }//GEN-LAST:event_can0ActionPerformed

    private void volupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volupActionPerformed
        if (estado) {
            if (vol<15) {
            vol++;
            volumen.setValue(vol);
            } else {
            JOptionPane.showMessageDialog(null, "Volumen maximo.");
        }
        } else {
                JOptionPane.showMessageDialog(null, "Debe encender el televisor.");
        }
        
    }//GEN-LAST:event_volupActionPerformed

    private void voldownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voldownActionPerformed
        // TODO add your handling code here:
        if (estado) {
            if (vol>0) {
                vol--;
                volumen.setValue(vol);
            } else {
                JOptionPane.showMessageDialog(null, "Volumen minimo.");
            }
        } else {
                JOptionPane.showMessageDialog(null, "Debe encender el televisor.");
        }
    }//GEN-LAST:event_voldownActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioTV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton can0;
    private javax.swing.JButton can1;
    private javax.swing.JToggleButton estadotv;
    private javax.swing.JLabel imgtv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nrocanal;
    private javax.swing.JButton voldown;
    private javax.swing.JProgressBar volumen;
    private javax.swing.JButton volup;
    // End of variables declaration//GEN-END:variables
}
