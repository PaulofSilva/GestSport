/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

/**
 *
 * @author Paulo Silva
 */
public class Iva
{
    private double iva;
    
    public Iva()
    {
        this.iva = 0;
    }
    
    public Iva(double iva)
    {
        this.iva = iva;
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
    
}
