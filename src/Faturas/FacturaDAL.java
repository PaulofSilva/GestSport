/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faturas;

import Connect.ConnectDB;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class FacturaDAL
{

    ConnectDB conn;
    PreparedStatement pstm;
    ResultSet rs;
    String InserirCabFact = "INSERT INTO venda (codfuncionario, codcliente, datavenda, totalvenda) "
            + "VALUES (?,?,?,?)";
    String InserirLinhFact = "INSERT INTO vendalinha (numvenda, codartigo, iva, quant,"
            + " preco) VALUES (?, ?, ?, ?, ?)";
    String ultimavenda = "SELECT MAX(numvenda) FROM venda";
    String verificarStock = "SELECT stock FROM artigo WHERE (codartigo = ?)";
    String verificarPromo = "SELECT preco FROM promocao WHERE (codartigo = ?)";
    String actualizarStock = "UPDATE artigo SET stock = stock - ? WHERE (codartigo = ?)";
    
    //Analises de vendas
    String VendasFunc = "select v.codfuncionario,f.nome, sum(v.totalvenda) TotalVendas from venda v, funcionario f "
            + " where v.codfuncionario=f.codfuncionario and datavenda between ? and ? "
            + " group by v.codfuncionario,f.nome";
    
    String VendasCliente = "select v.codcliente, c.nome, sum(v.totalvenda) TotalVendas from venda v, cliente c "
            + "where v.codcliente=c.codcliente and datavenda between ? and ? "
            + "group by v.codcliente, c.nome";
    
    String ProdutosVendidos = "select l.codartigo, a.designacao, sum(l.preco) as Total "
            + "from vendalinha l, venda v, artigo a "
            + "where l.numvenda = v.numvenda and l.codartigo=a.codartigo and v.datavenda between ? and ? "
            + "group by l.codartigo, a.designacao";


    public FacturaDAL()
    {
        conn = new ConnectDB();
    }

    public int ultimoFact() throws SQLException
    {
        int ultimo = 0;
        rs = conn.ExecuteQuery(ultimavenda);

        if (rs.last())
        {
            ultimo = rs.getInt(1);
        }
        return ultimo;
    }

    public int verificarStock(String codigo)
    {
        int stock = -1;
        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(verificarStock);
            pstm.setString(1, codigo);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                stock = rs.getInt("stock");
            }
            conn.Close();
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return stock;
    }

    public double verificarPrecoPromo(String codigo)
    {
        double preco = 0;
        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(verificarPromo);
            pstm.setString(1, codigo);
            rs = pstm.executeQuery();

            while (rs.next())
            {
                preco = rs.getDouble("preco");
            }
            conn.Close();
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return preco;
    }

    public void InserirCabFact(int codFuncionario, int codCliente, Date data, double totalvenda)
    {

        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(InserirCabFact);
            pstm.setInt(1, codFuncionario);
            pstm.setInt(2, codCliente);
            pstm.setDate(3, data);
            pstm.setDouble(4, totalvenda);
            pstm.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public void InserirLinhas(int numVenda, String codArtigo, double iva, int quant, double preco)
    {

        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(InserirLinhFact);
            pstm.setInt(1, numVenda);
            pstm.setString(2, codArtigo);
            pstm.setDouble(3, iva);
            pstm.setInt(4, quant);
            pstm.setDouble(5, preco);
            pstm.executeUpdate();

        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public void actualizarStock(int stock, String codArtigo)
    {
        try
        {
            pstm = (PreparedStatement) conn.Open().prepareStatement(actualizarStock);
            pstm.setInt(1, stock);
            pstm.setString(2, codArtigo);
            pstm.executeUpdate();

        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Factura> VendasFunc(Date dataInicio, Date dataFim)
    {

        try
        {
            ArrayList<Factura> vendaFunc = new ArrayList<Factura>();
            pstm = (PreparedStatement) conn.Open().prepareStatement(VendasFunc);
            pstm.setDate(1, dataInicio);
            pstm.setDate(2, dataFim);

            rs = pstm.executeQuery();

            while (rs.next())
            {
                Factura nv = new Factura();
                nv.setCodFuncionario(rs.getInt(1));
                nv.setNomeCliente(rs.getString(2));
                nv.setTotal(rs.getDouble(3));

                vendaFunc.add(nv);
            }
            conn.Close();
            return vendaFunc;

        } catch (SQLException ex)
        {
        }
        return null;

    }
        public ArrayList<Factura> VendasProd(Date dataInicio, Date dataFim)
    {

        try
        {
            ArrayList<Factura> vendaFunc = new ArrayList<Factura>();
            pstm = (PreparedStatement) conn.Open().prepareStatement(ProdutosVendidos);
            pstm.setDate(1, dataInicio);
            pstm.setDate(2, dataFim);

            rs = pstm.executeQuery();

            while (rs.next())
            {
                Factura nv = new Factura();
                nv.setRef(rs.getString(1));
                nv.setNomeCliente(rs.getString(2));
                nv.setTotal(rs.getDouble(3));

                vendaFunc.add(nv);
            }
            conn.Close();
            return vendaFunc;

        } catch (SQLException ex)
        {
        }
        return null;

    }
}
