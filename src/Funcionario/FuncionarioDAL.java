/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import Connect.ConnectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class FuncionarioDAL
{

    ConnectDB conn;

    public FuncionarioDAL()
    {
        conn = new ConnectDB();
    }

    public boolean Insert(Funcionario fu)
    {
        String sql = "INSERT INTO "
                + "funcionario( nome, funcao, login, senha,  acessototal,  dataadmissao)"
                + "VALUES ('" + fu.getNome() + "',"
                + "'" + fu.getFuncao() + "',"
                + "'" + fu.getLogin() + "',"
                + "'" + fu.getSenha() + "',"
                + "'" + fu.getAcessototal() + "',"
                + "'" + fu.getDataadmissao() + "')";

        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Update(Funcionario fu)
    {
        String sql = "UPDATE funcionario "
                + "set nome='" + fu.getNome() + "', "
                + "funcao='" + fu.getFuncao() + "', "
                + "login='" + fu.getLogin() + "', "
                + "senha='" + fu.getSenha() + "' "
                + " where codfuncionario=" + fu.getCodfuncionario();
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public boolean Delete(String codFunc)
    {
        String sql = "DELETE FROM funcionario where codfuncionario=" + codFunc;
        int linhas = conn.ExecuteUpdate(sql);
        return (linhas == 1 ? true : false);
    }

    public ArrayList<Funcionario> SelectAll()
    {
        ArrayList<Funcionario> todos = new ArrayList<Funcionario>();
        ResultSet rs = conn.ExecuteQuery("Select * from funcionario");
        try
        {
            while (rs.next())
            {
                int codFuncionario = rs.getInt("codFuncionario");
                String nome = rs.getString("nome");
                String funcao = rs.getString("funcao");
                String login = rs.getString("login");
                String senha = rs.getString("senha");

                Funcionario fu = new Funcionario(nome, funcao, login, senha);
                fu.setCodfuncionario(codFuncionario);
                todos.add(fu);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Funcionario> searchByNome(String Field, String Nome)
    {
        ArrayList<Funcionario> todos = new ArrayList<Funcionario>();
        ResultSet rs = conn.ExecuteQuery("Select * from funcionario where " + Field + " like '%" + Nome + "%'");
        try
        {
            while (rs.next())
            {
                int codFuncionario = rs.getInt("codFuncionario");
                String nome = rs.getString("nome");
                String funcao = rs.getString("funcao");
                String login = rs.getString("login");
                String senha = rs.getString("senha");

                Funcionario fu = new Funcionario(nome, funcao, login, senha);
                fu.setCodfuncionario(codFuncionario);
                todos.add(fu);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Funcionario> searchByCod(int Cod)
    {
        ArrayList<Funcionario> todos = new ArrayList<Funcionario>();
        ResultSet rs = conn.ExecuteQuery("Select * from funcionario where codFuncionario =" + Cod);
        try
        {
            while (rs.next())
            {
                int codFuncionario = rs.getInt("codFuncionario");
                String nome = rs.getString("nome");
                String funcao = rs.getString("funcao");
                String login = rs.getString("login");
                String senha = rs.getString("senha");

                Funcionario fu = new Funcionario(nome, funcao, login, senha);
                fu.setCodfuncionario(codFuncionario);
                todos.add(fu);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }

    public ArrayList<Funcionario> searchLogin(String Login, String Senha)
    {
        ArrayList<Funcionario> todos = new ArrayList<Funcionario>();
        ResultSet rs = conn.ExecuteQuery("Select * from funcionario where login ='" + Login + "' and senha ='" + Senha + "'");
        try
        {
            while (rs.next())
            {
                int codFuncionario = rs.getInt("codFuncionario");
                String nome = rs.getString("nome");
                String login = rs.getString("login");
                String funcao = rs.getString("funcao");
                String senha = rs.getString("senha");

                Funcionario fu = new Funcionario(nome, funcao, login, senha);
                fu.setCodfuncionario(codFuncionario);
                todos.add(fu);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return todos;
    }
}
