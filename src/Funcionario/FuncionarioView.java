/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClienteView.java
 *
 * Created on 17/Dez/2011, 4:07:00
 */
package Funcionario;

import Auxiliares.*;
import MinhasClasses.EncriptaSenha;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo Silva
 */
public class FuncionarioView extends javax.swing.JFrame
{

    FuncionarioDAL fuDal;
    DefaultTableModel modelo;
    ArrayList<Funcionario> fu;
    boolean eNovo;
    int indice;

    /** Creates new form ClienteView */
    public FuncionarioView()
    {
        initComponents();

        URL url = this.getClass().getResource("/imagens/mail_48.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        eNovo = false;
        fuDal = new FuncionarioDAL();

        mudaEstado(false);

        AtualizaModelo();
    }

    private void AtualizaModelo()
    {
        String[] colunas =
        {
            "Numero", "Nome", "Login"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableFunc.setModel(modelo);

        fu = fuDal.SelectAll();
        for (Funcionario i : fu)
        {
            modelo.addRow(new Object[]
                    {
                        i.getCodfuncionario(), i.getNome(), i.getLogin()
                    });
        }
    }

    private void mudaEstado(boolean ativo)
    {
        txtNome.setEnabled(ativo);
        txtLogin.setEnabled(ativo);
        txtPassword.setEnabled(ativo);
        jcbFuncionario.setEnabled(ativo);

        btnGravar.setEnabled(ativo);
        btnCancelar.setEnabled(ativo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFunc = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jcbFuncionario = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Codigo Postal");
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setName("frmCodPostal"); // NOI18N
        setResizable(false);

        jLabel2.setText("Login");

        jLabel4.setText("Função");

        jLabel3.setText("Nome");

        txtNome.setBackground(new java.awt.Color(255, 255, 204));
        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12));

        jTableFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nome", "Login"
            }
        ));
        jTableFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFunc);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel_48.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accepted_48.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.setToolTipText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add_48.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(109, 33));
        btnNovo.setMinimumSize(new java.awt.Dimension(109, 33));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross_48.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_48.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(109, 33));
        btnEditar.setMinimumSize(new java.awt.Dimension(109, 33));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtPassword.setText("jPasswordField1");

        jLabel1.setText("Password");

        jcbFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Funcionário", "Gestor de Loja" }));
        jcbFuncionario.setEnabled(false);

        jLabel5.setText("Nº:");

        txtNum.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGravar))))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-563)/2, (screenSize.height-390)/2, 563, 390);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaCampos()
    {
        boolean falta = false;

        if (txtNome.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha o Nome");
            txtNome.requestFocus();
            falta = true;
        } else if (txtLogin.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha o Login");
            txtLogin.requestFocus();
            falta = true;
        } else if (txtPassword.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha a PassWord");
            txtPassword.requestFocus();
            falta = true;
        }
        return falta;
    }

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGravarActionPerformed
    {//GEN-HEADEREND:event_btnGravarActionPerformed
        Funcionario func = new Funcionario();
        if (!eNovo)
        {
            if (validaCampos() == false)
            {
                func.setCodfuncionario(Integer.parseInt(txtNum.getText()));
                func.setNome(txtNome.getText());
                func.setLogin(txtLogin.getText());
                func.setSenha(EncriptaSenha.encripta(txtPassword.getText().trim()));
                func.setFuncao(jcbFuncionario.getSelectedItem().toString());


                if (fuDal.Update(func))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Actualizado com sucesso!");
                    mudaEstado(false);
                }
            }

        } else
        {

            ArrayList<Funcionario> fun = fuDal.searchByNome("login", txtLogin.getText());

            if (fun.size() > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Já existe esse Login !");
                txtLogin.setText("");
                txtLogin.requestFocus();
            } else
            {
                if (validaCampos() == false)
                {
                    func.setNome(txtNome.getText());
                    func.setLogin(txtLogin.getText());
                    func.setSenha(txtPassword.getText().trim());
                    func.setFuncao(String.valueOf(jcbFuncionario.getModel().getSelectedItem()));

                    if (fuDal.Update(func))
                    {
                        AtualizaModelo();
                        JOptionPane.showMessageDialog(rootPane, "Actualizado com sucesso!");
                        mudaEstado(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        indice = jTableFunc.getSelectedRow();
        if (indice == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Escolha um Funcionário");
        } else
        {
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Pretende remover o Funcionário selecionado?",
                    "Remover", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION)
            {
                String CodFunc = (modelo.getValueAt(indice, 0).toString());
                if (fuDal.Delete(CodFunc))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "O Funcionário " + CodFunc + " foi removido");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        btnGravar.setEnabled(false);
        btnCancelar.setEnabled(false);
        mudaEstado(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        txtNome.setText("");
        txtLogin.setText("");
        txtPassword.setText("");

        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);

        mudaEstado(true);
        txtNome.requestFocus();
        eNovo = true;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jTableFuncMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableFuncMouseClicked
    {//GEN-HEADEREND:event_jTableFuncMouseClicked
        int row = jTableFunc.getSelectedRow();
        String valueAt = (modelo.getValueAt(row, 0).toString());

        for (Funcionario func : fu)
        {
            if (String.valueOf(func.getCodfuncionario()).equals(valueAt))
            {
                txtNum.setText(String.valueOf(func.getCodfuncionario()));
                txtNome.setText(func.getNome());
                txtLogin.setText(func.getLogin());
                txtPassword.setText(func.getSenha());
                jcbFuncionario.setSelectedItem(func.getFuncao());
            }
        }
    }//GEN-LAST:event_jTableFuncMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        if (jTableFunc.getSelectedRow() != -1)
        {
            btnGravar.setEnabled(true);
            btnCancelar.setEnabled(true);
            eNovo = false;
            mudaEstado(true);
            //txtNome.setEnabled(false);
        } else
        {
            JOptionPane.showMessageDialog(rootPane, "Escolha o Codigo Postal a editar!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new FuncionarioView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFunc;
    private javax.swing.JComboBox jcbFuncionario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
