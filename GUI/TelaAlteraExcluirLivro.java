/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.GUI;

import biblioteca.livro;
import conectBD.biblioteca.LivroConfig;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Marques
 */
public class TelaAlteraExcluirLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAlteraExcluir
     */
    public TelaAlteraExcluirLivro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Painel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Painel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JTextField();
        Confirma2 = new javax.swing.JButton();

        setClosable(true);

        Painel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar"));

        jLabel1.setText("Titulo");

        txtTitulo.setEnabled(false);

        jLabel2.setText("Quantidade");

        txtQuantidade.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1491426228_Apply.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(65, 65, 65)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantidade))
                        .addGap(28, 28, 28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Adicionar");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Excluir");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        Painel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Excluir"));

        jLabel3.setText("Titulo");

        Titulo2.setEnabled(false);

        Confirma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1491426228_Apply.png"))); // NOI18N
        Confirma2.setText("Confirmar");
        Confirma2.setEnabled(false);
        Confirma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirma2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirma2)
                .addContainerGap())
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Confirma2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Titulo2.setEnabled(false);
        Confirma2.setEnabled(false);

        txtTitulo.setEnabled(true);
        txtQuantidade.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        txtTitulo.setEnabled(false);
        txtQuantidade.setEnabled(false);
        jButton1.setEnabled(false);

        Titulo2.setEnabled(true);
        Confirma2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LivroConfig LC = new LivroConfig();
        List<livro> lista = new ArrayList<livro>();
        lista = LC.getDados(txtTitulo.getText());
        try {
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Livro nao existe.");
            }else{
                LC.Add(txtTitulo.getText(), Integer.parseInt(txtQuantidade.getText()));
                JOptionPane.showMessageDialog(null, "Livro Adicionado com Sucesso!");
                txtTitulo.setText("");
                txtQuantidade.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAlteraExcluirLivro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Confirma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirma2ActionPerformed
        // TODO add your handling code here:
        LivroConfig LC = new LivroConfig();
        List<livro> lista = new ArrayList<livro>();
        lista = LC.getDados(Titulo2.getText());
        try {
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Livro nao existe.");
            }else{
                LC.ExcluirLivro(Titulo2.getText());
                JOptionPane.showMessageDialog(null, "Livro Excluido com Sucesso!");
                Titulo2.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAlteraExcluirLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Confirma2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirma2;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JTextField Titulo2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
