/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

/**
 *
 * @author Paulo Silva
 */
public class Artigo
{

    private String codartigo;
    private String designacao;
    private double preco;
    private int stock;
    private int reserva;
    private int codFornecedor;
    
    public Artigo()
    {
        this.codartigo = "";
        this.designacao = "";
        this.preco = 0;
        this.stock = 0;
        this.reserva = 0;
        this.codFornecedor = 0;
    }    

    public Artigo(String codartigo, String designacao, double preco,
            int stock, int reserva, int codFornecedor)
    {
        this.codartigo = codartigo;
        this.designacao = designacao;
        this.preco = preco;
        this.stock = stock;
        this.reserva = reserva;
        this.codFornecedor = codFornecedor;
    }

    /**
     * @return the codartigo
     */
    public String getCodartigo()
    {
        return codartigo;
    }

    /**
     * @param codartigo the codartigo to set
     */
    public void setCodartigo(String codartigo)
    {
        this.codartigo = codartigo;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao()
    {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao)
    {
        this.designacao = designacao;
    }

    /**
     * @return the preco
     */
    public double getPreco()
    {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    /**
     * @return the stock
     */
    public int getStock()
    {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }

    /**
     * @return the reserva
     */
    public int getReserva()
    {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(int reserva)
    {
        this.reserva = reserva;
    }

    /**
     * @return the codFornecedor
     */
    public int getCodFornecedor()
    {
        return codFornecedor;
    }

    /**
     * @param codFornecedor the codFornecedor to set
     */
    public void setCodFornecedor(int codFornecedor)
    {
        this.codFornecedor = codFornecedor;
    }
    

}