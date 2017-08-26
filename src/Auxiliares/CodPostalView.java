/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClienteView.java
 *
 * Created on 17/Dez/2011, 4:07:00
 */
package Auxiliares;

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
public class CodPostalView extends javax.swing.JFrame
{

    CodPostalDAL cpDal;
    DefaultTableModel modelo;
    ArrayList<CodPostal> cp;
    boolean eNovo;
    int indice;

    /** Creates new form ClienteView */
    public CodPostalView()
    {
        initComponents();
        URL url = this.getClass().getResource("/imagens/mail_48.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        eNovo = false;
        cpDal = new CodPostalDAL();

        mudaEstado(false);

        AtualizaModelo();
    }

    private void AtualizaModelo()
    {
        String[] colunas =
        {
            "CodPostal", "Localidade", "Cidade"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableCodPostal.setModel(modelo);

        cp = cpDal.SelectAll();
        for (CodPostal i : cp)
        {
            modelo.addRow(new Object[]
                    {
                        i.getCodPostal(), i.getLocalidade(), i.getCidade()
                    });
        }
    }

    private void mudaEstado(boolean ativo)
    {
        txtCodPostal.setEnabled(ativo);
        txtLocalidade.setEnabled(ativo);
        txtCidade.setEnabled(ativo);

        btnGravar.setEnabled(ativo);
        btnCancelar.setEnabled(ativo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtLocalidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCodPostal = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Codigo Postal");
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setName("frmCodPostal"); // NOI18N
        setResizable(false);

        jLabel2.setText("Localidade");

        jLabel4.setText("Cidade");

        jLabel3.setText("Cod. Postal");

        txtCodPostal.setBackground(new java.awt.Color(255, 255, 204));
        txtCodPostal.setFont(new java.awt.Font("Tahoma", 1, 12));

        jTableCodPostal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CodPostal", "Localidade", "Cidade"
            }
        ));
        jTableCodPostal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCodPostalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCodPostal);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel_48.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Tahoma", 1, 11));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodPostal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLocalidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))))
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
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        if (txtCodPostal.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha o Codigo Postal");
            txtCodPostal.requestFocus();
            falta = true;
        } else if (txtLocalidade.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha a Localidade");
            txtLocalidade.requestFocus();
            falta = true;
        } else if (txtCidade.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha a Cidade");
            txtCidade.requestFocus();
            falta = true;
        }
        return falta;
    }

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGravarActionPerformed
    {//GEN-HEADEREND:event_btnGravarActionPerformed
        CodPostal cPostal = new CodPostal();
        if (!eNovo)
        {
            if (validaCampos() == false)
            {
                cPostal.setCodPostal(txtCodPostal.getText());
                cPostal.setLocalidade(txtLocalidade.getText());
                cPostal.setCidade(txtCidade.getText());

                if (cpDal.Update(cPostal))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Actualizado com sucesso!");
                    mudaEstado(false);
                }
            }

        } 
        else
        {

            ArrayList<CodPostal> sel = cpDal.searchByNome("codpostal", txtCodPostal.getText());

            if (sel.size() > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Já existe esse Codigo !");
                txtCodPostal.setText("");
                txtCodPostal.requestFocus();
            } else
            {
                if (validaCampos() == false)
                {
                    cPostal.setCodPostal(txtCodPostal.getText());
                    cPostal.setLocalidade(txtLocalidade.getText());
                    cPostal.setCidade(txtCidade.getText());

                    if (cpDal.Insert(cPostal))
                    {
                        AtualizaModelo();
                        JOptionPane.showMessageDialog(rootPane, "Adicionado com sucesso!");
                        mudaEstado(false);
                    }
                    eNovo = false;
                }
            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        indice = jTableCodPostal.getSelectedRow();
        if (indice == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Escolha um Codigo Postal");
        } else
        {
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Pretende remover o Codigo Postal selecionado?",
                    "Remover", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION)
            {
                String CodPostal = (modelo.getValueAt(indice, 0).toString());
                if (cpDal.Delete(CodPostal))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Codigo Postal " + CodPostal + " removido");
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
        txtCodPostal.setText("");
        txtLocalidade.setText("");
        txtCidade.setText("");

        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);

        mudaEstado(true);
        txtCodPostal.requestFocus();
        eNovo = true;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jTableCodPostalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableCodPostalMouseClicked
    {//GEN-HEADEREND:event_jTableCodPostalMouseClicked
        int row = jTableCodPostal.getSelectedRow();
        String valueAt = (modelo.getValueAt(row, 0).toString());

        for (CodPostal codP : cp)
        {
            if (codP.getCodPostal().equals(valueAt))
            {
                txtCodPostal.setText(codP.getCodPostal());
                txtLocalidade.setText(codP.getLocalidade());
                txtCidade.setText(codP.getCidade());
            }
        }
    }//GEN-LAST:event_jTableCodPostalMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        if (jTableCodPostal.getSelectedRow() != -1)
        {
            btnGravar.setEnabled(true);
            btnCancelar.setEnabled(true);
            eNovo = false;
            mudaEstado(true);
            txtCodPostal.setEnabled(false);
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
            java.util.logging.Logger.getLogger(CodPostalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CodPostalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CodPostalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CodPostalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new CodPostalView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCodPostal;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtLocalidade;
    // End of variables declaration//GEN-END:variables
}
