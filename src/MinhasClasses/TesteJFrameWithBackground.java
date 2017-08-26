/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhasClasses;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 *
 * @author Paulo Silva
 */
public class TesteJFrameWithBackground
{

    public static void main(String[] args)
    {

        try
        {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception exception)
        {
        }



        JPanel jPanel3 = new JPanel(new BorderLayout());

        jPanel3.add(new JLabel("teste-background"), BorderLayout.NORTH);

        jPanel3.add(new JLabel("texto:"), BorderLayout.WEST);

        jPanel3.add(new JScrollPane(new JTextArea()), BorderLayout.CENTER);

        jPanel3.add(new JLabel("teste-background-fim"), BorderLayout.SOUTH);

        jPanel3.setPreferredSize(new Dimension(400, 500));

        jPanel3.setBorder(BorderFactory.createTitledBorder("jPanel3"));

        jPanel3.setOpaque(false);



        JFrameWithBackground jFrame = new JFrameWithBackground("/imagens/Background_0.jpg");

        jFrame.setLayout(new BorderLayout());

        jFrame.getContentPane().add(jPanel3, BorderLayout.NORTH);

        jFrame.setVisible(true);

    }
}
