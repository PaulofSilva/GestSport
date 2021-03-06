/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImagemFundo.java
 *
 * Created on 16/Jan/2012, 12:17:22
 */
package MinhasClasses;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Paulo Silva
 */
public class ImagemFundo extends javax.swing.JPanel
{

    /** Creates new form ImagemFundo */
    public ImagemFundo()
    {
        initComponents();
    }
    
    public static void main(String[] args) {  
        JPanel panel = new ImagemFundo("/Imagens/Background_0.jpg");  
          
        //JLabel label = new JLabel("TESTE");  
        //panel.add(label);  
          
        JFrame frame = new JFrame();  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frame.setTitle("ImagemFundo");  
          
        frame.add(panel);  
          
        frame.setSize(200, 200);  
        frame.validate();  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);  
    }  
      
    private Image fundo;  
      
    public ImagemFundo(String imagem) {  
        URL res = getClass().getResource(imagem);  
        if (res == null) {  
            throw new IllegalArgumentException("resource not found: " + imagem);  
        }  
        fundo = Toolkit.getDefaultToolkit().createImage(res);  
    }  
  
    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        if (fundo != null) {  
            int w = fundo.getWidth(this);  
            int h = fundo.getHeight(this);  
            if (w > 0  &&  h > 0) {  
                for (int y = 0; y < getHeight(); y += h) {  
                    for (int x = 0; x < getWidth(); x += w) {  
                        g.drawImage(fundo, x, y, this);  
                    }  
                }  
            }  
        }  
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
