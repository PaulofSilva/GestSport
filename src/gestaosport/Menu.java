/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu.java
 *
 * Created on 5/Nov/2011, 22:41:53
 */
package gestaosport;

import Artigos.ArtigoView;
import Artigos.PromocaoView;
import Auxiliares.CodPostalView;
import Clientes.ClienteView;
import Faturas.AnalisarVendasView;
import Faturas.FacturaView;
import Fornecedores.FornecedorView;
import Funcionario.FuncionarioView;
import JPA.IvaView;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JPanel;

/**
 *
 * @author Paulo Silva
 */
public class Menu extends javax.swing.JFrame
{


    private HelpSet hs;
    private HelpBroker hb;
    private URL hsURL;

    /** Creates new form Menu */
    public Menu()
    {
        initComponents();

        URL url = this.getClass().getResource("/imagens/Games.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void openHelp()
    {
        // Identifica a localização do arquivo .hs
        String pathToHS = "/appwithhelp/docs/appwithhelp-hs.xml";
        //Cria a URL para a localização do help set
        try
        {
            hsURL = getClass().getResource(pathToHS);
            hs = new HelpSet(null, hsURL);
        } catch (Exception ee)
        {
            System.out.println("HelpSet " + ee.getMessage());
            System.out.println("Help Set " + pathToHS + " não encontrado");
            return;
        }

        // Cria um objeto HelpBroker para manipular o help set
        hb = hs.createHelpBroker();
        // Mostra o help set
        hb.setDisplayed(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtArtigos = new javax.swing.JButton();
        jbtPromocoes = new javax.swing.JButton();
        jbtCliente = new javax.swing.JButton();
        jbtFActuras = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestSport - Sistema Comercial");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setName("menu"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jbtArtigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/box_48_G.png"))); // NOI18N
        jbtArtigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtArtigosActionPerformed(evt);
            }
        });
        jPanel1.add(jbtArtigos);
        jbtArtigos.setBounds(150, 20, 70, 50);

        jbtPromocoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star_48.png"))); // NOI18N
        jbtPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPromocoesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtPromocoes);
        jbtPromocoes.setBounds(220, 20, 70, 50);

        jbtCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/smile_grin_48_G.png"))); // NOI18N
        jbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtCliente);
        jbtCliente.setBounds(80, 20, 70, 50);

        jbtFActuras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/book_48_G.png"))); // NOI18N
        jbtFActuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFActurasActionPerformed(evt);
            }
        });
        jPanel1.add(jbtFActuras);
        jbtFActuras.setBounds(10, 20, 70, 50);

        getContentPane().add(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setFocusable(false);
        jMenuBar1.setFont(new java.awt.Font("Calibri", 0, 12));

        jMenu1.setLabel("Sistema");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Funcionários");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator4);

        jMenuItem10.setText("Calculadora");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Calendário");
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Sair");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestão");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('C');
        jMenuItem1.setText("Gestão de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('F');
        jMenuItem2.setText("Facturação a Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setMnemonic('A');
        jMenuItem5.setText("Artigos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem14.setText("Promoções");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tabelas");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Codigos Postais");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Taxas de Iva");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Analises");

        jMenuItem9.setText("Vendas por Funcionário");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuBar1.add(jMenu8);

        jMenu6.setText("Ajuda");

        jMenuItem12.setText("Sobre sistema");
        jMenu6.add(jMenuItem12);

        jMenuItem13.setText("Manual");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1035)/2, (screenSize.height-743)/2, 1035, 743);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu1ActionPerformed
    {//GEN-HEADEREND:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem6ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        ClienteView clientes;
        try
        {
            clientes = new ClienteView();
            clientes.setVisible(true); //mostrar a janela clientes
            clientes.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez            
        } catch (SQLException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem13ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem13ActionPerformed
        openHelp();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem2ActionPerformed
        FacturaView facturas;
        facturas = new FacturaView();
        facturas.setVisible(true); //mostrar a janela 
        facturas.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez            
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem5ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem5ActionPerformed
        ArtigoView artigos = new ArtigoView();
        artigos.setVisible(true); //mostrar a janela 
        artigos.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem7ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem7ActionPerformed
        CodPostalView codPostal = new CodPostalView();
        codPostal.setVisible(true); //mostrar a janela 
        codPostal.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jbtFActurasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtFActurasActionPerformed
    {//GEN-HEADEREND:event_jbtFActurasActionPerformed
        FacturaView facturas;
        facturas = new FacturaView();
        facturas.setVisible(true); //mostrar a janela 
        facturas.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez 
    }//GEN-LAST:event_jbtFActurasActionPerformed

    private void jbtArtigosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtArtigosActionPerformed
    {//GEN-HEADEREND:event_jbtArtigosActionPerformed
        ArtigoView artigos = new ArtigoView();
        artigos.setVisible(true); //mostrar a janela 
        artigos.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez
    }//GEN-LAST:event_jbtArtigosActionPerformed

    private void jbtClienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtClienteActionPerformed
    {//GEN-HEADEREND:event_jbtClienteActionPerformed
        ClienteView clientes;
        try
        {
            clientes = new ClienteView();
            clientes.setVisible(true); //mostrar a janela clientes
            clientes.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez            
        } catch (SQLException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtClienteActionPerformed

    private void jbtPromocoesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtPromocoesActionPerformed
    {//GEN-HEADEREND:event_jbtPromocoesActionPerformed
        PromocaoView promo = new PromocaoView();
        promo.setVisible(true); //mostrar a janela 
        promo.setState(JFrame.NORMAL);
    }//GEN-LAST:event_jbtPromocoesActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem9ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem9ActionPerformed
        AnalisarVendasView artigos = new AnalisarVendasView();
        artigos.setVisible(true); //mostrar a janela 
        artigos.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem8ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem8ActionPerformed
        String args[] = new String[1];
        args[0] = "Taxas de Iva";
        IvaView.main(args);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem3ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem3ActionPerformed
        FornecedorView forn;
        try
        {
            forn = new FornecedorView();
            forn.setVisible(true); //mostrar a janela clientes
            forn.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira vez            
        } catch (SQLException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem4ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem4ActionPerformed
        FuncionarioView codFunc = new FuncionarioView();
        codFunc.setVisible(true); //mostrar a janela 
        codFunc.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira v
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem14ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem14ActionPerformed
        PromocaoView promo = new PromocaoView();
        promo.setVisible(true); //mostrar a janela 
        promo.setState(JFrame.NORMAL); // manter a janela visivel no 2o click. por exemplo, quando minimizada p'la primeira v
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JButton jbtArtigos;
    private javax.swing.JButton jbtCliente;
    private javax.swing.JButton jbtFActuras;
    private javax.swing.JButton jbtPromocoes;
    // End of variables declaration//GEN-END:variables
}
