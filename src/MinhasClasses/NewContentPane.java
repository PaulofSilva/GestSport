/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewContentPane.java
 *
 * Created on 16/Jan/2012, 11:57:54
 */
package MinhasClasses;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Paulo Silva
 */
public class NewContentPane extends javax.swing.JPanel
{
    private Image bImage;

    /** Creates new form NewContentPane */
    public NewContentPane()
    {
        initComponents();
    }

    @Override
    protected void paintComponent(final Graphics g)
    {

        super.paintComponent(g);

        g.drawImage(bImage, 0, 0, this);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
