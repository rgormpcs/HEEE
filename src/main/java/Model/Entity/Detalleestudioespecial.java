/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "detalleestudioespecial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleestudioespecial.findAll", query = "SELECT d FROM Detalleestudioespecial d"),
    @NamedQuery(name = "Detalleestudioespecial.findByIddee", query = "SELECT d FROM Detalleestudioespecial d WHERE d.iddee = :iddee"),
    @NamedQuery(name = "Detalleestudioespecial.findByDescripcionmarcadordee", query = "SELECT d FROM Detalleestudioespecial d WHERE d.descripcionmarcadordee = :descripcionmarcadordee"),
    @NamedQuery(name = "Detalleestudioespecial.findByIdmarcadordee", query = "SELECT d FROM Detalleestudioespecial d WHERE d.idmarcadordee = :idmarcadordee")})
public class Detalleestudioespecial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddee")
    private Integer iddee;
    @Size(max = 50)
    @Column(name = "descripcionmarcadordee")
    private String descripcionmarcadordee;
    @Column(name = "idmarcadordee")
    private Integer idmarcadordee;
    @JoinColumn(name = "idcee", referencedColumnName = "idcee")
    @ManyToOne(optional = false)
    private Cabeceraestudioespecial idcee;
    @JoinColumn(name = "idmarcador", referencedColumnName = "idmarcador")
    @ManyToOne(optional = false)
    private Marcador idmarcador;

    public Detalleestudioespecial() {
    }

    public Detalleestudioespecial(Integer iddee) {
        this.iddee = iddee;
    }

    public Integer getIddee() {
        return iddee;
    }

    public void setIddee(Integer iddee) {
        this.iddee = iddee;
    }

    public String getDescripcionmarcadordee() {
        return descripcionmarcadordee;
    }

    public void setDescripcionmarcadordee(String descripcionmarcadordee) {
        this.descripcionmarcadordee = descripcionmarcadordee;
    }

    public Integer getIdmarcadordee() {
        return idmarcadordee;
    }

    public void setIdmarcadordee(Integer idmarcadordee) {
        this.idmarcadordee = idmarcadordee;
    }

    public Cabeceraestudioespecial getIdcee() {
        return idcee;
    }

    public void setIdcee(Cabeceraestudioespecial idcee) {
        this.idcee = idcee;
    }

    public Marcador getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(Marcador idmarcador) {
        this.idmarcador = idmarcador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddee != null ? iddee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleestudioespecial)) {
            return false;
        }
        Detalleestudioespecial other = (Detalleestudioespecial) object;
        if ((this.iddee == null && other.iddee != null) || (this.iddee != null && !this.iddee.equals(other.iddee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Detalleestudioespecial[ iddee=" + iddee + " ]";
    }
    
}
