/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedores;

/**
 *
 * @author Paulo Silva
 */
public class Fornecedor
{

    private int codFornecedor;
    private String nome;
    private String morada;
    private String codPostal;
    private String email;
    private String nif;
    private String telefone;
    private String url;

    public Fornecedor()
    {
        this.codFornecedor = 0;
        this.codPostal = this.email = this.morada = this.nif = this.nome = this.telefone = this.url = "";
    }

    public Fornecedor(String nome, String morada, String codPostal,
            String email, String nif, String telefone, String url)
    {
        this.nome = nome;
        this.morada = morada;
        this.codPostal = codPostal;
        this.nif = nif;
        this.email = email;
        this.telefone = telefone;
        this.url = url;
    }

    /**
     * @return the codcliente
     */
    public int getcodFornecedor()
    {
        return codFornecedor;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setcodFornecedor(int codFornecedor)
    {
        this.codFornecedor = codFornecedor;
    }

    /**
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada()
    {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    /**
     * @return the codPostal
     */
    public String getCodPostal()
    {
        return codPostal;
    }

    /**
     * @param codPostal the codPostal to set
     */
    public void setCodPostal(String codPostal)
    {
        this.codPostal = codPostal;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the nif
     */
    public String getNif()
    {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif)
    {
        this.nif = nif;
    }

    /**
     * @return the telefone
     */
    public String getTelefone()
    {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    /**
     * @return the url
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return this.nome;
    }
}
