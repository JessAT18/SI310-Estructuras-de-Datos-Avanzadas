
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class frmArbol extends javax.swing.JFrame {

    /**
     * Creates new form frmArbol
     */
    Arbol A1;
    public frmArbol() {
        initComponents();
        A1 = new Arbol();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        btnInsertar = new javax.swing.JButton();
        btnpreOrden = new javax.swing.JButton();
        txtElemento = new javax.swing.JTextField();
        btnInOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnSumarPares = new javax.swing.JButton();
        btnContarPares = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        btnExiste = new javax.swing.JButton();
        btnSonHermanos = new javax.swing.JButton();
        btnIncompletos = new javax.swing.JButton();
        btnMostrarPares = new javax.swing.JButton();
        btnContarHojas = new javax.swing.JButton();
        btnretornaAbuelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnpreOrden.setText("PreOrden");
        btnpreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreOrdenActionPerformed(evt);
            }
        });

        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });

        btnSuma.setText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnSumarPares.setText("SumarPares");
        btnSumarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarParesActionPerformed(evt);
            }
        });

        btnContarPares.setText("ContarPares");
        btnContarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarParesActionPerformed(evt);
            }
        });

        btnAltura.setText("Altura");
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });

        btnMenor.setText("Menor");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });

        btnExiste.setText("Existe");
        btnExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExisteActionPerformed(evt);
            }
        });

        btnSonHermanos.setText("Son Hermanos");
        btnSonHermanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonHermanosActionPerformed(evt);
            }
        });

        btnIncompletos.setText("Contar incompletos");
        btnIncompletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncompletosActionPerformed(evt);
            }
        });

        btnMostrarPares.setText("Mostrar Pares");
        btnMostrarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarParesActionPerformed(evt);
            }
        });

        btnContarHojas.setText("Contar Hojas");
        btnContarHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarHojasActionPerformed(evt);
            }
        });

        btnretornaAbuelo.setText("RetornarAbuelo");
        btnretornaAbuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretornaAbueloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(btnInsertar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExiste)
                            .addComponent(btnSonHermanos)
                            .addComponent(btnIncompletos)
                            .addComponent(btnMostrarPares)
                            .addComponent(btnContarHojas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuma)
                                    .addComponent(btnpreOrden))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInOrden)
                                    .addComponent(btnSumarPares)
                                    .addComponent(btnMenor)))
                            .addComponent(btnAltura))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContarPares)
                            .addComponent(btnPostOrden)
                            .addComponent(btnretornaAbuelo))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(txtElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnExiste)
                        .addGap(18, 18, 18)
                        .addComponent(btnSonHermanos)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncompletos)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarPares)
                        .addGap(18, 18, 18)
                        .addComponent(btnContarHojas)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnSumarPares)
                    .addComponent(btnContarPares))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpreOrden)
                    .addComponent(btnInOrden)
                    .addComponent(btnPostOrden))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltura)
                    .addComponent(btnMenor)
                    .addComponent(btnretornaAbuelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(txtElemento.getText());
        A1.insertar(x);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnpreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreOrdenActionPerformed
        // TODO add your handling code here:
        A1.preOrden(jta);
    }//GEN-LAST:event_btnpreOrdenActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        // TODO add your handling code here:
        A1.InOrden(jta);
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        // TODO add your handling code here:
        A1.PostOrden(jta);
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        int x = A1.suma();
        JOptionPane.showMessageDialog(rootPane, String.valueOf(x));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnSumarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarParesActionPerformed
        // TODO add your handling code here:
        int x = A1.sumaPares();
        JOptionPane.showMessageDialog(rootPane, String.valueOf(x));
    }//GEN-LAST:event_btnSumarParesActionPerformed

    private void btnContarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarParesActionPerformed
        // TODO add your handling code here:
        int x = A1.contarPares();
        JOptionPane.showMessageDialog(rootPane, String.valueOf(x));
    }//GEN-LAST:event_btnContarParesActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        // TODO add your handling code here:
        int x = A1.altura();
        JOptionPane.showMessageDialog(this, String.valueOf(x));
    }//GEN-LAST:event_btnAlturaActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        // TODO add your handling code here:
        int x = A1.menor();
        JOptionPane.showMessageDialog(this, String.valueOf(x));
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteActionPerformed
        // TODO add your handling code here:
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insertar elemento que existe"));
        boolean a = A1.existe(x);
        JOptionPane.showMessageDialog(this, String.valueOf(a));
    }//GEN-LAST:event_btnExisteActionPerformed

    private void btnSonHermanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonHermanosActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insertar hermano 1"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Insertar hermano 2"));
        boolean a = A1.sonHermanos(x, y);
        JOptionPane.showMessageDialog(this, String.valueOf(a));
    }//GEN-LAST:event_btnSonHermanosActionPerformed

    private void btnIncompletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncompletosActionPerformed
        // TODO add your handling code here:
        int a = A1.contarIncompletos();
        JOptionPane.showMessageDialog(this, String.valueOf(a));
    }//GEN-LAST:event_btnIncompletosActionPerformed

    private void btnMostrarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarParesActionPerformed
        // TODO add your handling code here:
        A1.mostrarPares(jta);
    }//GEN-LAST:event_btnMostrarParesActionPerformed

    private void btnContarHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarHojasActionPerformed
        // TODO add your handling code here:
        int a = A1.cantHojas();
        JOptionPane.showMessageDialog(this, String.valueOf(a));
    }//GEN-LAST:event_btnContarHojasActionPerformed

    private void btnretornaAbueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretornaAbueloActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insertar valor entero del nieto"));
        int a = A1.retornaAbuelo(x);
        if(a==0)
            JOptionPane.showMessageDialog(this, "No tiene abuelo");
        else
            JOptionPane.showMessageDialog(this, String.valueOf(a));
    }//GEN-LAST:event_btnretornaAbueloActionPerformed

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
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmArbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmArbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltura;
    private javax.swing.JButton btnContarHojas;
    private javax.swing.JButton btnContarPares;
    private javax.swing.JButton btnExiste;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnIncompletos;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnMostrarPares;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnSonHermanos;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnSumarPares;
    private javax.swing.JButton btnpreOrden;
    private javax.swing.JButton btnretornaAbuelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField txtElemento;
    // End of variables declaration//GEN-END:variables
}