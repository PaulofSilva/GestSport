/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

import Connect.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class IvaDAL
{
     ConnectDB conn;

    public IvaDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Iva tx)
    {
        String sql = "INSERT INTO "
                + "taxaiva(iva)"
                + "VALUES (" + tx.getIva() + ")";

        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Iva tx)
    {
        String sql = "UPDATE txtiva "
                + "set iva=" + tx.getIva()
                + " where iva=" + tx.getIva();
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(double iva)
    {
        String sql = "DELETE FROM txtiva where iva=" + iva;
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Iva> SelectAll()
    {
        ArrayList<Iva> todos = new ArrayList<Iva>();
        ResultSet rs = conn.ExecuteQuery("Select * from txtiva");
        try
        {
            while (rs.next())
            {
                double iva = rs.getDouble("iva");

                Iva tx = new Iva(iva);
                tx.setIva(iva);
                todos.add(tx);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }
}
