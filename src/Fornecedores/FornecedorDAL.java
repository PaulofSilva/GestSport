/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedores;

import Connect.ConnectDB;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class FornecedorDAL
{

    ConnectDB conn;
    PreparedStatement pstm;
    
    public FornecedorDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Fornecedor cl)
    {
        String sql = "INSERT INTO "
                + "fornecedor(nome, morada, codPostal, email, nif,  telefone,  url)"
                + "VALUES ('" + cl.getNome() + "',"
                + "'" + cl.getMorada() + "',"
                + "'" + cl.getCodPostal() + "',"
                + "'" + cl.getEmail() + "',"
                + "'" + cl.getNif() + "',"
                + "'" + cl.getTelefone() + "',"
                + "'" + cl.getUrl() + "')";
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Fornecedor fl)
    {
        String sql = "UPDATE fornecedor "
                + "set nome='" + fl.getNome() + "', "
                + "morada='" + fl.getMorada() + "', "
                + "codPostal='" + fl.getCodPostal() + "', "
                + "email='" + fl.getEmail() + "', "
                + "nif='" + fl.getNif() + "', "
                + "telefone='" + fl.getTelefone() + "', "
                + "url='" + fl.getUrl()
                + "' where codFornecedor=" + fl.getcodFornecedor();
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(int codFornecedor)
    {
        String sql = "DELETE FROM fornecedor where getcodFornecedor=" + codFornecedor;
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Fornecedor> SelectAll()
    {
        ArrayList<Fornecedor> todos = new ArrayList<Fornecedor>();
        ResultSet rs = conn.ExecuteQuery("Select * from fornecedor");
        try
        {
            while (rs.next())
            {
                int codFornecedor = rs.getInt("codFornecedor");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Fornecedor fl = new Fornecedor(nome, morada, codPostal, email, nif, telefone, url);
                fl.setcodFornecedor(codFornecedor);
                todos.add(fl);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Fornecedor> searchByNome(String Field, String Nome)
    {
        ArrayList<Fornecedor> todos = new ArrayList<Fornecedor>();
        ResultSet rs = conn.ExecuteQuery("Select * from fornecedor where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                int codFornecedor = rs.getInt("codFornecedor");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Fornecedor fl = new Fornecedor(nome, morada, codPostal, email, nif, telefone, url);
                fl.setcodFornecedor(codFornecedor);
                todos.add(fl);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Fornecedor> searchByCod(int Cod, int pesq)
    {
        String sql;
        if (pesq == 1)
        {
            sql = "Select * from fornecedor where codfornecedor = "
                    + "(select max(codfornecedor) from fornecedor where codfornecedor < ?)";
        } else
        {
            sql = "Select * from fornecedor where codfornecedor = "
                    + "(select min(codfornecedor) from fornecedor where codfornecedor > ?)";
        }


        ArrayList<Fornecedor> todos = new ArrayList<Fornecedor>();

        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(sql);
            pstm.setInt(1, Cod);

            ResultSet rs = pstm.executeQuery();

            while (rs.next())
            {
                int codfornecedor = rs.getInt("codfornecedor");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Fornecedor cl = new Fornecedor(nome, morada, codPostal, email, nif, telefone, url);
                cl.setcodFornecedor(codfornecedor);
                todos.add(cl);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public int ultimoCli() throws SQLException
    {
        int ultimo = 0;
        ResultSet rs = conn.ExecuteQuery("select max(codfornecedor) from fornecedor");


        if (rs.last())
        {
            ultimo = rs.getInt(1);
        }


        return ultimo;
    }
}
