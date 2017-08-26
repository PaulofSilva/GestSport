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
public class CodPostalDAL
{

    ConnectDB conn;

    public CodPostalDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(CodPostal cp)
    {
        String sql = "INSERT INTO "
                + "Codigopostal(codPostal, localidade, cidade)"
                + "VALUES ('" + cp.getCodPostal() + "',"
                + "'" + cp.getLocalidade() + "',"
                + "'" + cp.getCidade() + "')";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(CodPostal cp)
    {
        String sql = "UPDATE Codigopostal "
                + "set localidade='" + cp.getLocalidade() + "', "
                + "cidade='" + cp.getCidade()
                + "' where codPostal='" + cp.getCodPostal() +"'";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(String codPostal)
    {
        String sql = "DELETE FROM codigopostal where Codpostal='" + codPostal +"'";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<CodPostal> SelectAll()
    {
        ArrayList<CodPostal> todos = new ArrayList<CodPostal>();
        ResultSet rs = conn.ExecuteQuery("Select * from Codigopostal");
        try
        {
            while (rs.next())
            {
                String codPostal = rs.getString("codPostal");
                String localidade = rs.getString("localidade");
                String cidade = rs.getString("cidade");
                CodPostal cp = new CodPostal(codPostal, localidade, cidade);
                cp.setCodPostal(codPostal);
                todos.add(cp);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<CodPostal> searchByNome(String Field, String Nome)
    {
        ArrayList<CodPostal> todos = new ArrayList<CodPostal>();
        ResultSet rs = conn.ExecuteQuery("Select * from Codigopostal where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                String codpostal = rs.getString("codpostal");
                String localidade = rs.getString("localidade");
                String cidade = rs.getString("cidade");
                CodPostal cp = new CodPostal(codpostal, localidade, cidade);
                cp.setCodPostal(codpostal);
                todos.add(cp);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }
}
