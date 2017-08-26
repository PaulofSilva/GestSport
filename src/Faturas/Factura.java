/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Faturas;

import java.util.Date;

/**
 *
 * @author Paulo Silva
 */
public class Factura
{
    //Cabeçalho da venda

    private Date dataVenda;
    private int numVenda;
    private int codcliente;
    private int codFuncionario;
    private String nomeCliente;
    private double total;
    private int mes;
    
    //Linhas da Venda
    private String ref;
    private int quant;
    private double preco;
    private double iva;


    public Factura()
    {
        this.dataVenda = new Date();
        this.numVenda = 0;
        this.codcliente = 0;
        this.nomeCliente = "";
        this.mes = 0;
        
        this.ref = "";
        this.quant = 0;
        this.preco = 0;
        this.iva = 0; 
        this.total = 0;        
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda()
    {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda)
    {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the numVenda
     */
    public int getNumVenda()
    {
        return numVenda;
    }

    /**
     * @param numVenda the numVenda to set
     */
    public void setNumVenda(int numVenda)
    {
        this.numVenda = numVenda;
    }

    /**
     * @return the codcliente
     */
    public int getCodcliente()
    {
        return codcliente;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setCodcliente(int codcliente)
    {
        this.codcliente = codcliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente()
    {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the ref
     */
    public String getRef()
    {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref)
    {
        this.ref = ref;
    }

    /**
     * @return the quant
     */
    public int getQuant()
    {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant)
    {
        this.quant = quant;
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
     * @return the iva
     */
    public double getIva()
    {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva)
    {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal()
    {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total)
    {
        this.total = total;
    }

    /**
     * @return the mes
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes)
    {
        this.mes = mes;
    }

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario()
    {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario)
    {
        this.codFuncionario = codFuncionario;
    }
}
