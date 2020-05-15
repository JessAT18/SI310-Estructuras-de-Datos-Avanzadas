
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class frmArbolM extends javax.swing.JFrame {

    ArbolM A1;
    public frmArbolM() {
        A1 = new ArbolM();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSumarNodos1 = new javax.swing.JButton();
        txtInsertar = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        btnSumar = new javax.swing.JButton();
        btnSumarPares = new javax.swing.JButton();
        btnCantNodos = new javax.swing.JButton();
        btnCantElementos = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();
        btnExiste = new javax.swing.JButton();
        btnMostrarElementosPares = new javax.swing.JButton();
        btnContarElementosPrimos = new javax.swing.JButton();
        btnMostrarSumaElementosHijos = new javax.swing.JButton();
        btnMostrarElemMayorHijo = new javax.swing.JButton();
        btnMostrarElemPrimos = new javax.swing.JButton();
        btnCantElemMayX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnSumarNodos1.setText("SumarNodos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÁRBOLES M VIAS - Jessica Aquino");
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N

        txtInsertar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsertarActionPerformed(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnPreOrden.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        btnInOrden.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        jta.setColumns(20);
        jta.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        btnSumar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnSumarPares.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnSumarPares.setText("SumarPares");
        btnSumarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarParesActionPerformed(evt);
            }
        });

        btnCantNodos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnCantNodos.setText("Cant. Nodos");
        btnCantNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantNodosActionPerformed(evt);
            }
        });

        btnCantElementos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnCantElementos.setText("Cant. Elementos");
        btnCantElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantElementosActionPerformed(evt);
            }
        });

        btnAltura.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnAltura.setText("Altura");
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });

        btnExiste.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnExiste.setText("Existe");
        btnExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExisteActionPerformed(evt);
            }
        });

        btnMostrarElementosPares.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnMostrarElementosPares.setText("MostrarElementosPares");
        btnMostrarElementosPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElementosParesActionPerformed(evt);
            }
        });

        btnContarElementosPrimos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnContarElementosPrimos.setText("ContarElementosPrimos");
        btnContarElementosPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarElementosPrimosActionPerformed(evt);
            }
        });

        btnMostrarSumaElementosHijos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnMostrarSumaElementosHijos.setText("MostrarSumaElementosHijos");
        btnMostrarSumaElementosHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSumaElementosHijosActionPerformed(evt);
            }
        });

        btnMostrarElemMayorHijo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnMostrarElemMayorHijo.setText("MostrarElementoMayorHijos");
        btnMostrarElemMayorHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElemMayorHijoActionPerformed(evt);
            }
        });

        btnMostrarElemPrimos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnMostrarElemPrimos.setText("MostrarElementosPrimos");
        btnMostrarElemPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarElemPrimosActionPerformed(evt);
            }
        });

        btnCantElemMayX.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnCantElemMayX.setText("CantidadElementosMayoresAX");
        btnCantElemMayX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantElemMayXActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Práctico Árboles M-Vias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPreOrden)
                        .addGap(18, 18, 18)
                        .addComponent(btnInOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarElementosPares)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrarElemMayorHijo)
                                    .addComponent(btnMostrarSumaElementosHijos)
                                    .addComponent(btnContarElementosPrimos))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCantElemMayX)
                                .addComponent(btnMostrarElemPrimos)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSumarPares))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnSumar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCantNodos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAltura))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCantElementos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExiste)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContarElementosPrimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarSumaElementosHijos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarElemMayorHijo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCantElemMayX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarElemPrimos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCantNodos)
                            .addComponent(btnSumar)
                            .addComponent(btnAltura))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInOrden)
                    .addComponent(btnPreOrden)
                    .addComponent(btnMostrarElementosPares)
                    .addComponent(btnSumarPares)
                    .addComponent(btnCantElementos)
                    .addComponent(btnExiste))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        A1.InOrden(jta);
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int x = Integer.parseInt(txtInsertar.getText());
        A1.Insertar(x);
        txtInsertar.setText("");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        // TODO add your handling code here:
        A1.PreOrden(jta);
    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        int x = A1.sumarElementos();
        JOptionPane.showMessageDialog(this, "Suma: "+String.valueOf(x));
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnSumarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarParesActionPerformed
        // TODO add your handling code here:
        int x = A1.sumarElementosPares();
        JOptionPane.showMessageDialog(this, "Suma Pares: "+String.valueOf(x));
    }//GEN-LAST:event_btnSumarParesActionPerformed

    private void btnCantNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantNodosActionPerformed
        // TODO add your handling code here:
        int x = A1.CantNodos();
        JOptionPane.showMessageDialog(this, "Cantidad Nodos: "+String.valueOf(x));
    }//GEN-LAST:event_btnCantNodosActionPerformed

    private void btnCantElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantElementosActionPerformed
        // TODO add your handling code here:
        int x = A1.CantElementos();
        JOptionPane.showMessageDialog(this, "Cantidad Elementos: "+String.valueOf(x));
    }//GEN-LAST:event_btnCantElementosActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        // TODO add your handling code here:
        int x = A1.Altura();
        JOptionPane.showMessageDialog(this, "Altura: "+String.valueOf(x));
    }//GEN-LAST:event_btnAlturaActionPerformed

    private void btnExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteActionPerformed
        // TODO add your handling code here:
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento"));
        boolean x = A1.existe(c);
        JOptionPane.showMessageDialog(this, String.valueOf(x));
    }//GEN-LAST:event_btnExisteActionPerformed

    private void btnMostrarElementosParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElementosParesActionPerformed
        // TODO add your handling code here:
        A1.mostrarElementosPares(jta);
    }//GEN-LAST:event_btnMostrarElementosParesActionPerformed

    private void btnContarElementosPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarElementosPrimosActionPerformed
        // TODO add your handling code here:
        int x = A1.CantElementosPrimos();/*
        JLabel l = new JLabel("Cantidad de elementos primos: "+String.valueOf(x));
        l.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        JOptionPane.showMessageDialog(this, l, "Cantidad de elementos primos",JOptionPane.PLAIN_MESSAGE);*/
        JOptionPane.showMessageDialog(this, "Cantidad de elementos primos: "+String.valueOf(x));
    }//GEN-LAST:event_btnContarElementosPrimosActionPerformed

    private void btnMostrarSumaElementosHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSumaElementosHijosActionPerformed
        // TODO add your handling code here:
        A1.mostrarSumaHijos(jta);
    }//GEN-LAST:event_btnMostrarSumaElementosHijosActionPerformed

    private void txtInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsertarActionPerformed
        // TODO add your handling code here:        
        int x = Integer.parseInt(txtInsertar.getText());
        A1.Insertar(x);
        txtInsertar.setText("");
    }//GEN-LAST:event_txtInsertarActionPerformed

    private void btnMostrarElemMayorHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElemMayorHijoActionPerformed
        // TODO add your handling code here:
        A1.mostrarMayorHijos(jta);
    }//GEN-LAST:event_btnMostrarElemMayorHijoActionPerformed

    private void btnMostrarElemPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarElemPrimosActionPerformed
        // TODO add your handling code here:
        A1.mostrarElementosPrimos(jta);
    }//GEN-LAST:event_btnMostrarElemPrimosActionPerformed

    private void btnCantElemMayXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantElemMayXActionPerformed
        // TODO add your handling code here:
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento"));
        int x = A1.CantMayoresX(c);
        JOptionPane.showMessageDialog(this, String.valueOf(x));
    }//GEN-LAST:event_btnCantElemMayXActionPerformed

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
            java.util.logging.Logger.getLogger(frmArbolM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmArbolM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmArbolM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmArbolM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmArbolM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltura;
    private javax.swing.JButton btnCantElemMayX;
    private javax.swing.JButton btnCantElementos;
    private javax.swing.JButton btnCantNodos;
    private javax.swing.JButton btnContarElementosPrimos;
    private javax.swing.JButton btnExiste;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMostrarElemMayorHijo;
    private javax.swing.JButton btnMostrarElemPrimos;
    private javax.swing.JButton btnMostrarElementosPares;
    private javax.swing.JButton btnMostrarSumaElementosHijos;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnSumarNodos1;
    private javax.swing.JButton btnSumarPares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField txtInsertar;
    // End of variables declaration//GEN-END:variables
}
