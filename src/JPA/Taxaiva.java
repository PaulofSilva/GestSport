/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Paulo Silva
 */
@Entity
@Table(name = "taxaiva", catalog = "gestsport", schema = "")
@NamedQueries(
{
    @NamedQuery(name = "Taxaiva.findAll", query = "SELECT t FROM Taxaiva t"),
    @NamedQuery(name = "Taxaiva.findByIva", query = "SELECT t FROM Taxaiva t WHERE t.iva = :iva")
})
public class Taxaiva implements Serializable
{
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IVA")
    private BigDecimal iva;

    public Taxaiva()
    {
    }

    public Taxaiva(BigDecimal iva)
    {
        this.iva = iva;
    }

    public BigDecimal getIva()
    {
        return iva;
    }

    public void setIva(BigDecimal iva)
    {
        BigDecimal oldIva = this.iva;
        this.iva = iva;
        changeSupport.firePropertyChange("iva", oldIva, iva);
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (iva != null ? iva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taxaiva))
        {
            return false;
        }
        Taxaiva other = (Taxaiva) object;
        if ((this.iva == null && other.iva != null) || (this.iva != null && !this.iva.equals(other.iva)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "JPA.Taxaiva[ iva=" + iva + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
