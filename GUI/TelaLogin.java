/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.GUI;

import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author henrico
 */
public class TelaLogin extends javax.swing.JDialog {
     
    String login,senha;
    /**
     * Creates new form TelaLogin
     * @param parent
     * @param modal
     */
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(0);//nao permite que feche a tela login no 'x'
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        LabelM = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);
        jPanel1.add(txtLogin);
        txtLogin.setBounds(120, 120, 170, 30);

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(120, 180, 170, 30);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 230, 63, 23);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 230, 60, 23);

        jLabel1.setText("Usuario");
        jLabel1.setIconTextGap(10);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 100, 50, 14);

        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 160, 50, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo_biblioteca.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 300);

        jProgressBar3.setForeground(new java.awt.Color(0, 153, 255));
        jProgressBar3.setStringPainted(true);
        jPanel1.add(jProgressBar3);
        jProgressBar3.setBounds(250, 280, 146, 17);

        LabelM.setText(".");
        jPanel1.add(LabelM);
        LabelM.setBounds(250, 260, 140, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      if(txtLogin.getText().equals("User") && txtSenha.getText().equals("1234")){
            login = txtLogin.getText();
            senha = txtSenha.getText();
            new Thread(){
                public void run(){
                    for (int i = 0; i<101 ; i++){
                        try {
                            sleep(10);
                            jProgressBar3.setValue(i);
                            if(jProgressBar3.getValue() <= 25){
                                LabelM.setText("Carregando Sistema...");
                            }else if(jProgressBar3.getValue() <= 50){
                                LabelM.setText("Carregando Informações...");
                            }else if(jProgressBar3.getValue() <= 75){
                                LabelM.setText("Validando Dados...");
                            }else{
                                LabelM.setText("Abrindo Sistema...");
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    TelaLogin.super.dispose();
                    
                }
            
            }.start();
            
        }else{
            JOptionPane.showMessageDialog(null,"acesso negado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtLogin.getText().equals("User") && txtSenha.getText().equals("1234")){
            login = txtLogin.getText();
            senha = txtSenha.getText();
            new Thread(){
                public void run(){
                    for (int i = 0; i<101 ; i++){
                        try {
                            sleep(10);
                            jProgressBar3.setValue(i);
                            if(jProgressBar3.getValue() <= 25){
                                LabelM.setText("Carregando Sistema...");
                            }else if(jProgressBar3.getValue() <= 50){
                                LabelM.setText("Carregando Informações...");
                            }else if(jProgressBar3.getValue() <= 75){
                                LabelM.setText("Validando Dados...");
                            }else{
                                LabelM.setText("Abrindo Sistema...");
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    TelaLogin.super.dispose();
                    
                }
            
            }.start();
            
        }else{
            JOptionPane.showMessageDialog(null,"acesso negado!");
        }
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
