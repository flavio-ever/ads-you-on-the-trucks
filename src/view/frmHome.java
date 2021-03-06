/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author elvis
 */
public class frmHome extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public frmHome() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnVeiculos = new javax.swing.JMenuItem();
        mnCliente = new javax.swing.JMenuItem();
        mnAlugados = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnSobre = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("v2.0.1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 120, 70, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setText("You On The Tracks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 170, 460, 70);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Aluguel de veículos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 240, 460, 50);

        jMenu1.setText("Administrativo");

        mnVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mnVeiculos.setText("Veículos");
        mnVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVeiculosActionPerformed(evt);
            }
        });
        jMenu1.add(mnVeiculos);

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        mnCliente.setText("Clientes");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnCliente);

        mnAlugados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mnAlugados.setText("Alugados");
        mnAlugados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlugadosActionPerformed(evt);
            }
        });
        jMenu1.add(mnAlugados);

        mnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informativo");

        mnSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSobre.setText("Sobre");
        mnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSobreActionPerformed(evt);
            }
        });
        jMenu2.add(mnSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1094, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVeiculosActionPerformed
        frmVeiculos veiculos = new frmVeiculos();
        veiculos.setVisible(true);
    }//GEN-LAST:event_mnVeiculosActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        frmClientes clientes = new frmClientes();
        clientes.setVisible(true);
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlugadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlugadosActionPerformed
        frmAlugados alugados = new frmAlugados();
        alugados.setVisible(true);
    }//GEN-LAST:event_mnAlugadosActionPerformed

    private void mnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSobreActionPerformed
        frmSobre sobre = new frmSobre();
        sobre.setVisible(true);
        
        
    }//GEN-LAST:event_mnSobreActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnAlugados;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnSobre;
    private javax.swing.JMenuItem mnVeiculos;
    // End of variables declaration//GEN-END:variables
}
