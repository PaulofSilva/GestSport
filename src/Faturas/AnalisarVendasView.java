package Faturas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo Silva
 */
public class AnalisarVendasView extends javax.swing.JFrame
{

    ArrayList<Factura> vendas;
    DefaultTableModel modelo;

    public AnalisarVendasView()
    {
        initComponents();
        java.util.Date hoje = new java.util.Date();
        String hj = String.format("%1$tY-%1$tm-%1$td", hoje);
        Date data = Date.valueOf(hj);

        ftfdataInicio.setValue(data);
        ftfdataFim.setValue(data);

        String[] colunas =
        {
            ""
        };

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableVendas.setModel(modelo);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ftfdataInicio = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));

        ;
        ftfdataFim = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));

        ;
        jLabel2 = new javax.swing.JLabel();
        btnExecutar = new javax.swing.JButton();
        jcbEscolha = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Analise de Vendas");
        setResizable(false);

        jLabel1.setText("Data Inicio:");

        jLabel2.setText("Data Fim");

        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        jcbEscolha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Por Funcionario", "Produtos Mais Vendidos" }));

        jLabel4.setText("Data Fim");

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableVendas.setEnabled(false);
        jScrollPane1.setViewportView(jTableVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ftfdataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ftfdataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addComponent(btnExecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfdataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfdataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addComponent(btnExecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-659)/2, (screenSize.height-500)/2, 659, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed

        if (jcbEscolha.getSelectedItem() == "Por Funcionario")
        {
            listarVendas(1);
        } else if (jcbEscolha.getSelectedItem() == "Produtos Mais Vendidos")
        {
            listarVendas(2);
        }

    }//GEN-LAST:event_btnExecutarActionPerformed

    private void listarVendas(int index)
    {
        FacturaDAL vf = new FacturaDAL();


        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataInicio = (java.util.Date) ftfdataInicio.getValue();
        java.util.Date dataFim = (java.util.Date) ftfdataFim.getValue();

        if (index == 1)
        {
            vendas = vf.VendasFunc(Date.valueOf(formato.format(dataInicio)), Date.valueOf(formato.format(dataFim)));

            if (vendas.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Vendas não encontradas \n Altere as datas");

            }

            String[] colunas =
            {
                "Cod.Func", "Nome", " Total"
            };

            modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableVendas.setModel(modelo);

            for (int i = 0; i < vendas.size(); i++)
            {
                modelo.addRow(new Object[]
                        {
                            vendas.get(i).getCodFuncionario(), vendas.get(i).getNomeCliente(), vendas.get(i).getTotal()
                        });
            }
        } else if (index == 2)
        {
            vendas = vf.VendasProd(Date.valueOf(formato.format(dataInicio)), Date.valueOf(formato.format(dataFim)));

            if (vendas.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Vendas não encontradas \n Altere as datas");

            }

            String[] colunas =
            {
                "Cod.Artigo", "Designação", " Total"
            };

            modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableVendas.setModel(modelo);

            for (int i = 0; i < vendas.size(); i++)
            {
                modelo.addRow(new Object[]
                        {
                            vendas.get(i).getRef(), vendas.get(i).getNomeCliente(), vendas.get(i).getTotal()
                        });
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new AnalisarVendasView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JFormattedTextField ftfdataFim;
    private javax.swing.JFormattedTextField ftfdataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JComboBox jcbEscolha;
    // End of variables declaration//GEN-END:variables
}
