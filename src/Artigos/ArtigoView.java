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

import Connect.ConnectDB;
import Fornecedores.Fornecedor;
import Fornecedores.FornecedorDAL;
import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Paulo Silva
 */
public class ArtigoView extends javax.swing.JFrame
{

    
    ArtigoDAL stDal;
    FornecedorDAL flDal;
    DefaultTableModel modelo;
    ArrayList<Artigo> st;
    boolean eNovo;
    int indice;

    /** Creates new form ClienteView */
    public ArtigoView()
    {
        initComponents();

        
        URL url = this.getClass().getResource("/imagens/box_48.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        eNovo = false;
        stDal = new ArtigoDAL();
        flDal = new FornecedorDAL();


        mudaEstado(false);
        //AtualizaModelo();

        ArrayList<Fornecedor> forn = flDal.SelectAll();
        for (Fornecedor f : forn)
        {
            jcbFornecedor.addItem(f);
        }
    }

    private void AtualizaModelo()
    {
        String[] colunas =
        {
            "CodArtigo", "designcao", "preco", "stock"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableArtigo.setModel(modelo);
        limparTextField();

        st = stDal.SelectAll();
        for (Artigo i : st)
        {
            modelo.addRow(new Object[]
                    {
                        i.getCodartigo(), i.getDesignacao(), i.getPreco(),
                        i.getStock()
                    });
        }
    }

    private void mudaEstado(boolean ativo)
    {
        txtCodArt.setEnabled(ativo);
        txtDesign.setEnabled(ativo);
        txtPreco.setEnabled(ativo);
        txtReserva.setEnabled(ativo);
        txtStock.setEnabled(ativo);

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
        jLabel1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtReserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jcbPesq = new javax.swing.JComboBox();
        btnVerStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artigo");
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setName("frmArtigo"); // NOI18N
        setResizable(false);

        lblDesign.setText("Designação");

        txtPreco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblPreco.setText("Preço");

        lblCodArt.setText("Cod. Artigo");

        txtCodArt.setBackground(new java.awt.Color(255, 255, 204));
        txtCodArt.setFont(new java.awt.Font("Tahoma", 1, 12));

        jTableArtigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Artigo", "Designação", "Preço", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jTableArtigo.getColumnModel().getColumn(3).setMinWidth(40);
        jTableArtigo.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTableArtigo.getColumnModel().getColumn(3).setMaxWidth(40);

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

        jLabel1.setText("Stock");

        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtReserva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Reservado");

        jLabel3.setText("Fornecedor");

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search_48.png"))); // NOI18N
        btnPesquisa.setText("...");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jcbPesq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "codartigo", "designacao" }));

