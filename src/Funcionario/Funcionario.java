/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import java.sql.Date;

/**
 *
 * @author Paulo Silva
 */
public class Funcionario
{

    private int codfuncionario;
    private String nome;
    private String funcao;
    private String login;
    private String senha;
    private boolean acessototal;
    private Date dataadmissao;

    public Funcionario()
    {
        java.util.Date hoje = new java.util.Date();
        String hj = String.format("%1$tY-%1$tm-%1$td", hoje);
        Date data = Date.valueOf(hj);

        this.codfuncionario = 0;
        this.nome = "";
        this.funcao = "";
        this.login = "";
        this.senha = "";
        this.dataadmissao = data;
        this.acessototal = true;
    }

    public Funcionario(String nome, String funcao, String login, String senha)
    {

        this.nome = nome;
        this.funcao = funcao;
        this.login = login;
        this.senha = senha;
    }

    /**
     * @return the codfuncionario
     */
    public int getCodfuncionario()
    {
        return codfuncionario;
    }

    /**
     * @param codfuncionario the codfuncionario to set
     */
    public void setCodfuncionario(int codfuncionario)
    {
        this.codfuncionario = codfuncionario;
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
     * @return the funcao
     */
    public String getFuncao()
    {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }

    /**
     * @return the login
     */
    public String getLogin()
    {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login)
    {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha()
    {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    /**
     * @return the acessototal
     */
    public boolean getAcessototal()
    {
        return isAcessototal();
    }

    /**
     * @param acessototal the acessototal to set
     */
    public void setAcessototal(boolean acessototal)
    {
        this.acessototal = acessototal;
    }

    /**
     * @return the dataadmissao
     */
    public Date getDataadmissao()
    {
        return dataadmissao;
    }

    /**
     * @param dataadmissao the dataadmissao to set
     */
    public void setDataadmissao(Date dataadmissao)
    {
        this.dataadmissao = dataadmissao;
    }

    @Override
    public String toString()
    {
        return this.getNome();
    }

    /**
     * @return the acessototal
     */
    public boolean isAcessototal()
    {
        return acessototal;
    }
}
