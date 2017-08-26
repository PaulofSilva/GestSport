/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faturas;

import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Paulo Silva
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {

        java.util.Date hoje = new java.util.Date();
        String hj = String.format("%1$tY-%1$tm-%1$td", hoje);
        Date data = Date.valueOf(hj);
        
        FacturaDAL dal = new FacturaDAL();
        int ultFact = dal.ultimoFact();
        int stock = dal.verificarStock("art02");
        
        dal.InserirCabFact(1, 2, data, 100.00);
        dal.InserirLinhas(20, "art02", 23.0, 1, 10.00 );

        System.out.println(ultFact);
        System.out.println(stock);
    }
}
