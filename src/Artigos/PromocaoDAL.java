/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

import Connect.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class PromocaoDAL
{

    ConnectDB conn;

    public PromocaoDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Promocao pr)
    {
        String sql = "INSERT INTO "
                + "promocao(codartigo, descricao, preco)"
                + "VALUES ('" + pr.getCodArtigo() + "',"
                + "'" + pr.getDescricao() + "',"
                + pr.getPreco() + ")";

        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Promocao pr)
    {
        String sql = "UPDATE promocao "
                + "set codartigo='" + pr.getCodArtigo() + "', "
                + "descricao='" + pr.getDescricao() + "', "
                + "preco=" + pr.getPreco() 
                + " where codartigo='" + pr.getCodArtigo() + "'";

        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(String codartigo)
    {
        String sql = "DELETE FROM promocao where codartigo='" + codartigo + "'";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Promocao> SelectAll()
    {
        ArrayList<Promocao> todos = new ArrayList<Promocao>();
        ResultSet rs = conn.ExecuteQuery("Select * from promocao");
        try
        {
            while (rs.next())
            {
                String codartigo = rs.getString("codartigo");
                String descricao = rs.getString("descricao");
                double preco = rs.getDouble("preco");


                Promocao pr = new Promocao(codartigo, descricao, preco);
                pr.setCodArtigo(codartigo);
                todos.add(pr);

            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Promocao> searchByNome(String Field, String Nome)
    {
        ArrayList<Promocao> todos = new ArrayList<Promocao>();
        ResultSet rs = conn.ExecuteQuery("Select * from promocao where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                String codartigo = rs.getString("codartigo");
                String designacao = rs.getString("descricao");
                double preco = rs.getDouble("preco");

                Promocao pr = new Promocao(codartigo, designacao, preco);
                pr.setCodArtigo(codartigo);
                todos.add(pr);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }
}
