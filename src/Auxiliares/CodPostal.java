/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

/**
 *
 * @author Paulo Silva
 */
public class CodPostal
{

    private String codPostal;
    private String localidade;
    private String cidade;

    public CodPostal()
    {
        this.codPostal = "";
        this.localidade = "";
        this.cidade = "";
    }

    public CodPostal(String codPostal, String localidade, String cidade)
    {
        this.codPostal = codPostal;
        this.localidade = localidade;
        this.cidade = cidade;
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
     * @return the loacalidade
     */
    public String getLocalidade()
    {
        return localidade;
    }

    /**
     * @param loacalidade the loacalidade to set
     */
    public void setLocalidade(String loacalidade)
    {
        this.localidade = loacalidade;
    }

    /**
     * @return the cidade
     */
    public String getCidade()
    {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
}
