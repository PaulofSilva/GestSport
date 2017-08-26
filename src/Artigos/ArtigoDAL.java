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
public class ArtigoDAL
{

    ConnectDB conn;

    public ArtigoDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Artigo st)
    {
        String sql = "INSERT INTO "
                + "artigo(codartigo, designacao, preco, stock, reserva, codFornecedor)"
                + "VALUES ('" + st.getCodartigo() + "',"
                + "'" + st.getDesignacao() + "',"
                + st.getPreco() + ","
                + st.getStock() +","
                + st.getReserva()+","
                + st.getCodFornecedor() + ")";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Artigo st)
    {
        String sql = "UPDATE artigo "
                + "set codartigo='" + st.getCodartigo() + "', "
                + "designacao='" + st.getDesignacao() + "', "
                + "preco=" + st.getPreco()  + ", "
                + "stock=" + st.getStock()  + ", "
                + "reserva=" + st.getReserva()  + ", "
                + "codFornecedor=" + st.getCodFornecedor()
                + " where codartigo='" + st.getCodartigo() + "'";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(String codartigo)
    {
        String sql = "DELETE FROM artigo where codartigo='" + codartigo + "'";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Artigo> SelectAll()
    {
        ArrayList<Artigo> todos = new ArrayList<Artigo>();
        ResultSet rs = conn.ExecuteQuery("Select * from artigo");
        try
        {
            while (rs.next())
            {
                String codartigo = rs.getString("codartigo");
                String designacao = rs.getString("designacao");
                double preco = rs.getDouble("preco");
                int stock = rs.getInt("stock");
                int reserva = rs.getInt("reserva");
                int codFornecedor = rs.getInt("codFornecedor");

                Artigo st = new Artigo(codartigo, designacao, preco, stock, reserva, codFornecedor);
                st.setCodartigo(codartigo);
                todos.add(st);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Artigo> searchByNome(String Field, String Nome)
    {
        ArrayList<Artigo> todos = new ArrayList<Artigo>();
        ResultSet rs = conn.ExecuteQuery("Select * from artigo where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                String codartigo = rs.getString("codartigo");
                String designacao = rs.getString("designacao");
                double preco = rs.getDouble("preco");
                int stock = rs.getInt("stock");
                int reserva = rs.getInt("reserva");
                int codFornecedor = rs.getInt("codFornecedor");

                Artigo st = new Artigo(codartigo, designacao, preco, stock, reserva, codFornecedor);
                st.setCodartigo(codartigo);
                todos.add(st);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }
}
