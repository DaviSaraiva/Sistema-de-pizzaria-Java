package br.com.Space.telas;

import br.com.Space.dal.ModuloDeConexao;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;



public class TelaPrincipalSpace extends javax.swing.JFrame {

    Connection conexao = null;

    public TelaPrincipalSpace() {
        initComponents();
        conexao = ModuloDeConexao.conector();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        lbldata = new javax.swing.JLabel();
        ImageIcon icon= new ImageIcon(getClass().getResource("/imagem/pizza-foto.jpg"));
        Image image= icon.getImage();
        Desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadFun = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal SpacePizza");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbldata.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lbldata.setText("DATA");

        Desktop.setBackground(new java.awt.Color(0, 0, 255));
        Desktop.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1349, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/download.png"))); // NOI18N

        lblUsuario.setText("Usuario");

        cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_thefreeforty_register_1243707.png"))); // NOI18N
        cadastro.setName(""); // NOI18N
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        MenCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_emblem-people_24702_1.png"))); // NOI18N
        MenCadCli.setText("Cliente");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        cadastro.add(MenCadCli);

        MenCadFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_Client_Male_Dark_80823.png"))); // NOI18N
        MenCadFun.setText("Usuarios");
        MenCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadFunActionPerformed(evt);
            }
        });
        cadastro.add(MenCadFun);

        jMenuBar1.add(cadastro);
        cadastro.getAccessibleContext().setAccessibleName("Cadastrar");
        cadastro.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_order_2639879.png"))); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_order-1_54236.png"))); // NOI18N
        jMenuItem1.setText("Pedidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_m-21_4230540.png"))); // NOI18N

        jMenuItem3.setText("Clientes");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_order_49538.png"))); // NOI18N
        jMenuItem4.setText("relatoio pedidos ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Space/icones/iconfinder_money-3_322465.png"))); // NOI18N
        jMenuItem5.setText("Valor diario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblUsuario)
                .addGap(79, 79, 79)
                .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed

    }//GEN-LAST:event_cadastroActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // adicionar data 
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lbldata.setText(formatador.format(data));


    }//GEN-LAST:event_formWindowActivated

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed
        CadastroClientes cad = new CadastroClientes();
        cad.setVisible(true);
        Desktop.add(cad);

 
    }//GEN-LAST:event_MenCadCliActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Pedidos ped = new Pedidos();
        ped.setVisible(true);
        Desktop.add(ped);    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Os1 os= new Os1();
        os.setVisible(true);
        Desktop.add(os);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MenCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadFunActionPerformed
       TelaUsuarioSpace usu=new TelaUsuarioSpace();
       usu.setVisible(true);
       Desktop.add(usu);
    }//GEN-LAST:event_MenCadFunActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ValorDiario vd=new ValorDiario();
        vd.setVisible(true);
        Desktop.add(vd);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalSpace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MenCadCli;
    javax.swing.JMenuItem MenCadFun;
    private javax.swing.JMenu cadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbldata;
    // End of variables declaration//GEN-END:variables
}
