/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Silva
 */
public class ConnectDB
{

    Connection connection;

    public Connection Open()
    {
        connection = null;
        try
        {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String url = "jdbc:mysql://" + Variaveis.server_name + "/" + Variaveis.database;

            connection = DriverManager.getConnection(url, Variaveis.username, Variaveis.password);
        } catch (SQLException ex)
        {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Base de Dados não encontrada", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex)
        {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Driver não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return connection;


    }

    public void Close()
    {
        try
        {
            connection.close();
        } catch (SQLException ex)
        {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao encerrar a connecção", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int ExecuteUpdate(String sql)
    {
        Connection con = Open();
        int res = 0;

        if (con != null)
        {
            try
            {
                Open();
                Statement st = con.createStatement();
                res = st.executeUpdate(sql);
                con.close();
            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando, " + ex.getMessage());
            }
        }

        return res;
    }

    public ResultSet ExecuteQuery(String sql)
    {
        Connection co = Open();
        ResultSet rs = null;

        if (co != null)
        {
            try
            {
                Statement st = co.createStatement();
                rs = st.executeQuery(sql);
            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando, " + ex.getMessage());
            }
        }
        return rs;
    }
}
