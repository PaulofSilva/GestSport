/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaosport;

/**
 *
 * @author Paulo Silva
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }
}
