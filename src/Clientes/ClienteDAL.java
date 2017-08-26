/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Connect.ConnectDB;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class ClienteDAL
{

    ConnectDB conn;
    PreparedStatement pstm;

    public ClienteDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Cliente cl)
    {
        String sql = "INSERT INTO "
                + "cliente(nome, morada, codPostal, email, nif,  telefone,  url)"
                + "VALUES ('" + cl.getNome() + "',"
                + "'" + cl.getMorada() + "',"
                + "'" + cl.getCodPostal() + "',"
                + "'" + cl.getEmail() + "',"
                + "'" + cl.getNif() + "',"
                + "'" + cl.getTelefone() + "',"
                + "'" + cl.getUrl() + "')";
        System.out.println(sql);
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Cliente cl)
    {
        String sql = "UPDATE cliente "
                + "set nome='" + cl.getNome() + "', "
                + "morada=" + cl.getMorada() + ", "
                + "codPostal=" + cl.getCodPostal() + ", "
                + "email='" + cl.getEmail() + "', "
                + "nif='" + cl.getNif() + "', "
                + "telefone='" + cl.getTelefone() + "', "
                + "url='" + cl.getUrl()
                + "' where codCliente=" + cl.getCodcliente();
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(int codCliente)
    {
        String sql = "DELETE FROM cliente where codCliente=" + codCliente;
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Cliente> SelectAll()
    {
        ArrayList<Cliente> todos = new ArrayList<Cliente>();
        ResultSet rs = conn.ExecuteQuery("Select * from cliente");
        try
        {
            while (rs.next())
            {
                int codCliente = rs.getInt("codCliente");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Cliente cl = new Cliente(nome, morada, codPostal, email, nif, telefone, url);
                cl.setCodcliente(codCliente);
                todos.add(cl);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Cliente> searchByNome(String Field, String Nome)
    {
        ArrayList<Cliente> todos = new ArrayList<Cliente>();
        ResultSet rs = conn.ExecuteQuery("Select * from cliente where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                int codCliente = rs.getInt("codCliente");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Cliente cl = new Cliente(nome, morada, codPostal, email, nif, telefone, url);
                cl.setCodcliente(codCliente);
                todos.add(cl);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Cliente> searchByCod(int Cod, int pesq)
    {
        String sql;
        if (pesq == 1)
        {
            sql = "Select * from cliente where codcliente = "
                    + "(select max(codCliente) from cliente where codCliente < ?)";
        } else
        {
            sql = "Select * from cliente where codcliente = "
                    + "(select min(codCliente) from cliente where codCliente > ?)";
        }


        ArrayList<Cliente> todos = new ArrayList<Cliente>();

        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(sql);
            pstm.setInt(1, Cod);

            ResultSet rs = pstm.executeQuery();

            while (rs.next())
            {
                int codCliente = rs.getInt("codCliente");
                String nome = rs.getString("nome");
                String morada = rs.getString("morada");
                String codPostal = rs.getString("codPostal");
                String email = rs.getString("email");
                String nif = rs.getString("nif");
                String telefone = rs.getString("telefone");
                String url = rs.getString("url");
                Cliente cl = new Cliente(nome, morada, codPostal, email, nif, telefone, url);
                cl.setCodcliente(codCliente);
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
        ResultSet rs = conn.ExecuteQuery("select max(codcliente) from cliente");


        if (rs.last())
        {
            ultimo = rs.getInt(1);
            //System.out.println(rs.getInt(1));
        }


        return ultimo;
    }
}
