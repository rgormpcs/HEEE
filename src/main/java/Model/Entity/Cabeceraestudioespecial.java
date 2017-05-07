/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "cabeceraestudioespecial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cabeceraestudioespecial.findAll", query = "SELECT c FROM Cabeceraestudioespecial c"),
    @NamedQuery(name = "Cabeceraestudioespecial.findByIdcee", query = "SELECT c FROM Cabeceraestudioespecial c WHERE c.idcee = :idcee"),
    @NamedQuery(name = "Cabeceraestudioespecial.findByNumestudiocee", query = "SELECT c FROM Cabeceraestudioespecial c WHERE c.numestudiocee = :numestudiocee"),
    @NamedQuery(name = "Cabeceraestudioespecial.findByDescripcionestudiocee", query = "SELECT c FROM Cabeceraestudioespecial c WHERE c.descripcionestudiocee = :descripcionestudiocee"),
    @NamedQuery(name = "Cabeceraestudioespecial.findByIddetallerecepcionmuestracee", query = "SELECT c FROM Cabeceraestudioespecial c WHERE c.iddetallerecepcionmuestracee = :iddetallerecepcionmuestracee")})
public class Cabeceraestudioespecial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcee")
    private Integer idcee;
    @Column(name = "numestudiocee")
    private Integer numestudiocee;
    @Size(max = 200)
    @Column(name = "descripcionestudiocee")
    private String descripcionestudiocee;
    @Column(name = "iddetallerecepcionmuestracee")
    private Integer iddetallerecepcionmuestracee;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcee")
    private List<Detalleestudioespecial> detalleestudioespecialList;

    public Cabeceraestudioespecial() {
    }

    public Cabeceraestudioespecial(Integer idcee) {
        this.idcee = idcee;
    }

    public Integer getIdcee() {
        return idcee;
    }

    public void setIdcee(Integer idcee) {
        this.idcee = idcee;
    }

    public Integer getNumestudiocee() {
        return numestudiocee;
    }

    public void setNumestudiocee(Integer numestudiocee) {
        this.numestudiocee = numestudiocee;
    }

    public String getDescripcionestudiocee() {
        return descripcionestudiocee;
    }

    public void setDescripcionestudiocee(String descripcionestudiocee) {
        this.descripcionestudiocee = descripcionestudiocee;
    }

    public Integer getIddetallerecepcionmuestracee() {
        return iddetallerecepcionmuestracee;
    }

    public void setIddetallerecepcionmuestracee(Integer iddetallerecepcionmuestracee) {
        this.iddetallerecepcionmuestracee = iddetallerecepcionmuestracee;
    }

    @XmlTransient
    public List<Detalleestudioespecial> getDetalleestudioespecialList() {
        return detalleestudioespecialList;
    }

    public void setDetalleestudioespecialList(List<Detalleestudioespecial> detalleestudioespecialList) {
        this.detalleestudioespecialList = detalleestudioespecialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcee != null ? idcee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabeceraestudioespecial)) {
            return false;
        }
        Cabeceraestudioespecial other = (Cabeceraestudioespecial) object;
        if ((this.idcee == null && other.idcee != null) || (this.idcee != null && !this.idcee.equals(other.idcee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Cabeceraestudioespecial[ idcee=" + idcee + " ]";
    }
    
}
