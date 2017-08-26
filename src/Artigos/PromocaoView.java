/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClienteView.java
 *
 * Created on 17/Dez/2011, 4:07:00
 */
package Artigos;

import Fornecedores.Fornecedor;
import Fornecedores.FornecedorDAL;
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
public class PromocaoView extends javax.swing.JFrame
{

    PromocaoDAL prDal;
    DefaultTableModel modelo;
    ArrayList<Promocao> pr;
    boolean eNovo;
    int indice;

    /** Creates new form ClienteView */
    public PromocaoView()
    {
        initComponents();
        URL url = this.getClass().getResource("/imagens/box_48.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        eNovo = false;
        prDal = new PromocaoDAL();

        mudaEstado(false);
        //AtualizaModelo();
    }

    private void AtualizaModelo()
    {
        String[] colunas =
        {
            "CodArtigo", "designcao", "preco"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableArtigo.setModel(modelo);
        limparTextField();

        pr = prDal.SelectAll();
        for (Promocao i : pr)
        {
            modelo.addRow(new Object[]
                    {
                        i.getCodArtigo(), i.getDescricao(), i.getPreco()
                    });
        }
    }

    private void mudaEstado(boolean ativo)
    {
        txtCodArt.setEnabled(ativo);
        //txtDesign.setEnabled(ativo);
        txtPreco.setEnabled(ativo);

        btnGravar.setEnabled(ativo);
        btnCancelar.setEnabled(ativo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDesign = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtDesign = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        lblCodArt = new javax.swing.JLabel();
        txtCodArt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArtigo = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jcbPesq = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Promoções");
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setName("frmArtigo"); // NOI18N
        setResizable(false);

        lblDesign.setText("Designação");

        txtPreco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtDesign.setEnabled(false);

        lblPreco.setText("Preço");

        lblCodArt.setText("Cod. Artigo");

        txtCodArt.setBackground(new java.awt.Color(255, 255, 204));
        txtCodArt.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtCodArt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodArtFocusLost(evt);
            }
        });

        jTableArtigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Artigo", "Designação", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableArtigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArtigoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableArtigo);
        jTableArtigo.getColumnModel().getColumn(0).setMinWidth(70);
        jTableArtigo.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTableArtigo.getColumnModel().getColumn(0).setMaxWidth(70);
        jTableArtigo.getColumnModel().getColumn(1).setMinWidth(100);
        jTableArtigo.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableArtigo.getColumnModel().getColumn(1).setMaxWidth(100);
        jTableArtigo.getColumnModel().getColumn(2).setMinWidth(40);
        jTableArtigo.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTableArtigo.getColumnModel().getColumn(2).setMaxWidth(40);

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
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_48.png"))); // NOI18N
        btnPesquisa.setText("...");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jcbPesq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "codartigo", "designacao" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcbPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodArt)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDesign)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblPreco)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesign, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnCancelar)
                        .addGap(39, 39, 39)
                        .addComponent(btnGravar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodArt)
                            .addComponent(txtCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesign))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGravar)
                            .addComponent(btnCancelar))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-682)/2, (screenSize.height-279)/2, 682, 279);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaCampos()
    {
        boolean falta = false;

        if (txtCodArt.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha o Codigo do Artigo");
            txtCodArt.requestFocus();
            falta = true;
        } else if (txtDesign.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Preencha da Designação");
            txtDesign.requestFocus();
            falta = true;
        } else if (verificaPreco())
        {
            JOptionPane.showMessageDialog(rootPane, "Preço INCORRETO!");
            txtPreco.requestFocus();
            falta = true;
        }

        return falta;
    }

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGravarActionPerformed
    {//GEN-HEADEREND:event_btnGravarActionPerformed
        Promocao prom = new Promocao();

        if (!eNovo)
        {
            if (validaCampos() == false)
            {
                prom.setCodArtigo(txtCodArt.getText());
                prom.setDescricao(txtDesign.getText());
                prom.setPreco(Double.parseDouble(txtPreco.getText().trim()));

                if (prDal.Update(prom))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Actualizado com sucesso!");
                    mudaEstado(false);
                }
            }

        } else
        {


            pr = prDal.searchByNome("codartigo", txtCodArt.getText());

            if (pr.size() > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Já existe esse Codigo !");
                txtCodArt.setText("");
                txtCodArt.requestFocus();
            } else
            {
                if (validaCampos() == false)
                {
                    prom.setCodArtigo(txtCodArt.getText());
                    prom.setDescricao(txtDesign.getText());
                    prom.setPreco(Double.parseDouble(txtPreco.getText()));

                    if (prDal.Insert(prom))
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
        indice = jTableArtigo.getSelectedRow();
        if (indice == -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Escolha um Artigo");
        } else
        {
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Pretende remover o Artigo selecionado?",
                    "Remover", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION)
            {
                String CodArtigo = (modelo.getValueAt(indice, 0).toString());
                if (prDal.Delete(CodArtigo))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Promoção do Artigo com codigo.: " + CodArtigo + " foi removida");
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

        limparTextField();
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);

        mudaEstado(true);
        txtCodArt.requestFocus();
        eNovo = true;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jTableArtigoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableArtigoMouseClicked
    {//GEN-HEADEREND:event_jTableArtigoMouseClicked
        int row = jTableArtigo.getSelectedRow();
        String valueAt = (modelo.getValueAt(row, 0).toString());
        pr = prDal.SelectAll();
        for (Promocao codA : pr)
        {
            if (codA.getCodArtigo().equals(valueAt))
            {
                txtCodArt.setText(codA.getCodArtigo());
                txtDesign.setText(codA.getDescricao());
                txtPreco.setText(String.valueOf(codA.getPreco()));
            }
        }
    }//GEN-LAST:event_jTableArtigoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        if (jTableArtigo.getSelectedRow() != -1)
        {
            btnGravar.setEnabled(true);
            btnCancelar.setEnabled(true);
            eNovo = false;
            mudaEstado(true);
            txtCodArt.setEnabled(false);
        } else
        {
            JOptionPane.showMessageDialog(rootPane, "Escolha o Codigo do Artigo a editar!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisaActionPerformed
    {//GEN-HEADEREND:event_btnPesquisaActionPerformed
        ArrayList<Promocao> selecionados = prDal.searchByNome(jcbPesq.getSelectedItem().toString(), txtPesquisa.getText());

        String[] colunas =
        {
            "CodArtigo", "designcao", "preco"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableArtigo.setModel(modelo);

        for (Promocao i : selecionados)
        {
            //System.out.println("aqui");
            modelo.addRow(new Object[]
                    {
                        i.getCodArtigo(), i.getDescricao(), i.getPreco()
                    });
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtCodArtFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtCodArtFocusLost
    {//GEN-HEADEREND:event_txtCodArtFocusLost
        mostraArtigo(txtCodArt.getText());
    }//GEN-LAST:event_txtCodArtFocusLost

    private void mostraArtigo(String codArt)
    {
        pr = prDal.searchByNome("codArtigo", txtCodArt.getText()); // verificar o promo de artigo

        if (pr.size() > 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Já existe promoção para este Codigo do Artigo!");
        } else
        {
            ArtigoDAL stDal = new ArtigoDAL();
            ArrayList<Artigo> st = stDal.searchByNome("codArtigo", codArt);

            for (Artigo a : st)
            {
                txtDesign.setText(a.getDesignacao());
            }
        }
    }

    protected void limparTabela()
    {
        jTableArtigo.setModel(modelo);
        while (modelo.getRowCount() > 0)
        {
            modelo.removeRow(0);
        }
    }

    protected boolean verificarCampos()
    {
        if (!txtPesquisa.getText().trim().equals(""))
        {
            return true;
        }
        return false;
    }

    protected void limparTextField()
    {
        txtCodArt.setText("");
        txtDesign.setText("");
        txtPreco.setText("000.00");
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter()
        {     // cria um listener ouvinte de digitação do fieldNumero  

            public void keyReleased(java.awt.event.KeyEvent evt)
            {  // cria um ouvinte para cada tecla pressionada  
                txtPreco.setText(txtPreco.getText().replaceAll("[^0-9 | ^.]", ""));
                // faz com que pegue o texto a cada tecla digitada, e substituir tudo que não(^) seja numero  por ""  
            }
        });

    }

    private boolean verificaPreco()
    {
        if (txtPreco.getText().trim().equals(""))
        {
            return true;
        } else
        {
            try
            {
                double valor = Double.parseDouble(txtPreco.getText().trim());
            } catch (Exception e)
            {
                //System.out.println(e.getMessage());
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(PromocaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PromocaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PromocaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PromocaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new PromocaoView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableArtigo;
    private javax.swing.JComboBox jcbPesq;
    private javax.swing.JLabel lblCodArt;
    private javax.swing.JLabel lblDesign;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTextField txtCodArt;
    private javax.swing.JTextField txtDesign;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
