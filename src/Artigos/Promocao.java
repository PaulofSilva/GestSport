/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

/**
 *
 * @author Paulo Silva
 */
public class Promocao
{

    private String codArtigo, descricao;
    private double preco;

    public Promocao()
    {
        this.codArtigo = "";
        this.descricao = "";
        this.preco = 0;
    }

    public Promocao(String codArtigo, String descricao, double preco)
    {
        this.codArtigo = codArtigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * @return the codArtigo
     */
    public String getCodArtigo()
    {
        return codArtigo;
    }

    /**
     * @param codArtigo the codArtigo to set
     */
    public void setCodArtigo(String codArtigo)
    {
        this.codArtigo = codArtigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao()
    {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
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
}
