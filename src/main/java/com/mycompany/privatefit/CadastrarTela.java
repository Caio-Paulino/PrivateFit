/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.privatefit;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class CadastrarTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarTela
     */
    public CadastrarTela() {
        super("Tela de Cadastro");
        initComponents();
        this.setLocationRelativeTo(null);
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
        txtNome = new javax.swing.JTextField();
        btnCadastrarTela = new javax.swing.JButton();
        txtCref = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnVoltarCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tela de Cadastro - Personal")));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(54, 142, 537, 59);

        btnCadastrarTela.setText("Cadastrar");
        btnCadastrarTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarTela);
        btnCadastrarTela.setBounds(54, 499, 100, 30);

        txtCref.setBorder(javax.swing.BorderFactory.createTitledBorder("CREF"));
        txtCref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrefActionPerformed(evt);
            }
        });
        jPanel1.add(txtCref);
        txtCref.setBounds(54, 59, 537, 57);

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Email")));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(54, 227, 537, 59);

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(54, 409, 537, 59);

        txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        jPanel1.add(txtSenha);
        txtSenha.setBounds(54, 318, 537, 59);

        btnVoltarCadastrar.setText("Voltar");
        btnVoltarCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarCadastrar);
        btnVoltarCadastrar.setBounds(500, 500, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTelaActionPerformed
        String cref = txtCref.getText();
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String senha = new String(txtSenha.getPassword());
        String telefone = txtTelefone.getText();
        
        try {
            Personal personal = new Personal (cref, nome ,email, senha, telefone);
            DAO dao = new DAO();
            dao.cadastrar(personal);
            JOptionPane.showMessageDialog(null, "Cadastro concluído!");
            
            LoginTela l = new LoginTela();
            l.setVisible(true);
            this.dispose();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar");
        }
    }//GEN-LAST:event_btnCadastrarTelaActionPerformed

    private void txtCrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrefActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnVoltarCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastrarActionPerformed
        LoginTela l = new LoginTela();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarTela;
    private javax.swing.JButton btnVoltarCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCref;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