        btnVerStock.setText("Artigos por fornecedor...");
        btnVerStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jcbPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodArt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDesign, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(btnCancelar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnVerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDesign)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtReserva, txtStock});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnEditar, btnEliminar, btnGravar, btnNovo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnEditar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jcbPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodArt)
                            .addComponent(txtCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDesign)
                            .addComponent(txtDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblPreco))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGravar))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnGravar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodArt, txtDesign, txtPreco, txtReserva, txtStock});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisa, btnVerStock, jcbFornecedor, jcbPesq, txtPesquisa});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnEliminar, btnNovo});

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-688)/2, (screenSize.height-390)/2, 688, 390);
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
        } else if (verificaStock())
        {
            JOptionPane.showMessageDialog(rootPane, "Preenchimento incorreto do campo STOCK!");
            txtStock.requestFocus();
            falta = true;
        } else if (verificaReserva())
        {
            JOptionPane.showMessageDialog(rootPane, "Preenchimento incorreto do campo RESERVA!");
            txtStock.requestFocus();
            falta = true;
        }
        return falta;
    }

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGravarActionPerformed
    {//GEN-HEADEREND:event_btnGravarActionPerformed
        Artigo art = new Artigo();
        Fornecedor forn = (Fornecedor) jcbFornecedor.getSelectedItem();
        if (!eNovo)
        {
            if (validaCampos() == false)
            {
                art.setCodartigo(txtCodArt.getText());
                art.setDesignacao(txtDesign.getText());
                art.setPreco(Double.parseDouble(txtPreco.getText().trim()));
                art.setReserva(Integer.parseInt(txtReserva.getText().trim()));
                art.setStock(Integer.parseInt(txtStock.getText().trim()));
                art.setCodFornecedor(forn.getcodFornecedor());

                if (stDal.Update(art))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Actualizado com sucesso!");
                    mudaEstado(false);
                }
            }

        } else
        {


            st = stDal.searchByNome("codartigo", txtCodArt.getText());

            if (st.size() > 0)
            {
                JOptionPane.showMessageDialog(rootPane, "Já existe esse Codigo !");
                txtCodArt.setText("");
                txtCodArt.requestFocus();
            } else
            {
                if (validaCampos() == false)
                {
                    art.setCodartigo(txtCodArt.getText());
                    art.setDesignacao(txtDesign.getText());
                    art.setPreco(Double.parseDouble(txtPreco.getText()));
                    art.setReserva(Integer.parseInt(txtReserva.getText()));
                    art.setStock(Integer.parseInt(txtStock.getText()));
                    art.setCodFornecedor(forn.getcodFornecedor());

                    if (stDal.Insert(art))
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
                if (stDal.Delete(CodArtigo))
                {
                    AtualizaModelo();
                    JOptionPane.showMessageDialog(rootPane, "Artigo " + CodArtigo + " removido");
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
        st = stDal.SelectAll();
        for (Artigo codA : st)
        {
            if (codA.getCodartigo().equals(valueAt))
            {
                txtCodArt.setText(codA.getCodartigo());
                txtDesign.setText(codA.getDesignacao());
                txtPreco.setText(String.valueOf(codA.getPreco()));
                txtReserva.setText(String.valueOf(codA.getReserva()));
                txtStock.setText(String.valueOf(codA.getStock()));

                boolean encontrado = false;
                for (int i = 0; i < jcbFornecedor.getItemCount() && !encontrado; i++)
                {
                    Fornecedor f = (Fornecedor) jcbFornecedor.getItemAt(i);
                    if (f.getcodFornecedor() == codA.getCodFornecedor())
                    {
                        encontrado = true;
                        jcbFornecedor.setSelectedIndex(i);
                    }
                }
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
        ArrayList<Artigo> selecionados = stDal.searchByNome(jcbPesq.getSelectedItem().toString(), txtPesquisa.getText());

        String[] colunas =
        {
            "CodArtigo", "designcao", "preco", "stock"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableArtigo.setModel(modelo);

        for (Artigo i : selecionados)
        {
            //System.out.println("aqui");
            modelo.addRow(new Object[]
                    {
                        i.getCodartigo(), i.getDesignacao(), i.getPreco(),
                        i.getStock()
                    });
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnVerStockActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerStockActionPerformed
    {//GEN-HEADEREND:event_btnVerStockActionPerformed
    try{
        ConnectDB conn = new ConnectDB();
        HashMap parametros = new HashMap();
        JasperPrint jp = JasperFillManager.fillReport("./jasper/produtos.jasper", parametros, conn.Open());
        JasperViewer jrv = new JasperViewer(jp, false);
        jrv.setVisible(true);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnVerStockActionPerformed

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

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt)
            {  // cria um ouvinte para cada tecla pressionada  
                txtPreco.setText(txtPreco.getText().replaceAll("[^0-9 | ^.]", ""));
                // faz com que pegue o texto a cada tecla digitada, e substituir tudo que não(^) seja numero  por ""  
            }
        });

        txtReserva.setText("0");
        txtReserva.addKeyListener(new java.awt.event.KeyAdapter()
        {     // cria um listener ouvinte de digitação do fieldNumero  

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt)
            {  // cria um ouvinte para cada tecla pressionada  
                txtReserva.setText(txtReserva.getText().replaceAll("[^0-9]", ""));
                // faz com que pegue o texto a cada tecla digitada, e substituir tudo que não(^) seja numero  por ""  
            }
        });

        txtStock.setText("0");
        txtStock.addKeyListener(new java.awt.event.KeyAdapter()
        {     // cria um listener ouvinte de digitação do fieldNumero  

            public void keyReleased(java.awt.event.KeyEvent evt)
            {  // cria um ouvinte para cada tecla pressionada  
                txtStock.setText(txtStock.getText().replaceAll("[^0-9]", ""));
                // faz com que pegue o texto a cada tecla digitada, e substituir tudo que não(^) seja numero  por ""  
            }
        });
        //jcbFornecedor.setSelectedIndex(0);

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

    private boolean verificaStock()
    {
        if (txtStock.getText().trim().equals(""))
        {
            return true;
        } else
        {
            try
            {
                int stock = Integer.parseInt(txtStock.getText().trim());
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                return true;
            }
        }
        return false;
    }

    private boolean verificaReserva()
    {
        if (txtReserva.getText().trim().equals(""))
        {
            return true;
        } else
        {
            try
            {
                int reserva = Integer.parseInt(txtReserva.getText().trim());
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(ArtigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ArtigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ArtigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ArtigoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new ArtigoView().setVisible(true);
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
    private javax.swing.JButton btnVerStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableArtigo;
    private javax.swing.JComboBox jcbFornecedor;
    private javax.swing.JComboBox jcbPesq;
    private javax.swing.JLabel lblCodArt;
    private javax.swing.JLabel lblDesign;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTextField txtCodArt;
    private javax.swing.JTextField txtDesign;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtReserva;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
